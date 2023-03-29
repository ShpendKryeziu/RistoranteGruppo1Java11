public class Bevanda extends Portata {
    private double capacity;

    /**
     * Istanzia un oggetto di tipo bevanda, bibita, drink, o liquore, con parametri il nome della bevanda, il suo prezzo,
     * e la quantità contenuta nel bicchiere in Litri.
     * @param name
     * @param price
     * @param capacity
     */

    //TODO rifattorizzare
    public Bevanda(String name, double price, double capacity) {
        super(name, price, TipoPortata.BEVANDE.);
        this.capacity = capacity;
    }
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }

    /**
     * Stampa la descrizione della bevanda come nella classe padre, ma con aggiunta la quantità in Litri.
     * @return informazioni sulla bevanda
     */
    @Override
    public void printInfo() {
        System.out.println(getName() + ", " + getCapacity() + "L" + " --- €" + getPrice());
    }
}
