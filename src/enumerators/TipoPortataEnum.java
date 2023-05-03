package enumerators;

public enum TipoPortataEnum {

    BEVANDA("Bevande", "tipologia per la portata bevande", 1),
    PRIMO("Cibo.Primo", "tipologia per la portata primo", 2),
    SECONDO("Cibo.Secondo", "tipologia per la portata secondo", 3),
    DESSERT("Cibo.Dessert", "tipologia per la portata dessert", 4);

    private final String nome;
    private final String descrizione;
    private final Integer id;

    TipoPortataEnum(String nome, String descrizione, Integer id) {
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
