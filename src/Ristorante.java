import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
}
