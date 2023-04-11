import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ristorante {
    private String name;
    private String address;
    private Double rating;
    private final List<Menu> listaMenu;

    public Ristorante (String name, String address) {
        this.name = name;
        this.address = address;
        this.listaMenu = new ArrayList<>();
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<Menu> getListaMenu() { return listaMenu; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }

    public void addMenu(Menu menu) { listaMenu.add(menu); }
    public void removeMenu(Menu menu) { listaMenu.remove(menu); }

    /**
     * Questo metodo serve per richiedere al ristorante una lista di menu di una specifica tipologia (CARNE, PESCE, VEGANO
     *      VEGETARIANO).
     * @param tipo è la tipologia di menu (CARNE, VEGANO, ecc)
     * @return una Lista di Menu presenti nella lista completa del ristorante che includono la tipologia richiesta
     */
    public List<Menu> menuPerTipologia (Tipologia tipo) {
        return listaMenu.stream().filter(menu -> menu.getTipologia() == tipo).collect(Collectors.toList());
    }

    /**
     * Questo metodo serve per stampare direttamente tutti i menu di una lista, senza dover ciclarli manualmente in main
     * @param listaMenu è una lista che può essere quella tornata da menuPerTipologia() o da getListaMenu()
     */
    public static void printMenuList(List<Menu> listaMenu) {
        Integer iterazioni = 0;
        for (Menu menu : listaMenu) {
            System.out.println("Menu numero " + (iterazioni+1) + "\n");
            menu.printMenu();
            System.out.println("\n");
        }
    }
}
