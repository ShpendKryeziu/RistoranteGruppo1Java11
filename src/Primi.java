import java.util.Set;
import java.util.HashSet;

public class Primi {
    private String namePrimo;
    private double pricePrimo;

    public Primi(String namePrimo, double pricePrimo) {
        this.namePrimo = namePrimo;
        this.pricePrimo = pricePrimo;
    }
    public String getNamePrimo() {
        return namePrimo;
    }
    public double getPricePrimo() {
        return pricePrimo;
    }
    public void setNamePrimo(String namePrimo) {
        this.namePrimo = namePrimo;
    }
    public void setPricePrimo(double pricePrimo) {
        this.pricePrimo = pricePrimo;
    }
    @Override
    public String toString() {
        return namePrimo + " - €" + pricePrimo;
    }
}
