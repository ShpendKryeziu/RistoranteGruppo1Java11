import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Menu {

    private List<Portate> portate = new ArrayList<>();


    // MEDIE
    // Ognuno fa la media della propria lista, il metodo è uguale, basta usare la propia lista e il proprio .getPrice()
    public double mediaCostoBevande() {
        double somma = 0;
        for (Bevande item : bevandeList) {
            somma += item.getPrice();
        }
        return somma / bevandeList.size();
    }
    public double mediaCostoPrimi() {
        double somma = 0;
        for (Primi item : primiList) {
            somma += item.getPricePrimo();
        }
        return somma / primiList.size();
    }
    public double mediaCostoSecondi() {
        double somma = 0;
        for(Secondi item : secondiList){
            somma += item.getPriceSecondo();
        }
        return somma / secondiList.size();
    }

    public double mediaCostoDessert() {
        double somma = 0;
        for (Dessert item : dessertList) {
           somma += item.getPrice();
        }
        return somma / dessertList.size();
    }

    // MEDIA FINALE
    public double prezzoMedio() {
        return mediaCostoBevande()+mediaCostoPrimi()+mediaCostoSecondi()+mediaCostoDessert(); // Qua sommiamo le altre medie
    }
}