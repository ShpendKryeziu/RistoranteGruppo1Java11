package portate;
import enumerators.*;

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
        super(name, price, TipoPortataEnum.PRIMO);
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
        System.out.print(getName() + " --- €" + getPrice() + "\n" + TextStyleEnum.ANSI_GREY.getValue() + TextStyleEnum.ANSI_ITALIC.getValue() + " allergeni = " + TextStyleEnum.ANSI_RESET.getValue());
        for (AllergensEnum allergen : allergens) {
            System.out.print(TextStyleEnum.ANSI_GREY.getValue() + TextStyleEnum.ANSI_ITALIC.getValue() + allergen.getName() + "; " + TextStyleEnum.ANSI_RESET.getValue());
        }
        System.out.println();
    }

}
