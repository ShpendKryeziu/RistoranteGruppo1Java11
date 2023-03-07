import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bevande {
    private String beverageName;
    private double beveragePrice;
    private static final Set<Bevande> tutteLeBevande = new HashSet<>();
    public Bevande (String name, double price) {
        this.setName(name);
        this.setPrice(price);
        tutteLeBevande.add(this);
    }
    public String getName() {
        return beverageName;
    }
    public void setName(String beverageName) {
        this.beverageName = beverageName;
    }
    public double getPrice() { return beveragePrice; }
    public void setPrice(double beveragePrice) {
        this.beveragePrice = beveragePrice;
    }
    public static Set<Bevande> getTutteLeBevande() {
        return tutteLeBevande;
    }

    @Override
    public String toString() {
        return beverageName + " - €" + beveragePrice;
    }
}
