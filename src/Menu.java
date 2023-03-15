import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Menu {

    private List<Portate> portate = new ArrayList<>();
    public List<Portate> getPortate() { return portate; }
    public void addPortata (Portate portata) { getPortate().add(portata); }
    public void removePortata (Portate portata) { getPortate().remove((portata)); }
    public void addPortate (Collection<Portate> portate) { getPortate().addAll(portate); }
    public List<Portate> getBevande() {
        List<Portate> bevande = new ArrayList<>();
        for (Portate bibita : getPortate()) {
            if (bibita instanceof Bevande) { bevande.add(bibita); }
        }
        return bevande;
    }
    public List<Portate> getPrimi() {
        List<Portate> primi = new ArrayList<>();
        for (Portate primo : getPortate()) {
            if (primo instanceof Bevande) { primi.add(primo); }
        }
        return primi;
    }
    public List<Portate> getSecondi() {
        List<Portate> secondi = new ArrayList<>();
        for (Portate secondo : getPortate()) {
            if (secondo instanceof Bevande) { secondi.add(secondo); }
        }
        return secondi;
    }
    public List<Portate> getDessert() {
        List<Portate> desserts = new ArrayList<>();
        for (Portate dessert : getPortate()) {
            if (dessert instanceof Bevande) { desserts.add(dessert); }
        }
        return desserts;
    }
    // TODO metodo per le medie
    // TODO metodi per i menù vegano e di pesce
    // TODO metodo stampa menù completo
    public double getMedia() {
        double sum = 0;
        for (Portate piatto : getPortate()) {
            sum += piatto.getPrice();
        }
        return sum/getPortate().size();
    }
}