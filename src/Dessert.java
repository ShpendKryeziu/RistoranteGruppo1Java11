public class Dessert extends Portata {
    private int glycemicIndex;
    public Dessert(String name, double price, int glycemicIndex, Tipologia tipologia) {
        super(name, price, tipologia);
        if (glycemicIndex < 0 || glycemicIndex > 100) {
            throw new IllegalArgumentException("Glycemic index must be between 0 and 100.");
        }
        this.glycemicIndex = glycemicIndex;
    }

    //TODO cleaning code : prima i field, costruttore, getter e setter, metodi in overrride e poi gli altri metodi
    public int getGlycemicIndex() {return glycemicIndex;}

    //TODO se usiamo campi privati i getter e i setter devono essere puri
    public void setGlycemicIndex(int glycemicIndex) {
        if (glycemicIndex>100 || glycemicIndex<0) {
            throw new IllegalArgumentException("Glycemic index must be between 0 and 100.");
        } else {this.glycemicIndex = glycemicIndex;}
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getGlycemicIndex());
    }
}
