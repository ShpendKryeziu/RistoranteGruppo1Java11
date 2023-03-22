import java.util.HashSet;
import java.util.Set;

public class Dessert extends Portate {
    private int highGlycemicIndex;
    public int getHighGlycemicIndex() {return highGlycemicIndex;}
    public void setHighGlycemicIndex(int highGlycemicIndex) {
        if (highGlycemicIndex>100 || highGlycemicIndex<0) {
            throw new IllegalArgumentException("ERRORE: Glycemic Index value must be between 0 and 100");
        } else {this.highGlycemicIndex = highGlycemicIndex;}}

    public Dessert(String name, double price, int highGlycemicIndex, Tipologia tipologia) {
        super(name, price, tipologia);
        setHighGlycemicIndex(highGlycemicIndex);
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getHighGlycemicIndex());
    }
}
