import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import enumerators.*;

/**
 * Classe Ristorante
 * È caratterizzato dai dati generali del ristorante.
 * Ogni ristorante ha una lista di menù, una mappa di Tavoli e una lista di Prenotazioni.
 * La classe possiede dei metodi per:
 * - stampare info sui Menu;
 * - metodo per prenotare;
 */
public class Ristorante {
    private String name;
    private String address;
    private Double rating;
    private List<Menu> listaMenu;
    private Map<Integer, Tavolo> mappaTavoli;
    private List<Prenotazione> listaPrenotazioni;

    public Ristorante(String name, String address) {
        this.name = name;
        this.address = address;
        this.listaMenu = new ArrayList<>();
        this.mappaTavoli = new HashMap<>();
        this.listaPrenotazioni = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Menu> getListaMenu() {
        return listaMenu;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void addMenu(Menu menu) {
        listaMenu.add(menu);
    }

    public void removeMenu(Menu menu) {
        listaMenu.remove(menu);
    }

    public void addTavolo(Tavolo tavolo) {
        mappaTavoli.put(tavolo.getId(), tavolo);
    }

    public void removeTavolo(Tavolo tavolo) {
        mappaTavoli.put(tavolo.getId(), tavolo);
    }

    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    /**
     * Questo metodo serve per richiedere al ristorante una lista di menu di una specifica tipologia (CARNE, PESCE, VEGANO
     * VEGETARIANO). Il metodo stampa direttamente la lista dei menu corrispondenti.
     *
     * @param tipo è la tipologia di menu (CARNE, VEGANO, ecc)
     */
    public void menuPerTipologia(TipologiaEnum tipo) {
        List<Menu> tempList = listaMenu.stream().filter(menu -> menu.getTipologia() == tipo).collect(Collectors.toList());
        Integer iterazioni = 0;
        if (tempList.isEmpty()) {
            System.out.println("Non c'è un menu che " + tipo.getDescrizione());
        } else {
            for (Menu menu : tempList) {
                System.out.println("Menu numero " + (iterazioni + 1) + "\n");
                menu.printMenu();
                System.out.println("\n");
            }
        }
    }

    /**
     * Questo metodo serve per stampare direttamente la lista menu del ristorante
     */
    public void printMenuList() {
        Integer iterazioni = 0;
        for (Menu menu : this.listaMenu) {
            System.out.println("Menu numero " + (iterazioni + 1) + "\n");
            menu.printMenu();
            System.out.println("\n");
        }
    }

    /**
     * da sistemare.
     * Ritorniamo una lista / mappa prenotazioni?
     * Metodo per vedere i tavoli prenotabili/liberi?
     */
    public void prenotaTavolo(Cliente cliente, Integer numeroPersone, FasciaOrariaEnum fasciaOraria) {
        boolean tavoloPrenotato = false; //metto false per poter poi uscire dal ciclo
        for (Tavolo tavolo : mappaTavoli.values()) {
            boolean conditionCapacity = (tavolo.getCapacity() > numeroPersone-1 && tavolo.getCapacity() < numeroPersone+1);
            boolean conditionFasciaOraria = tavolo.getFasceOrarie().contains(fasciaOraria);
            boolean conditionPrenotazione = conditionCapacity && conditionFasciaOraria;

            if (conditionPrenotazione) {
                Prenotazione prenotazione = new Prenotazione(cliente, this, tavolo, numeroPersone, fasciaOraria);
                cliente.addPrenotazione(prenotazione);
                listaPrenotazioni.add(prenotazione);
                System.out.println(cliente.getName() + " " + cliente.getSurname() + " ha prenotato per " + numeroPersone
                        + " al tavolo " + tavolo.getId());
                tavoloPrenotato = true; //setta come vero ed esce dal ciclo
                tavolo.removeFasciaOraria(fasciaOraria);
                System.out.println("Prenotazione effettuata!");
                break;
            }
        }
        //se a fine del ciclo tavoloPrenotato=false... allora stampa.
        if (tavoloPrenotato = false) {
            System.out.println("Non ci sono tavoli disponibili in questa fascia oraria." + "\n" +
                    "Si prega di riprovare.");
        }
    }

    public void printPrenotazioni() {
        for (Prenotazione prenotazione : listaPrenotazioni) {
            prenotazione.printInfo();
        }
    }
}
