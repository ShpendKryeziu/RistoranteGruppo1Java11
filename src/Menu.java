import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Menu {
    private String restaurantName;
    private String chefName;
    private String description;
    private Tipologia tipologia;
    private List<Portata> listaPortata;

    /**
     * Crea un oggetto Menu che ha come parametri il nome del ristorante e dello chef e il tipo di dieta
     *
     * @param name        il nome del ristorante
     * @param chef        il nome dello chef
     * @param description specifica la tipologia dietologica del menù
     */

    public Menu(String name, String chef, Tipologia tipologia, String description) {
        this.restaurantName = name;
        this.chefName = chef;
        this.tipologia = tipologia;
        this.description = description;
        //TODO inizializzare tutto sempre nel costruttore, best pratica
        this.listaPortata = new ArrayList<>();
    }

    //Getters and Setters
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Portata> getPortate() {
        return listaPortata;
    }

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public void addPortate(Collection<Portata> portata) {
        listaPortata.addAll(portata);
    }

    // TODO metodi per i menù vegano e di pesce

    /***
     * Stampa il menu con il nome del ristorante e dello chef e tutte le portate divise per categoria + un messaggio finale
     */

    public void printMenu() {
        System.out.println(TextStyle.ANSI_RED_BACKGROUND.getValue() +
                TextStyle.EMOJY_FIRE + TextStyle.ANSI_BOLD + TextStyle.ANSI_BLACK + getRestaurantName() +
                TextStyle.EMOJY_FIRE + TextStyle.ANSI_RESET + "\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        listaPortata.stream().filter(primo -> primo.getTipoPortata() == TipoPortata.PRIMO).forEach(primo -> primo.printInfo());
        System.out.println("\n SECONDI \n");
        listaPortata.stream().filter(secondo -> secondo.getTipoPortata() == TipoPortata.SECONDO).forEach(secondo -> secondo.printInfo());
        System.out.println("\n DESSERT \n");
        listaPortata.stream().filter(dessert -> dessert.getTipoPortata() == TipoPortata.DESSERT).forEach(dessert -> dessert.printInfo());
        System.out.println("\n BEVANDE \n");
        listaPortata.stream().filter(bevanda -> bevanda.getTipoPortata() == TipoPortata.BEVANDA).forEach(bevanda -> bevanda.printInfo());
        System.out.println("\n BUON APPETITO!!!");
    }

    /**
     * Genera un prezzo medio dell'intero menù escludendo le bevande.
     *
     * @return un Double arrotondato all'intero più basso
     */
    public Double averagePrice() {
        Long platesCount = listaPortata.stream().filter(p -> p.getTipoPortata() != TipoPortata.BEVANDA).count();
        Double totalPrice = listaPortata.stream().filter(p -> p.getTipoPortata() != TipoPortata.BEVANDA).mapToDouble(Portata::getPrice).sum();
        return Math.floor(totalPrice / platesCount);
    }
}