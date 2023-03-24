import java.util.Arrays;

public class Primo extends Portata {

    private String[] allergens;
    public Primo(String name, double price, Tipologia tipologia,String[] allergens) {
        super(name, price, tipologia);
        this.allergens = allergens;
    }

    public String[] getAllergens(){
        return allergens;
    }
    public void setAllergens(String[] allergens) {
        this.allergens = allergens;
    }

@Override
public void printInfo() {
    System.out.print(getName() + " --- €" + getPrice() + "\n"+Main.ANSI_GREY +Main.ANSI_ITALIC + " allergeni = " + Main.ANSI_RESET);
    for (String allergen : allergens) {
        System.out.print(Main.ANSI_GREY+Main.ANSI_ITALIC + allergen + " "+ Main.ANSI_RESET);
    }
    System.out.println();
}

}
