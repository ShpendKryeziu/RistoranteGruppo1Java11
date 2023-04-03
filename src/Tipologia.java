public enum Tipologia {

    //TODO sistamare
    CARNE("Carne", "Contiene prodotti ricavati da carcasse animali"),
    VEGETARIANO("Vegetariano", "Contiene prodotti vegetali e solo prodotti naturalmente creati da animali"),
    VEGANO("Vegano", "Contiene esclusivamente prodotti vegetali"),
    PESCE("Pesce", "Contiene prodotti ricavati da pesci, molluschi e crostacei");

    private final String nome;
    private final String descrizione;

    Tipologia(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() { return nome; }
    public String getDescrizione() { return descrizione; }
}
