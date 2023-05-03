package enumerators;

public enum TipologiaEnum {

    CARNE("Carne", "contiene prodotti ricavati da carcasse animali", 1),
    VEGETARIANO("Vegetariano", "contiene prodotti vegetali e solo prodotti naturalmente creati da animali", 2),
    VEGANO("Vegano", "contiene esclusivamente prodotti vegetali", 3),
    PESCE("Pesce", "contiene prodotti ricavati da pesci, molluschi e crostacei", 4);

    private final String nome;
    private final String descrizione;
    private final Integer id;

    TipologiaEnum(String nome, String descrizione, Integer id) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Integer getId() {
        return id;
    }
}
