public enum TipologiaEnum {

    CARNE("Carne", "contiene prodotti ricavati da carcasse animali"),
    VEGETARIANO("Vegetariano", "contiene prodotti vegetali e solo prodotti naturalmente creati da animali"),
    VEGANO("Vegano", "contiene esclusivamente prodotti vegetali"),
    PESCE("Pesce", "contiene prodotti ricavati da pesci, molluschi e crostacei");

    private final String nome;
    private final String descrizione;

    TipologiaEnum(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() { return nome; }
    public String getDescrizione() { return descrizione; }
}
