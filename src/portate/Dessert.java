package portate;

import enumerators.*;

import java.util.ArrayList;

/**
 * Classe Dessert.
 * Serve per creare gli oggetti dessert!
 */

public class Dessert extends Portata {
    private Integer glycemicIndex;
    private boolean coloranti;
    private Integer calories;
    private ArrayList<AllergensEnum> allergens;

    /**
     * Crea un nuovo oggetto di tipo Cibo.Dessert
     * @param name il nome del Cibo.Dessert
     * @param price il costo del Cibo.Dessert
     * @param glycemicIndex l'indice glicemico di Cibo.Dessert.
     * @param coloranti presenza di coloranti.
     * @param calories numero di calorie.
     * @param allergens presenza di relativa lista di allergeni.
     */

    public Dessert(String name, Double price, Integer glycemicIndex, boolean coloranti,
            Integer calories, ArrayList<AllergensEnum> allergens) {
        super(name, price, TipoPortataEnum.DESSERT);
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
        System.out.print(getName() + " --- €" + getPrice() + "\n" + TextStyleEnum.ANSI_GREY.getValue() + TextStyleEnum.ANSI_ITALIC.getValue() + " allergeni = " + TextStyleEnum.ANSI_RESET.getValue());
        for (AllergensEnum allergen : allergens) {
            System.out.print(TextStyleEnum.ANSI_GREY.getValue() + TextStyleEnum.ANSI_ITALIC.getValue() + allergen.getName() + "; " + TextStyleEnum.ANSI_RESET.getValue());
        }
        System.out.println();
    }
}
