public class Secondi {
    private String nameSecondo;
    private double priceSecondo;
    public Secondi (String nameSecondo, double priceSecondo){
        this.nameSecondo = nameSecondo;
        this.priceSecondo = priceSecondo;
    }

    public String getNameSecondo() {
        return nameSecondo;
    }

    public double getPriceSecondo() {
        return priceSecondo;
    }

    public void setNameSecondo(String nameSecondo) {
        this.nameSecondo = nameSecondo;
    }

    public void setPriceSecondo(double priceSecondo) {
        this.priceSecondo = priceSecondo;
    }

    @Override
    public String toString() {
        return nameSecondo + " - €" + priceSecondo;
    }
}
