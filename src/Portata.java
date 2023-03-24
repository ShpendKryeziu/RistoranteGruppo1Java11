public abstract class Portata {

    //TODO le classi si chiamano sempre al singolare
    //TODO inserire javadoc su tutte le classi
    private String name;
    private double price;
    private Tipologia tipologia;

    /**
     *Imposta una portata che abbia un nome, un prezzo e una tipologia dietologica.
     * @param name
     * @param price
     * @param tipologia
     */

    public Portata(String name, double price, Tipologia tipologia) {
        this.name = name;
        this.price = price;
        this.tipologia = tipologia;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Tipologia getTipologia() {
        return tipologia;
    }
    public void setTipologia(Tipologia tipologia) { this.tipologia = tipologia; }
    /**
     * Stampa la portata in console come fosse in un menù.
     * @return la descrizione della portata
     */
    public void printInfo() { System.out.println(getName() + " --- €" + getPrice()); }
}
