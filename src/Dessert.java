import java.util.ArrayList;
import java.util.Date;

public class Dessert extends Portata {
    private Integer glycemicIndex;
    private boolean coloranti;
    private Integer calories;
    private ArrayList<AllergensEnum> allergens;



    /**
     * Crea un nuovo oggetto di tipo Dessert
     * @param name il nome del Dessert
     * @param price il costo del Dessert
     * @param glycemicIndex l'indice glicemico di Dessert.
     * @param coloranti presenza di coloranti.
     * @param calories numero di calorie.
     * @param allergens presenza di relativa lista di allergeni.
     */

    public Dessert(String name, Double price, Integer glycemicIndex, boolean coloranti,
            Integer calories, ArrayList<AllergensEnum> allergens) {
        super(name, price, TipoPortata.DESSERT);
        this.glycemicIndex = glycemicIndex;
        this.coloranti = coloranti;
        this.calories = calories;
        this.allergens = allergens;
    }

    public Integer getGlycemicIndex() {return glycemicIndex;}
    public void setGlycemicIndex(Integer glycemicIndex) {this.glycemicIndex = glycemicIndex;}

    public boolean getColoranti() {return coloranti;}
    public void setColoranti(boolean coloranti) {this.coloranti = coloranti;}

    public Integer getCalories() {return calories;}
    public void setCalories(Integer calories) {this.calories = calories;}




    @Override
    public void printInfo() {
        System.out.print(getName() + " --- €" + getPrice() + "\n" + Main.ANSI_GREY + Main.ANSI_ITALIC + " allergeni = " + Main.ANSI_RESET);
        for (AllergensEnum allergen : allergens) {
            System.out.print(Main.ANSI_GREY + Main.ANSI_ITALIC + allergen.getName() + "; " + Main.ANSI_RESET);
        }
        System.out.println();
    }
}
