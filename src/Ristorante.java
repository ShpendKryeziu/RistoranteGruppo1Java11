import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ristorante {
    private String name;
    private String address;
    private Double rating;
    private List<Menu> listaMenu;

    //TODO parliamone
    public Ristorante (String name, String address, List<Menu> lista) {
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

    //TODO add menù metodi
    public void addPortata(Menu menu) { listaMenu.add(menu); }
    public void removePortata(Menu menu) { listaMenu.remove(menu); }
}
