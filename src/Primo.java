import java.util.ArrayList;

public class Primo extends Portata {

    //TODO dobbiamo puntare a lavorare sempre con strutture ad ogetti ad alto livello: no int ma Integer no Array ma arraylist
    private ArrayList<Allergens> allergens;

    /**
     * Crea un nuovo oggetto di tipo primo
     *
     * @param name      il nome del primo
     * @param price     il costo del primo
     * @param tipologia il tipo di dieta (di carne/vegano/pesce o bevanda)
     * @param allergens la presenza di allergeni
     */
    public Primo(String name, Double price, Tipologia tipologia, ArrayList<Allergens> allergens) {
        super(name, price, tipologia, TipoPortata.PRIMO);
        this.allergens = allergens;
    }

    // Getters
    public ArrayList<Allergens> getAllergens() {
        return allergens;
    }

    //Setters
    public void setAllergens(ArrayList<Allergens> allergens) {
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
        for (Allergens allergen : allergens) {
            System.out.print(Main.ANSI_GREY + Main.ANSI_ITALIC + allergen + " " + Main.ANSI_RESET);
        }
        System.out.println();
    }

}
