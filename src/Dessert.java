public class Dessert extends Portata {
    private int glycemicIndex;

    /**
     * Crea un nuovo oggetto di tipo Dessert
     * @param name il nome del Dessert
     * @param price il costo del Dessert
     * @param tipologia il tipo di Dessert (di carne/vegano/pesce o bevanda)
     * @param glycemicIndex l'indice glicemico di Dessert: può essere tra 0 e 100.
     *                      Se <0 o >100, costituisce IllegalArgumentException con messaggio di errore.
     */
    public Dessert(String name, double price, int glycemicIndex, Tipologia tipologia) {
        super(name, price, tipologia);
        if (glycemicIndex < 0 || glycemicIndex > 100) {
            throw new IllegalArgumentException("Glycemic index must be between 0 and 100.");
        }
        this.glycemicIndex = glycemicIndex;
    }

    public int getGlycemicIndex() {return glycemicIndex;}

    public void setGlycemicIndex(int glycemicIndex) {
        if (glycemicIndex>100 || glycemicIndex<0) {
            throw new IllegalArgumentException("Glycemic index must be between 0 and 100.");
        } else {this.glycemicIndex = glycemicIndex;}
    }

    /**
     * Stampa la descrizione del Dessert come nella classe padre, ma con l'aggiunta dell'indice glicemico del dolce.
     * @return info su Dessert
     */

    @Override
    public void printInfo() {
        System.out.println(getName() + " --- €" + getPrice() + ". Glycemic Index = " + getGlycemicIndex());
    }
}
