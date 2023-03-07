public class Main {
    public static void main(String[] args) {
        System.out.println("Le bevande sono: " + Bevande.getTutteLeBevande());
        Bevande acqua = new Bevande("Acqua", 1.5);
        Bevande pepsi = new Bevande("Pepsi", 3.5);
        Bevande leffe = new Bevande("Leffe 0.4", 5.5);
        Bevande bonator = new Bevande("Bonator 0.66", 6.5);
        Bevande raboso = new Bevande("Raboso", 3.0);
        Bevande cabernet = new Bevande("Cabernet 2017", 2.5);
        Bevande merlot = new Bevande("Merlot 2018", 3.5);
        Bevande moscato = new Bevande("Moscato 2021", 2.5);
        Bevande pinotGrigio = new Bevande("Pinot Grigio", 2.0);
        Bevande rượuThuốc = new Bevande("Rượu thuốc", 5.5);
        Bevande jägermeister = new Bevande("Jägermeister", 4.0);
        Bevande baileys = new Bevande("Baileys", 3.5);
        Bevande caffe = new Bevande("Caffè", 1.5);
    }
}
