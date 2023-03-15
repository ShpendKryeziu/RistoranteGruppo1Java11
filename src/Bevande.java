import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bevande extends Portate {
    private double capacity;
    public Bevande(String name, double price, double capacity) {
        super(name, price);
        setCapacity(capacity);
    }
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }
    @Override
    public void printInfo() {
        System.out.println(getName() + ", " + getCapacity() + "L" + " --- €" + getPrice());
    }

    //TODO il metodo to string non serve a stampare le info di un oggetto ma serve a stampare
    //la rappresentazione stringate dell'oggetto nell'area di memoria, oggetto@23344

}
