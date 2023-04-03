public abstract class Portata {

    private String name;
    private Double price;
    private Tipologia tipologia;
    private TipoPortata tipoPortata;

    /**
     *Imposta una portata che abbia un nome, un prezzo e una tipologia dietologica.
     * @param name
     * @param price
     * @param tipologia
     */

    public Portata(String name, Double price, Tipologia tipologia, TipoPortata portata) {
        this.name = name;
        this.price = price;
        this.tipologia = tipologia;
        this.tipoPortata = portata;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Tipologia getTipologia() {
        return tipologia;
    }
    public void setTipologia(Tipologia tipologia) { this.tipologia = tipologia; }
    public TipoPortata getTipoPortata() { return tipoPortata; }
    public void setTipoPortata(TipoPortata portata) { this.tipoPortata = portata; }
    /**
     * Stampa la portata in console come fosse in un menù.
     * @return la descrizione della portata
     */
    public void printInfo() { System.out.println(getName() + " --- €" + getPrice()); }
}
