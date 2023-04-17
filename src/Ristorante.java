import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ristorante {
    private String name;
    private String address;
    private Double rating;
    private final List<Menu> listaMenu;
    private final Map<Integer, Tavolo> mappaTavoli;

    public Ristorante (String name, String address) {
        this.name = name;
        this.address = address;
        this.listaMenu = new ArrayList<>();
        this.mappaTavoli = new HashMap<>();
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<Menu> getListaMenu() { return listaMenu; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }

    public void addMenu(Menu menu) { listaMenu.add(menu); }
    public void removeMenu(Menu menu) { listaMenu.remove(menu); }

    public void addTavolo(Tavolo tavolo) { mappaTavoli.put(tavolo.getID(),tavolo); }
    public void removeTavolo(Tavolo tavolo) { mappaTavoli.put(tavolo.getID(), tavolo); }

    /**
     * Questo metodo serve per richiedere al ristorante una lista di menu di una specifica tipologia (CARNE, PESCE, VEGANO
     *      VEGETARIANO). Il metodo stampa direttamente la lista dei menu corrispondenti.
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
            System.out.println("Menu numero " + (iterazioni+1) + "\n");
            menu.printMenu();
            System.out.println("\n");
        }
    }

    public enum fasciaOrariaENUM{
        FASCIA_ORARIA1("18.30-20.00"),
        FASCIA_ORARIA2("20.00 - 21.30"),
        FASCIA_ORARIA3("21.30 - 23.00");
        String fasciaOraria;
        fasciaOrariaENUM(String fasciaOraria) {this.fasciaOraria = fasciaOraria;}
        public String getFasciaOraria() {return fasciaOraria;}
        public void setFasciaOraria(String fasciaOraria) {this.fasciaOraria = fasciaOraria;}
    }


    /** da sistemare.
     * Ritorniamo una lista / mappa prenotazioni?
     * Metodo per vedere i tavoli prenotabili/liberi?
     */
    public void prenotaTavolo(Cliente cliente, Integer numeroPersone, fasciaOrariaENUM fasciaOraria){
        Tavolo tavoloPrenotato = null;
        for (Tavolo tavolo : mappaTavoli.values()){
        if (tavolo.getCapacity().equals(numeroPersone)) {
            tavoloPrenotato = tavolo;
            switch (fasciaOraria) {
                case FASCIA_ORARIA1 : if(tavolo.getFasciaOraria1().equals(true)) {tavolo.setFasciaOraria1(false);};
                case FASCIA_ORARIA2 : if(tavolo.getFasciaOraria2().equals(true)) {tavolo.setFasciaOraria2(false);}
                case FASCIA_ORARIA3 : if(tavolo.getFasciaOraria3().equals(true)) {tavolo.setFasciaOraria3(false);}
                }
                break;
            }
        }
        System.out.println(cliente.getName() + " " + cliente.getSurname() + " ha prenotato per " + numeroPersone
        + " al tavolo " + tavoloPrenotato.getID());
    }
}
