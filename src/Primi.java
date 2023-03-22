public class Primi extends Portata {

    public Primi(String name, double price, Tipologia tipologia) {
        super(name, price, tipologia);
    }
    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice());
    }
}
