public abstract class Portata {

    private String name;
    private Double price;
    private TipoPortataEnum tipoPortata;

    /**
     *Imposta una portata che abbia un nome, un prezzo e una tipologia dietologica.
     * @param name
     * @param price
     */

    public Portata(String name, Double price, TipoPortataEnum portata) {
        this.name = name;
        this.price = price;
        this.tipoPortata = portata;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public TipoPortataEnum getTipoPortata() { return tipoPortata; }
    public void setTipoPortata(TipoPortataEnum portata) { this.tipoPortata = portata; }
    /**
     * Stampa la portata in console come fosse in un menù.
     * @return la descrizione della portata
     */
    public void printInfo() { System.out.println(getName() + " --- €" + getPrice()); }
}
