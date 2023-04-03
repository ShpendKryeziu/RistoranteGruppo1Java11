public class Dessert extends Portata {
    private Integer glycemicIndex;

    /**
     * Crea un nuovo oggetto di tipo Dessert
     * @param name il nome del Dessert
     * @param price il costo del Dessert
     * @param tipologia il tipo di Dessert (di carne/vegano/pesce o bevanda)
     * @param glycemicIndex l'indice glicemico di Dessert.
     */

    public Dessert(String name, Double price, Integer glycemicIndex, Tipologia tipologia) {
        super(name, price, tipologia, TipoPortata.DESSERT);
        this.glycemicIndex = glycemicIndex;
    }

    public int getGlycemicIndex() {return glycemicIndex;}
    public void setGlycemicIndex(int glycemicIndex) {this.glycemicIndex = glycemicIndex;}

    /**
     * Stampa la descrizione del Dessert come nella classe padre, ma con l'aggiunta dell'indice glicemico del dolce.
     * @return info su Dessert
     */

    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getGlycemicIndex());
    }
}
