public class Bevanda extends Portata {
    private Double capacity;

    // TODO va bene il tipo primitivo booelan
    private Boolean alcoholic;

    /**
     * Istanzia un oggetto di tipo bevanda, bibita, drink, o liquore, con parametri il nome della bevanda, il suo prezzo,
     * e la quantità contenuta nel bicchiere in Litri.
     * @param name
     * @param price
     * @param capacity
     * @param alcoholic
     */

    //TODO elimimiamo la tipologia dalla portata e la lasciamo solo nel menù
    public Bevanda(String name, Double price, Double capacity, Boolean alcoholic) {
        super(name, price, null, TipoPortata.BEVANDA);
        this.capacity = capacity;
        this.alcoholic = alcoholic;
    }
    public Double getCapacity() { return capacity; }
    public void setCapacity(Double capacity) { this.capacity = capacity; }
    public Boolean getAlcoholic() { return alcoholic; }
    public void setAlcoholic(Boolean alcoholic) { this.alcoholic = alcoholic; }

    /**
     * Stampa la descrizione della bevanda come nella classe padre, ma con aggiunta la quantità in Litri.
     * @return informazioni sulla bevanda
     */
    @Override
    public void printInfo() {
        System.out.println(getName() + ", " + getCapacity() + "L" + " --- €" + getPrice());
    }
}
