public class Primo extends Portata {

    public Primo(String name, double price, Tipologia tipologia) {
        super(name, price, tipologia);
    }
    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice());
    }
}
