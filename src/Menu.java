import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Menu {
    // BEVANDE
    Bevande acqua = new Bevande("Acqua", 1.5);
    Bevande pepsi = new Bevande("Pepsi", 3.5);
    Bevande leffe = new Bevande("Leffe 0.4", 5.5);
    Bevande bonator = new Bevande("Bonator 0.66", 6.5);
    Bevande raboso = new Bevande("Raboso", 3.0);
    Bevande cabernet = new Bevande("Cabernet 2017", 2.5);
    Bevande merlot = new Bevande("Merlot 2018", 3.5);
    Bevande moscato = new Bevande("Moscato 2021", 2.5);
    Bevande pinot = new Bevande("Pinot Grigio", 2.0);
    Bevande ruou = new Bevande("Rượu thuốc", 5.5);
    Bevande jagermeister = new Bevande("Jägermeister", 4.0);
    Bevande baileys = new Bevande("Baileys", 3.5);
    private List<Bevande> bevandeList = new ArrayList<>(Arrays.asList(acqua,pepsi,leffe,bonator,raboso,cabernet,merlot,moscato,pinot,ruou,jagermeister,baileys));
    public List<Bevande> getBevandeList() {return bevandeList;}
    public void addBevanda (Bevande bibita) {bevandeList.add(bibita);}
    public void removeBevanda (Bevande bibita) {bevandeList.remove(bibita);}

    // PRIMI
    Primi pappardelleAlRaguDiCinghiale = new Primi("Pappardelle al ragù di Cinghiale",6.5);
    Primi gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni = new Primi("Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni",7.50);
    Primi moussaka = new Primi("Moussaka",4.50);
    Primi ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala = new Primi("Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala",11.00);
    Primi fagioliConCostineAffumicate = new Primi("Fagioli con costine affumicate",7.50);
    Primi canederliAllaTirolese = new Primi("Canederli alla tirolese",9.50);
    Primi tortelliniInBrodoDiCappone = new Primi("Tortellini in brodo di Cappone",12.00);
    Primi ciorbaDiCapraTransilvanaAllaSgarbi = new Primi("Ciorba di Capra transilvana alla Sgarbi",10.00);
    private List<Primi> primiList = new ArrayList<>(Arrays.asList(pappardelleAlRaguDiCinghiale,gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni,moussaka,
            ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala,fagioliConCostineAffumicate,canederliAllaTirolese,tortelliniInBrodoDiCappone,ciorbaDiCapraTransilvanaAllaSgarbi));
    public List<Primi> getPrimiList() {return primiList;}
    private void addPrimo (Primi primo) {primiList.add(primo);}
    private void removePrimo (Primi primo) {primiList.remove(primo);}

    // SECONDI


    // DESSERT
    Dessert sangueDiCervoCaramellato = new Dessert("Sangue di Cervo caramellato", 4.00);
    Dessert semifreddoDiOcchiDiLince = new Dessert("Semifreddo di occhi di Lince", 5.50);
    Dessert budelloDiCaprioloAlCioccolato = new Dessert("Budello di Capriolo al cioccolato",7.00);
    Dessert cervellaDOrsoAlMirtillo = new Dessert("Cervella d'Orso al mirtillo",13.00);
    Dessert cremaCatalanaSuTeschioDiTasso = new Dessert("Crema Catalana su teschio di Tasso",8.00);
    Dessert zuccheroFilatoSuPeroneDiPuma = new Dessert("Zucchero filato su perone di Puma",14.00);
    private List<Dessert> dessertList = new ArrayList<>(Arrays.asList(sangueDiCervoCaramellato,semifreddoDiOcchiDiLince,budelloDiCaprioloAlCioccolato,cervellaDOrsoAlMirtillo,
            cremaCatalanaSuTeschioDiTasso,zuccheroFilatoSuPeroneDiPuma));
    public List<Dessert> getDessertList() {return dessertList;}
    public void addDessert (Dessert dolce) {dessertList.add(dolce);}
    public void removeDessert (Dessert dolce) {dessertList.remove(dolce);}

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
    public double mediaCostoDessert() {
        double somma = 0;
        for (Dessert item : dessertList) {
           somma += item.getPrice();
        }
        return somma / dessertList.size();
    }

    // MEDIA FINALE
    public double prezzoMedio() {
        return mediaCostoBevande()+mediaCostoPrimi()+mediaCostoDessert(); // Qua sommiamo le altre medie
    }
}