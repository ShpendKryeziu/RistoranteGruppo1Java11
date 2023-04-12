import java.util.ArrayList;
import java.util.Arrays;

public class Main {

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

        ArrayList<AllergensEnum> papardelleAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE, AllergensEnum.LATTE));
        ArrayList<AllergensEnum> gnocchettiAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE, AllergensEnum.LATTE, AllergensEnum.SEDANO, AllergensEnum.SENAPE));
        ArrayList<AllergensEnum> moussakaAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.LATTE,AllergensEnum.UOVA,AllergensEnum.GLUTINE, AllergensEnum.SESAMO,AllergensEnum.SENAPE));
        ArrayList<AllergensEnum> ravioliAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE, AllergensEnum.LATTE, AllergensEnum.UOVA,AllergensEnum.SENAPE));
        ArrayList<AllergensEnum> fagioliAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.SEDANO,AllergensEnum.SESAMO, AllergensEnum.SENAPE));
        ArrayList<AllergensEnum> canederliAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE,AllergensEnum.LATTE,AllergensEnum.UOVA,AllergensEnum.SESAMO,AllergensEnum.SENAPE));
        ArrayList<AllergensEnum> tortelliniAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE,AllergensEnum.UOVA,AllergensEnum.SENAPE,AllergensEnum.SEDANO,AllergensEnum.LUPINI,AllergensEnum.SESAMO));
        ArrayList<AllergensEnum> ciorbaAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE,AllergensEnum.LUPINI,AllergensEnum.UOVA,AllergensEnum.SENAPE,AllergensEnum.SESAMO));
        ArrayList<AllergensEnum> nocciolatoAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.GLUTINE, AllergensEnum.ARACHIDI, AllergensEnum.FRUTTAGUSCIO));
        ArrayList<AllergensEnum> semifreddoAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.LATTE));
        ArrayList<AllergensEnum> salameCioccolatoAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.ARACHIDI, AllergensEnum.LATTE));
        ArrayList<AllergensEnum> pannaMirtilliLamponiAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.LATTE));
        ArrayList<AllergensEnum> cremaCatalanaAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.LATTE));
        ArrayList<AllergensEnum> zuccheroFilatoAllergens = new ArrayList<>(Arrays.asList(AllergensEnum.FRUTTAGUSCIO));

        // PRIMI
        Primo pappardelleAlRaguDiCinghiale = new Primo("Pappardelle al ragù di Cinghiale",6.50, papardelleAllergens );
        Primo gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni = new Primo("Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni",7.50, gnocchettiAllergens);
        Primo moussaka = new Primo("Moussaka",6.50, moussakaAllergens);
        Primo ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala = new Primo("Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala",11.00, ravioliAllergens);
        Primo fagioliConCostineAffumicate = new Primo("Fagioli con costine affumicate",7.50, fagioliAllergens);
        Primo canederliAllaTirolese = new Primo("Canederli alla tirolese",9.50, canederliAllergens);
        Primo tortelliniInBrodoDiCappone = new Primo("Tortellini in brodo di Cappone",12.00, tortelliniAllergens);
        Primo ciorbaDiCapraTransilvana = new Primo("Ciorba di Capra transilvana",10.00, ciorbaAllergens);

        // SECONDI
        Secondo cervelloFrittoDiCapraMontana = new Secondo("Cervello fritto di Capra montana", 12.50);
        Secondo fegatelliDiAironeGrigioDeiBalcani = new Secondo("Fegatelli di Airone grigio dei Balcani", 11.50);
        Secondo piottinoDiCinghialeNonSelvaticoAllaVodka = new Secondo("Piottino di Cinghiale non selvatico alla vodka", 9.50);
        Secondo linguaDiYakBrasata = new Secondo("Lingua di Yak brasata", 16.80);
        Secondo budiniDiSangueDiMaialeAllevatoAlloStatoBrado = new Secondo("Budini di sangue di Maiale allevato allo stato brado", 18.00);

        // DESSERT
        Dessert nocciolatoCaramellato = new Dessert("Nocciolato Caramellato", 4.00, 20, false, 10, nocciolatoAllergens);
        Dessert semifreddoAlLimone = new Dessert("Semifreddo al Limone", 5.50, 50, true, 5, semifreddoAllergens);
        Dessert salameAlCioccolatoConBacche = new Dessert("Salame al cioccolato con bacche",7.00, 80, false,  15, salameCioccolatoAllergens);
        Dessert pannaFattaInCasaConMirtilliELamponi = new Dessert("Panna fatta in casa con Mirtilli e Lamponi",13.00, 45, false, 0, pannaMirtilliLamponiAllergens);
        Dessert cremaCatalana = new Dessert("Crema Catalana",8.00, 70, false,  0, cremaCatalanaAllergens);
        Dessert zuccheroFilato = new Dessert("Zucchero filato",14.00, 99, true, 0, zuccheroFilatoAllergens);

        // NOSTRO RISTORANTE CON MENU
        Ristorante ristoranteGruppo1 = new Ristorante("Eccellenza Balcanica", "Via Olimpo 69, Sofia");
        Menu menuCompleto = new Menu("Balkan Delish", "Burim Dulgheru", Tipologia.CARNE, "Cucina di Carne in Stile Balcanico");
        ristoranteGruppo1.addMenu(menuCompleto);
        menuCompleto.addPortate(Arrays.asList(acqua,pepsi,leffe,bonator,raboso,cabernet,merlot,moscato,pinot,ruou,jagermeister,baileys));
        menuCompleto.addPortate(Arrays.asList(nocciolatoCaramellato,semifreddoAlLimone,salameAlCioccolatoConBacche,pannaFattaInCasaConMirtilliELamponi,cremaCatalana,zuccheroFilato));
        menuCompleto.addPortate(Arrays.asList(pappardelleAlRaguDiCinghiale,gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni, moussaka, ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala,fagioliConCostineAffumicate,canederliAllaTirolese,tortelliniInBrodoDiCappone,ciorbaDiCapraTransilvana));
        menuCompleto.addPortate(Arrays.asList(cervelloFrittoDiCapraMontana,fegatelliDiAironeGrigioDeiBalcani,piottinoDiCinghialeNonSelvaticoAllaVodka,linguaDiYakBrasata,budiniDiSangueDiMaialeAllevatoAlloStatoBrado));

        //menuCompleto.printMenu();
        ristoranteGruppo1.printMenuList();
        System.out.println("Prezzo Medio Menu Completo (NO BEVANDE) = " + menuCompleto.averagePrice() + " Euri");
    }
}
