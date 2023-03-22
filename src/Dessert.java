public class Dessert extends Portata {
    private int highGlycemicIndex;

    //TODO cleaning code : prima i field, costruttore, getter e setter, metodi in overrride e poi gli altri metodi
    public int getHighGlycemicIndex() {return highGlycemicIndex;}

    //TODO se usiamo campi privati i getter e i setter devono essere puri
    public void controllaIndiceGlicemico(int highGlycemicIndex) {
        if (highGlycemicIndex>100 || highGlycemicIndex<0) {
            throw new IllegalArgumentException("ERRORE: Glycemic Index value must be between 0 and 100");
        } else {
            this.highGlycemicIndex = highGlycemicIndex;
        }}



    public Dessert(String name, double price, int highGlycemicIndex, Tipologia tipologia) {
        super(name, price, tipologia);
        setName(name);
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getHighGlycemicIndex());
    }
}
