public abstract class Portate {

    //TODO le classi si chiamano sempre al singolare
    //TODO inserire javadoc su tutte le classi
    private String name;
    private double price;
    private Tipologia tipologia;

    //TODO non c'è bisogno di questo
    public Portate (String name, double price) {
        //TODO sistemare tutto
        this.name = name;
        setName(name);
        setPrice(price);
    }

    /**
     *
     * @param name
     * @param price
     * @param tipologia
     */


    public Portate (String name, double price, Tipologia tipologia) {
        setName(name);
        setPrice(price);
        setTipologia(tipologia);
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
        printInfo();
    }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Tipologia getTipologia() {
        return tipologia;
    }
    public void setTipologia(Tipologia tipologia) { this.tipologia = tipologia; }

    // TODO vedere se va bene sto print

    /**
     * @return la descrizione della portata
     */
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice());
    }
}
