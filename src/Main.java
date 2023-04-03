import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String emoji_fire = "\uD83D\uDD25";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_ITALIC = "\u001B[3m";
    public static final String ANSI_GREY = "\u001B[90m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BRIGHT_WHITE = "\u001B[97m";
    public static final String ANSI_RED_FONT = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        // BEVANDE
        Bevanda acqua = new Bevanda("Acqua", 1.5, 0.75, false);
        Bevanda pepsi = new Bevanda("Pepsi", 3.5, 0.33, false);
        Bevanda leffe = new Bevanda("Leffe 0.4", 5.5, 0.4, true);
        Bevanda bonator = new Bevanda("Bonator 0.66", 6.5, 0.66, true);
        Bevanda raboso = new Bevanda("Raboso", 3.0, 0.15, true);
        Bevanda cabernet = new Bevanda("Cabernet 2017", 2.5, 0.15, true);
        Bevanda merlot = new Bevanda("Merlot 2018", 3.5, 0.15, true);
        Bevanda moscato = new Bevanda("Moscato 2021", 2.5, 0.15, true);
        Bevanda pinot = new Bevanda("Pinot Grigio", 2.0, 0.15, true);
        Bevanda ruou = new Bevanda("Rượu thuốc", 5.5, 0.02, true);
        Bevanda jagermeister = new Bevanda("Jägermeister", 4.0, 0.02, true);
        Bevanda baileys = new Bevanda("Baileys", 3.5, 0.05, true);


        // Dichiaro ed inizializzo allergeni

        ArrayList<String> papardelleAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE.getName(), Allergens.LATTOSIO.getName()));
        ArrayList<String> gnocchettiAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE.getName(), Allergens.LATTOSIO.getName(), Allergens.SEDANO.getName(), Allergens.AGLIO.getName()));
        ArrayList<String> moussakaAllergens = new ArrayList<>(Arrays.asList(Allergens.LATTOSIO.getName(),Allergens.UOVA.getName(),Allergens.GLUTINE.getName(), Allergens.CIPOLLA.getName(),Allergens.AGLIO.getName()));
        ArrayList<String> ravioliAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE.getName(), Allergens.LATTOSIO.getName(), Allergens.UOVA.getName(),Allergens.AGLIO.getName()));
        ArrayList<String> fagioliAllergens = new ArrayList<>(Arrays.asList(Allergens.SEDANO.getName(),Allergens.CIPOLLA.getName(), Allergens.AGLIO.getName()));
        ArrayList<String> canederliAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE.getName(),Allergens.LATTOSIO.getName(),Allergens.UOVA.getName(),Allergens.CIPOLLA.getName(),Allergens.AGLIO.getName()));
        ArrayList<String> tortelliniAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE.getName(),Allergens.UOVA.getName(),Allergens.AGLIO.getName(),Allergens.SEDANO.getName(),Allergens.CAROTE.getName(),Allergens.CIPOLLA.getName()));
        ArrayList<String> ciorbaAllergens = new ArrayList<>(Arrays.asList(Allergens.FRUMENTO.getName(),Allergens.GLUTINE.getName(),Allergens.CAROTE.getName(),Allergens.UOVA.getName(),Allergens.AGLIO.getName(),Allergens.CIPOLLA.getName()));
        ArrayList<Allergens> nocciolatoAllergens = new ArrayList<>(Arrays.asList(Allergens.GLUTINE, Allergens.CACAO, Allergens.NOCCIOLA));
        ArrayList<Allergens> semifreddoAllergens = new ArrayList<>(Arrays.asList());
        ArrayList<Allergens> salameCioccolatoAllergens = new ArrayList<>(Arrays.asList(Allergens.CACAO, Allergens.LATTOSIO));
        ArrayList<Allergens> pannaMirtilliLamponiAllergens = new ArrayList<>(Arrays.asList(Allergens.LATTOSIO));
        ArrayList<Allergens> cremaCatalanaAllergens = new ArrayList<>(Arrays.asList(Allergens.LATTOSIO));
        ArrayList<Allergens> zuccheroFilatoAllergens = new ArrayList<>(Arrays.asList());

        // PRIMI
        Primo pappardelleAlRaguDiCinghiale = new Primo("Pappardelle al ragù di Cinghiale",6.50, Tipologia.CARNE, papardelleAllergens );
        Primo gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni = new Primo("Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni",7.50, Tipologia.CARNE, gnocchettiAllergens);
        Primo moussaka = new Primo("Moussaka",6.50, Tipologia.CARNE, moussakaAllergens);
        Primo ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala = new Primo("Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala",11.00, Tipologia.CARNE, ravioliAllergens);
        Primo fagioliConCostineAffumicate = new Primo("Fagioli con costine affumicate",7.50, Tipologia.CARNE, fagioliAllergens);
        Primo canederliAllaTirolese = new Primo("Canederli alla tirolese",9.50, Tipologia.CARNE, canederliAllergens);
        Primo tortelliniInBrodoDiCappone = new Primo("Tortellini in brodo di Cappone",12.00, Tipologia.CARNE, tortelliniAllergens);
        Primo ciorbaDiCapraTransilvana = new Primo("Ciorba di Capra transilvana",10.00, Tipologia.CARNE, ciorbaAllergens);

        // SECONDI
        Secondo cervelloFrittoDiCapraMontana = new Secondo("Cervello fritto di Capra montana", 12.50, Tipologia.CARNE);
        Secondo fegatelliDiAironeGrigioDeiBalcani = new Secondo("Fegatelli di Airone grigio dei Balcani", 11.50, Tipologia.CARNE);
        Secondo piottinoDiCinghialeNonSelvaticoAllaVodka = new Secondo("Piottino di Cinghiale non selvatico alla vodka", 9.50, Tipologia.CARNE);
        Secondo linguaDiYakBrasata = new Secondo("Lingua di Yak brasata", 16.80, Tipologia.CARNE);
        Secondo budiniDiSangueDiMaialeAllevatoAlloStatoBrado = new Secondo("Budini di sangue di Maiale allevato allo stato brado", 18.00, Tipologia.CARNE);

        // DESSERT
        Dessert nocciolatoCaramellato = new Dessert("Nocciolato Caramellato", 4.00, 20, false, true, 10, nocciolatoAllergens);
        Dessert semifreddoAlLimone = new Dessert("Semifreddo al Limone", 5.50, 50, true, true, 5, semifreddoAllergens);
        Dessert salameAlCioccolatoConBacche = new Dessert("Salame al cioccolato con bacche",7.00, 80, false, true, 15, salameCioccolatoAllergens);
        Dessert pannaFattaInCasaConMirtilliELamponi = new Dessert("Panna fatta in casa con Mirtilli e Lamponi",13.00, 45, false, true, 0, pannaMirtilliLamponiAllergens);
        Dessert cremaCatalana = new Dessert("Crema Catalana",8.00, 70, false, false, 0, cremaCatalanaAllergens);
        Dessert zuccheroFilato = new Dessert("Zucchero filato",14.00, 99, true, false, 0, zuccheroFilatoAllergens);

        // NOSTRO MENU
        Menu menuCompleto = new Menu("Balkan Delish", "Burim Dulgheru", Tipologia.CARNE, "Cucina di Carne in Stile Balcanico");
        menuCompleto.addPortate(Arrays.asList(acqua,pepsi,leffe,bonator,raboso,cabernet,merlot,moscato,pinot,ruou,jagermeister,baileys));
        menuCompleto.addPortate(Arrays.asList(nocciolatoCaramellato,semifreddoAlLimone,salameAlCioccolatoConBacche,pannaFattaInCasaConMirtilliELamponi,cremaCatalana,zuccheroFilato));
        menuCompleto.addPortate(Arrays.asList(pappardelleAlRaguDiCinghiale,gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni, moussaka, ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala,fagioliConCostineAffumicate,canederliAllaTirolese,tortelliniInBrodoDiCappone,ciorbaDiCapraTransilvana));
        menuCompleto.addPortate(Arrays.asList(cervelloFrittoDiCapraMontana,fegatelliDiAironeGrigioDeiBalcani,piottinoDiCinghialeNonSelvaticoAllaVodka,linguaDiYakBrasata,budiniDiSangueDiMaialeAllevatoAlloStatoBrado));

        menuCompleto.printMenu();
    }
}
