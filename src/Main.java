import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println("|_-'-_| Ristorante Balkan Delish |_-'-_|");
        System.out.println("Chef: Burim Dulgheru");
        System.out.println("Cucina di carne");
        Menu menuDiCarne = new Menu();

        System.out.println(ANSI_CYAN_BACKGROUND + menuDiCarne.getBevandeList() + "\u001B[0m");
        System.out.println(ANSI_RED_BACKGROUND + menuDiCarne.getPrimiList() + "\u001B[0m");
        System.out.println(ANSI_GREEN_BACKGROUND + menuDiCarne.getSecondiList() + "\u001B[0m");
        System.out.println(ANSI_YELLOW_BACKGROUND + menuDiCarne.getDessertList() + "\u001B[0m");
        System.out.println("\u001B[31m" + menuDiCarne.prezzoMedio() + "\u001B[0m");
    }
}
