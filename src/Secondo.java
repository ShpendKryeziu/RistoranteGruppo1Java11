public class Secondo extends Portata {

    public Secondo(String name, double price, Tipologia tipologia) {super(name, price, tipologia);}

    @Override
    public String toString() {
        return getName() + " - €" + getPrice();
    }
}
