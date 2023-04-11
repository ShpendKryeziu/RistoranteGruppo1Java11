import java.util.ArrayList;

public class Primo extends Portata {

    private ArrayList<AllergensEnum> allergens;

    /**
     * Crea un nuovo oggetto di tipo primo
     *
     * @param name      il nome del primo
     * @param price     il costo del primo
     * @param allergens la presenza di allergeni
     */
    public Primo(String name, Double price, ArrayList<AllergensEnum> allergens) {
        super(name, price, TipoPortata.PRIMO);
        this.allergens = allergens;
    }

    // Getters
    public ArrayList<AllergensEnum> getAllergens() {
        return allergens;
    }

    //Setters
    public void setAllergens(ArrayList<AllergensEnum> allergens) {
        this.allergens = allergens;
    }

    /**
     * Stampa la descrizione del primo come nella classe padre, ma con l'aggiunta dei allergeni in una riga sottostante in stile italico e di colore grigio.
     *
     * @return info sul primo
     */

    @Override
    public void printInfo() {
        System.out.print(getName() + " --- €" + getPrice() + "\n" + Main.ANSI_GREY + Main.ANSI_ITALIC + " allergeni = " + Main.ANSI_RESET);
        for (AllergensEnum allergen : allergens) {
            System.out.print(Main.ANSI_GREY + Main.ANSI_ITALIC + allergen.getName() + "; " + Main.ANSI_RESET);
        }
        System.out.println();
    }

}
