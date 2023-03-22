import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Menu {
    private String restaurantName;
    private String chefName;
    private String description;
    private List<Portata> listaPortata;

    public Menu (String name, String chef, String description) {
        this.restaurantName = name;
        this.chefName = chef;
        this.description = description;
    }
    public List<Portata> getPortate() { return listaPortata; }
    public void addPortata (Portata portata) { listaPortata.add(portata); }
    public void removePortata (Portata portata) { listaPortata.remove((portata)); }
    public void addPortate (Collection<Portata> portata) { listaPortata.addAll(portata); }

    //TODO ma cosa vi importa di fare un metodo per ogni tipo quando vuoi inserite il menù in modo sequenziale
    //perchè non facciamo un meotdo unico visto che sono tutti uguali, perchè non usiamo una sola lista?
    //perchè il getter ha una logica quando deve solo tornare il valore?
    public List<Portata> getBevande() {
        List<Portata> bevande = new ArrayList<>();
        for (Portata bibita : getPortate()) {
            if (bibita instanceof Bevanda) { bevande.add(bibita); }
        } return bevande; }
    public List<Portata> getPrimi() {
        List<Portata> primi = new ArrayList<>();
        for (Portata primo : getPortate()) {
            if (primo instanceof Primo) { primi.add(primo); }
        } return primi; }

    public List<Portata> getSecondi() {
        List<Portata> secondi = new ArrayList<>();
        for (Portata secondo : getPortate()) {
            if (secondo instanceof Secondo) { secondi.add(secondo); }
        } return secondi; }

    public List<Portata> getDessert() {
        List<Portata> desserts = new ArrayList<>();
        for (Portata dessert : getPortate()) {
            if (dessert instanceof Dessert) { desserts.add(dessert); }
        } return desserts; }

    // TODO metodi per i menù vegano e di pesce

    public double getMedia() {
        double sumBevande = 0;
        for (Portata bevanda : getBevande()) {sumBevande += bevanda.getPrice();}
        double sumPrimi = 0;
        for (Portata primo : getPrimi()) {sumPrimi += primo.getPrice();}
        double sumSecondi = 0;
        for (Portata secondo : getSecondi()) {sumSecondi += secondo.getPrice();}
        double sumDessert = 0;
        for (Portata dessert : getDessert()) {sumDessert += dessert.getPrice();}
        return sumBevande/getBevande().size() + sumPrimi/getPrimi().size() + sumSecondi/getSecondi().size() +
                sumDessert/getDessert().size();
    }

    public void printMenu(){
        System.out.println(Main.ANSI_RED_BACKGROUND +Main.emoji_fire+Main.ANSI_BOLD+ Main.ANSI_BLACK +  getRestaurantName() +Main.emoji_fire+ Main.ANSI_RESET +"\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        for (Portata primo : getPrimi()){primo.printInfo();}
        System.out.println("\n SECONDI \n");
        for (Portata secondo : getSecondi()){secondo.printInfo();}
        System.out.println("\n DESSERT \n");
        for (Portata dessert : getDessert()){dessert.printInfo();}
        System.out.println("\n BEVANDE \n");
        for (Portata bevande : getBevande()){bevande.printInfo();}
        System.out.println("\n BUON APPETITO!!!");
        }

    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }
    public String getChefName() { return chefName; }
    public void setChefName(String chefName) { this.chefName = chefName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}