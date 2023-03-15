import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RED_FONT = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        // BEVANDE
        Bevande acqua = new Bevande("Acqua", 1.5, 0.75);
        Bevande pepsi = new Bevande("Pepsi", 3.5, 0.33);
        Bevande leffe = new Bevande("Leffe 0.4", 5.5, 0.4);
        Bevande bonator = new Bevande("Bonator 0.66", 6.5, 0.66);
        Bevande raboso = new Bevande("Raboso", 3.0, 0.15);
        Bevande cabernet = new Bevande("Cabernet 2017", 2.5, 0.15);
        Bevande merlot = new Bevande("Merlot 2018", 3.5, 0.15);
        Bevande moscato = new Bevande("Moscato 2021", 2.5, 0.15);
        Bevande pinot = new Bevande("Pinot Grigio", 2.0, 0.15);
        Bevande ruou = new Bevande("Rượu thuốc", 5.5, 0.02);
        Bevande jagermeister = new Bevande("Jägermeister", 4.0, 0.02);
        Bevande baileys = new Bevande("Baileys", 3.5, 0.05);


        // PRIMI
        Primi pappardelleAlRaguDiCinghiale = new Primi("Pappardelle al ragù di Cinghiale",6.5, Tipologia.CARNE);
        Primi gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni = new Primi("Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni",7.50, Tipologia.CARNE);
        Primi moussaka = new Primi("Moussaka",4.50, Tipologia.CARNE);
        Primi ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala = new Primi("Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala",11.00, Tipologia.CARNE);
        Primi fagioliConCostineAffumicate = new Primi("Fagioli con costine affumicate",7.50, Tipologia.CARNE);
        Primi canederliAllaTirolese = new Primi("Canederli alla tirolese",9.50, Tipologia.CARNE);
        Primi tortelliniInBrodoDiCappone = new Primi("Tortellini in brodo di Cappone",12.00, Tipologia.CARNE);
        Primi ciorbaDiCapraTransilvanaAllaSgarbi = new Primi("Ciorba di Capra transilvana alla Sgarbi",10.00, Tipologia.CARNE);


        // SECONDI
        Secondi cervelloFrittoDiCapraMontana = new Secondi("Cervello fritto di Capra montana", 12.50);
        Secondi fegatelliDiAironeGrigioDeiBalcani = new Secondi("Fegatelli di Airone grigio dei Balcani", 11.50);
        Secondi piottinoDiCinghialeNonSelvaticoAllaVodka = new Secondi("Piottino di Cinghiale non selvatico alla vodka", 9.50);
        Secondi linguaDiYakBrasata = new Secondi("Lingua di Yak brasata", 16.80);
        Secondi budiniDiSangueDiMaialeAllevatoAlloStatoBrado = new Secondi("Budini di sangue di Maiale allevato allo stato brado", 18.00);


        // DESSERT
        Dessert sangueDiCervoCaramellato = new Dessert("Sangue di Cervo caramellato", 4.00);
        Dessert semifreddoDiOcchiDiLince = new Dessert("Semifreddo di occhi di Lince", 5.50);
        Dessert budelloDiCaprioloAlCioccolato = new Dessert("Budello di Capriolo al cioccolato",7.00);
        Dessert cervellaDOrsoAlMirtillo = new Dessert("Cervella d'Orso al mirtillo",13.00);
        Dessert cremaCatalanaSuTeschioDiTasso = new Dessert("Crema Catalana su teschio di Tasso",8.00);
        Dessert zuccheroFilatoSuPeroneDiPuma = new Dessert("Zucchero filato su perone di Puma",14.00);


        System.out.println("|_-'-_| Ristorante Balkan Delish |_-'-_|");
        System.out.println("Chef: Burim Dulgheru");
        System.out.println("Cucina di carne");
        Menu menuDiCarne = new Menu();
        menuDiCarne.addPortate(Arrays.asList(acqua,pepsi,leffe,bonator,raboso,cabernet,merlot,moscato,pinot,ruou,jagermeister,baileys));
        System.out.println(menuDiCarne.getPortate());

        //TODO tutte le varie portate saranno aggiunte a un unica lista che poi avrà il suo metodo di stampa in menù

/*        System.out.println(ANSI_CYAN_BACKGROUND + menuDiCarne.stampaMenù() + ANSI_RESET);

        System.out.println(ANSI_RED_FONT + menuDiCarne.prezzoMedio() + ANSI_RESET);*/
    }
}
