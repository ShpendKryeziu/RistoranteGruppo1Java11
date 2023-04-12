import java.util.ArrayList;
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
     *      VEGETARIANO). Il metodo stampa direttamente la lista dei menu corrispondenti.
     * @param tipo è la tipologia di menu (CARNE, VEGANO, ecc)
     */
    public void menuPerTipologia(TipologiaEnum tipo) {
        List<Menu> tempList = listaMenu.stream().filter(menu -> menu.getTipologia() == tipo).collect(Collectors.toList());
        Integer iterazioni = 0;
        if (tempList.isEmpty()) {
            System.out.println("Non c'è un menu che " + tipo.getDescrizione());
        } else {
            for (Menu menu : tempList) {
                System.out.println("Menu numero " + (iterazioni + 1) + "\n");
                menu.printMenu();
                System.out.println("\n");
            }
        }
    }

    /**
     * Questo metodo serve per stampare direttamente la lista menu del ristorante
     */
    public void printMenuList() {
        Integer iterazioni = 0;
        for (Menu menu : this.listaMenu) {
            System.out.println("Menu numero " + (iterazioni+1) + "\n");
            menu.printMenu();
            System.out.println("\n");
        }
    }
}
