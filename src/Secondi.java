public class Secondi extends Portata {

    public Secondi(String name, double price, Tipologia tipologia) {super(name, price, tipologia);}

    @Override
    public String toString() {
        return getName() + " - €" + getPrice();
    }
}
