import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("|_-'-_| Menù di Carne |_-'-_|");

        //DESSERT
        Dessert sangueDiCervoCaramellato = new Dessert("Sangue di Cervo caramellato", 4.00);
        Dessert semifreddoDiOcchiDiLince = new Dessert("Semifreddo di occhi di Lince", 5.50);
        Dessert budelloDiCaprioloAlCioccolato = new Dessert("Budello di Capriolo al cioccolato",7.00);
        Dessert cervellaDOrsoAlMirtillo = new Dessert("Cervella d'Orso al mirtillo",13.00);
        Dessert cremaCatalanaSuTeschioDiTasso = new Dessert("Crema Catalana su teschio di Tasso",8.00);
        Dessert zuccheroFilatoSuPeroneDiPuma = new Dessert("Zucchero filato su perone di Puma",14.00);

        //PRIMI
        Primi pappardelleAlRaguDiCinghiale = new Primi("Pappardelle al ragù di Cinghiale",6.5);
        Primi gnocchettiAlRisoNeroConCarpaccioDiVitelloCrudoEPeperoni = new Primi("Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni",7.50);
        Primi moussaka = new Primi("Moussaka",4.50);
        Primi ravioliDiPastaFrescaConRipienoDiVitelloCaprinoEMarsala = new Primi("Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala",11.00);
        Primi fagioliConCostineAffumicate = new Primi("Fagioli con costine affumicate",7.50);
        Primi canederliAllaTirolese = new Primi("Canederli alla tirolese",9.50);
        Primi tortelliniInBrodoDiCappone = new Primi("Tortellini in brodo di Cappone",12.00);
        Primi ciorbaDiCapraTransilvanaAllaSgarbi = new Primi("Ciorba di Capra transilvana alla Sgarbi",10.00);
    }
}
