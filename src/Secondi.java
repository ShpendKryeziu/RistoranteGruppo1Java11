public class Secondi extends Portate {

    public Secondi(String name, double price, Tipologia tipologia) {super(name, price, tipologia);}

    @Override
    public String toString() {
        return getName() + " - €" + getPrice();
    }
}
