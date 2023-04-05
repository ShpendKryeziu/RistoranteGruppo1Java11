public class Secondo extends Portata {

    //TODO sistamare
    public Secondo(String name, double price) { super(name, price, TipoPortata.SECONDO); }

    @Override
    public String toString() {
        return getName() + " - €" + getPrice();
    }
}
