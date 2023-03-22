import java.util.Set;
import java.util.HashSet;

public class Primi extends Portate{

    public Primi(String name, double price, Tipologia tipologia) {
        super(name, price, tipologia);
    }
    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice());
    }
}
