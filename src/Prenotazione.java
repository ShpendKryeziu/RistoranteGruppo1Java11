/**
 * Prenotazione:
 * classe comprendente i field cliente, ristorante, tavolo, numero di persone e fascia oraria.
 * Gli oggetti prenotazione verranno utilizzati dai metodi per creare e gestire prenotazioni.
 */
public class Prenotazione {
    private Cliente cliente;
    private Ristorante ristorante;
    private Tavolo tavolo;
    private Integer numeroDiPersone;
    private Ristorante.fasciaOrariaEnum fasciaOraria;

    public Prenotazione (Cliente cliente, Ristorante ristorante, Tavolo tavolo, Integer numeroDiPersone,
        Ristorante.fasciaOrariaEnum fasciaOraria) {
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
    public Ristorante.fasciaOrariaEnum getFasciaOraria() {
        return fasciaOraria;
    }
    public void setFasciaOraria(Ristorante.fasciaOrariaEnum fasciaOraria) {
        this.fasciaOraria = fasciaOraria;
    }

    public void printInfo() {
        System.out.println(cliente.getName() + " " + cliente.getSurname() + " prenota per " + numeroDiPersone + " in " + ristorante.getName() +
                ", alle " + fasciaOraria.getFasciaOraria());
    }
}
