package portate;

import enumerators.*;

/**
 * Classe Bevanda.
 * Per dissetarsi.
 */
public class Bevanda extends Portata {
    private Double capacity;
    private boolean alcoholic;

    /**
     * Istanzia un oggetto di tipo bevanda, bibita, drink, o liquore, con parametri il nome della bevanda, il suo prezzo,
     * e la quantità contenuta nel bicchiere in Litri.
     * @param name
     * @param price
     * @param capacity
     * @param alcoholic
     */

    public Bevanda(String name, Double price, Double capacity, boolean alcoholic) {
        super(name, price, TipoPortataEnum.BEVANDA);
        this.capacity = capacity;
        this.alcoholic = alcoholic;
    }
    public Double getCapacity() { return capacity; }
    public void setCapacity(Double capacity) { this.capacity = capacity; }
    public boolean getAlcoholic() { return alcoholic; }
    public void setAlcoholic(boolean alcoholic) { this.alcoholic = alcoholic; }

    /**
     * Stampa la descrizione della bevanda come nella classe padre, ma con aggiunta la quantità in Litri.
     * @return informazioni sulla bevanda
     */
    @Override
    public void printInfo() {
        System.out.println(getName() + ", " + this.capacity + "L" + " --- €" + getPrice());
    }
}
