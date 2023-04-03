public class Secondo extends Portata {

    //TODO sistamare
    public Secondo(String name, double price, Tipologia tipologia) { super(name, price, tipologia, TipoPortata.SECONDO); }

    @Override
    public String toString() {
        return getName() + " - €" + getPrice();
    }
}
