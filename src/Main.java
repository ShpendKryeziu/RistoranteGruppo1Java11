import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("|_-'-_| Ristorante Balkan Delish |_-'-_|");
        System.out.println("Chef: Burim Dulgheru");
        System.out.println("Cucina di carne");
        Menu menuDiCarne = new Menu();
        menuDiCarne.prezzoMedio();

        System.out.println(menuDiCarne.getBevandeList());
        System.out.println(menuDiCarne.getPrimiList());
        System.out.println(menuDiCarne.getSecondiList());
        System.out.println(menuDiCarne.getDessertList());
    }
}
