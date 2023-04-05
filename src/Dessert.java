import java.util.ArrayList;
import java.util.Date;

public class Dessert extends Portata {
    private Integer glycemicIndex;
    private boolean coloranti;
    private boolean bigSizeAvailability;
    private Integer tempoDiScongelamentoInMin;
    private ArrayList<Allergens> allergens;



    /**
     * Crea un nuovo oggetto di tipo Dessert
     * @param name il nome del Dessert
     * @param price il costo del Dessert
     * @param glycemicIndex l'indice glicemico di Dessert.
     */

    public Dessert(String name, Double price, Integer glycemicIndex, boolean coloranti, boolean bigSizeAvailability,
                   Integer tempoDiScongelamentoInMin, ArrayList<Allergens> allergens) {
        super(name, price, TipoPortata.DESSERT);
        this.glycemicIndex = glycemicIndex;
        this.coloranti = coloranti;
        this.bigSizeAvailability = bigSizeAvailability;
        this.tempoDiScongelamentoInMin = tempoDiScongelamentoInMin;
        this.allergens = allergens;
    }

    public Integer getGlycemicIndex() {return glycemicIndex;}
    public void setGlycemicIndex(Integer glycemicIndex) {this.glycemicIndex = glycemicIndex;}

    public boolean getColoranti() {return coloranti;}
    public void setColoranti(boolean coloranti) {this.coloranti = coloranti;}

    public boolean getBigSizeAvailability() {return bigSizeAvailability;}
    public void setBigSizeAvailability(boolean bigSizeAvailability) {this.bigSizeAvailability = bigSizeAvailability;}

    public Integer getTempoDiScongelamentoInMin() {return tempoDiScongelamentoInMin;}
    public void setTempoDiScongelamentoInMin(Integer tempoDiScongelamentoInMin) {this.tempoDiScongelamentoInMin = tempoDiScongelamentoInMin;}




    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getGlycemicIndex() +
                ". Big size availability = " + getBigSizeAvailability() + ". Presenza Coloranti =" + getColoranti() +
                ". Tempo di Scongelamento in Minuti = " + getTempoDiScongelamentoInMin() + " min.");
    }
}
