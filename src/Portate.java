public abstract class Portate {
    private String name;
    private double price;
    private Tipologia tipologia;
    public Portate (String name, double price) {
        setName(name);
        setPrice(price);
    }
    public Portate (String name, double price, Tipologia tipologia) {
        setName(name);
        setPrice(price);
        setTipologia(tipologia);
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Tipologia getTipologia() { return tipologia; }
    public void setTipologia(Tipologia tipologia) { this.tipologia = tipologia; }

    // TODO vedere se va bene sto print
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice());
    }
}
