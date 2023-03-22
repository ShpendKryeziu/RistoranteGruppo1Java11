public class Bevanda extends Portata {
    private double capacity;
    public Bevanda(String name, double price, double capacity) {
        super(name, price, Tipologia.BEVANDA);
        this.capacity = capacity;
    }
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }
    @Override
    public void printInfo() {
        System.out.println(getName() + ", " + getCapacity() + "L" + " --- €" + getPrice());
    }
}
