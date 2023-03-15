import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bevande {
    private String beverageName;
    private double beveragePrice;
    public Bevande(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }
    public String getName() {
        return beverageName;
    }
    public void setName(String beverageName) {
        this.beverageName = beverageName;
    }
    public double getPrice() {
        return beveragePrice;
    }
    public void setPrice(double beveragePrice) {
        this.beveragePrice = beveragePrice;
    }

    //TODO il metodo to string non serve a stampare le info di un oggetto ma serve a stampare
    //la rappresentazione stringate dell'oggetto nell'area di memoria, oggetto@23344
    @Override
    public String toString() {
        return beverageName + " - €" + beveragePrice;
    }
}
