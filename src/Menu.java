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
        } return bevande; }
    public List<Portate> getPrimi() {
        List<Portate> primi = new ArrayList<>();
        for (Portate primo : getPortate()) {
            if (primo instanceof Primi) { primi.add(primo); }
        } return primi; }

    public List<Portate> getSecondi() {
        List<Portate> secondi = new ArrayList<>();
        for (Portate secondo : getPortate()) {
            if (secondo instanceof Secondi) { secondi.add(secondo); }
        } return secondi; }

    public List<Portate> getDessert() {
        List<Portate> desserts = new ArrayList<>();
        for (Portate dessert : getPortate()) {
            if (dessert instanceof Dessert) { desserts.add(dessert); }
        } return desserts; }

    // TODO metodo per le medie
    // TODO metodi per i menù vegano e di pesce
    // TODO metodo stampa menù completo
    public double getMedia() {
        double sumBevande = 0;
        for (Portate bevanda : getBevande()) {sumBevande += bevanda.getPrice();}
        double sumPrimi = 0;
        for (Portate primo : getPrimi()) {sumPrimi += primo.getPrice();}
        double sumSecondi = 0;
        for (Portate secondo : getSecondi()) {sumSecondi += secondo.getPrice();}
        double sumDessert = 0;
        for (Portate dessert : getDessert()) {sumDessert += dessert.getPrice();}
        return sumBevande/getBevande().size() + sumPrimi/getPrimi().size() + sumSecondi/getSecondi().size() +
                sumDessert/getDessert().size();
    }

    public void printMenu(){
        System.out.println("\n PRIMI \n");
        for (Portate primo : getPrimi()){primo.printInfo();}
        System.out.println("\n SECONDI \n");
        for (Portate secondo : getSecondi()){secondo.printInfo();}
        System.out.println("\n DESSERT \n");
        for (Portate dessert : getDessert()){dessert.printInfo();}
        System.out.println("\n BEVANDE \n");
        for (Portate bevande : getDessert()){bevande.printInfo();}
        System.out.println("\n BUON APPETITO!!!");
        }
    }