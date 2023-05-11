package gestione_prenotazione; /**
 * gestione_prenotazione.Prenotazione:
 * classe comprendente i field cliente, ristorante, tavolo, numero di persone e fascia oraria.
 * Gli oggetti prenotazione verranno utilizzati dai metodi per creare e gestire prenotazioni.
 */

import enumerators.*;
import gestione_prenotazione.Cliente;
import gestione_prenotazione.Ristorante;
import gestione_prenotazione.Tavolo;

/**
 * Classe gestione_prenotazione.Prenotazione
 * Comprende il cliente, il ristorante il tavolo, il numero di persone prenotate e una fascia oraria!
 */

public class Prenotazione {
    private Cliente cliente;
    private Ristorante ristorante;
    private Tavolo tavolo;
    private Integer numeroDiPersone;
    private FasciaOrariaEnum fasciaOraria;

    /**
     *
     * Crea un oggetto gestione_prenotazione.Prenotazione con parametri cliente, ristorante, tavolo, numeroDiPersone e fascia oraria!
     *
     * @param cliente           il nome del cliente
     * @param ristorante        il nome del ristorante
     * @param tavolo            il numero del tavolo
     * @param numeroDiPersone   il numero di persone prenotate
     * @param fasciaOraria      la fascia oraria della prenotazione
     */

    public Prenotazione(Cliente cliente, Ristorante ristorante, Tavolo tavolo, Integer numeroDiPersone,
                        FasciaOrariaEnum fasciaOraria) {
        this.cliente = cliente;
        this.ristorante = ristorante;
        this.tavolo = tavolo;
        this.numeroDiPersone = numeroDiPersone;
        this.fasciaOraria = fasciaOraria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ristorante getRistorante() {
        return ristorante;
    }

    public void setRistorante(Ristorante ristorante) {
        this.ristorante = ristorante;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public Integer getNumeroDiPersone() {
        return numeroDiPersone;
    }

    public void setNumeroDiPersone(Integer numeroDiPersone) {
        this.numeroDiPersone = numeroDiPersone;
    }

    public FasciaOrariaEnum getFasciaOraria() {
        return fasciaOraria;
    }

    public void setFasciaOraria(FasciaOrariaEnum fasciaOraria) {
        this.fasciaOraria = fasciaOraria;
    }

    /**
     * Stampa informazioni sulla prenotazione come: nome e cognome del cliente, il numero di persone per cui si prenota, il nome del ristorante e la fascia oraria!
     */

    public void printInfo() {
        System.out.println(cliente.getName() + " " + cliente.getSurname() + " prenota per " + numeroDiPersone + " in "
                + ristorante.getName() + ", alle " + fasciaOraria.getFasciaOraria());
    }
}
