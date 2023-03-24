import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Menu {
    private String restaurantName;
    private String chefName;
    private String description;
    private List<Portata> listaPortata = new ArrayList<>();

    public Menu(String name, String chef, String description) {
        this.restaurantName = name;
        this.chefName = chef;
        this.description = description;
    }

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
        listaPortata.remove((portata));
    }

    public void addPortate(Collection<Portata> portata) {
        listaPortata.addAll(portata);
    }

    public List<Portata> getPortataByCategory(Class category) {
        List<Portata> categoryList = new ArrayList<>();
        if (category.equals(Bevanda.class)) {
            for (Portata portata : getPortate()) {
                if (portata instanceof Bevanda) {
                    categoryList.add(portata);
                }
            }
        } else if (category.equals(Primo.class)) {
            for (Portata portata : getPortate()) {
                if (portata instanceof Primo) {
                    categoryList.add(portata);
                }
            }
        } else if (category.equals(Secondo.class)) {
            for (Portata portata : getPortate()) {
                if (portata instanceof Secondo) {
                    categoryList.add(portata);
                }
            }
        } else if (category.equals(Dessert.class)) {
            for (Portata portata : getPortate()) {
                if (portata instanceof Dessert) {
                    categoryList.add(portata);
                }
            }
        }
        return categoryList;
    }

    // TODO metodi per i menù vegano e di pesce


    public void printMenu() {
        System.out.println(Main.ANSI_RED_BACKGROUND + Main.emoji_fire + Main.ANSI_BOLD + Main.ANSI_BLACK + getRestaurantName() + Main.emoji_fire + Main.ANSI_RESET + "\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        for (Portata primo : getPortataByCategory(Primo.class)) {
            primo.printInfo();
        }

        System.out.println("\n SECONDI \n");
        for (Portata secondo : getPortataByCategory(Secondo.class)) {
            secondo.printInfo();
        }
        System.out.println("\n DESSERT \n");
        for (Portata dessert : getPortataByCategory(Dessert.class)) {
            dessert.printInfo();
        }
        System.out.println("\n BEVANDE \n");
        for (Portata bevande : getPortataByCategory(Bevanda.class)) {
            bevande.printInfo();
        }
        System.out.println("\n BUON APPETITO!!!");
    }


}

