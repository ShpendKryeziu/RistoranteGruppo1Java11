package portate;

import enumerators.*;

import java.util.ArrayList;
/**
 * Classe Secondo
 * Crea secondi piatti
 */
public class Secondo extends Portata {

    private ArrayList<AllergensEnum> allergens;

    /**
     * Crea un nuovo oggetto di tipo Cibo.Primo
     *
     * @param name      il nome del piatto
     * @param price     il costo del piatto
     * @param allergens la presenza di allergeni
     */
    public Secondo(String name, double price, ArrayList<AllergensEnum> allergens) {
        super(name, price, TipoPortataEnum.SECONDO);
        this.allergens = allergens;
    }
    public ArrayList<AllergensEnum> getAllergens() {
        return allergens;
    }

    /**
     * Stampa info del secondo dalla classe portata con la lista di allergeni.
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
