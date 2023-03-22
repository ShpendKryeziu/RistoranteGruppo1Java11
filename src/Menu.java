import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Menu {
    private String restaurantName;
    private String chefName;
    private String description;
    private List<Portate> portate;

    public Menu (String name, String chef, String description, List<Portate> portate) {
        setRestaurantName(name);
        setChefName(chef);
        setDescription(description);
        //TODO riguardare per capire il tutto, parlatene e prendete una decisione
        this.portate = portate;
    }
    public List<Portate> getPortate() { return portate; }
    public void addPortata (Portate portata) { getPortate().add(portata); }
    public void removePortata (Portate portata) { getPortate().remove((portata)); }

    //TODO cancellare
    public void addPortate (Collection<Portate> portate) {
        portate.addAll(portate);
    }

    //TODO ma cosa vi importa di fare un metodo per ogni tipo quando vuoi inserite il menù in modo sequenziale
    //perchè non facciamo un meotdo unico visto che sono tutti uguali, perchè non usiamo una sola lista?
    //perchè il getter ha una logica quando deve solo tornare il valore?
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
        System.out.println(Main.ANSI_RED_BACKGROUND +Main.emoji_fire+Main.ANSI_BOLD+ Main.ANSI_BLACK +  getRestaurantName() +Main.emoji_fire+ Main.ANSI_RESET +"\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        for (Portate primo : getPrimi()){primo.printInfo();}
        System.out.println("\n SECONDI \n");
        for (Portate secondo : getSecondi()){secondo.printInfo();}
        System.out.println("\n DESSERT \n");
        for (Portate dessert : getDessert()){dessert.printInfo();}
        System.out.println("\n BEVANDE \n");
        for (Portate bevande : getBevande()){bevande.printInfo();}
        System.out.println("\n BUON APPETITO!!!");
        }

    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }
    public String getChefName() { return chefName; }
    public void setChefName(String chefName) { this.chefName = chefName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}