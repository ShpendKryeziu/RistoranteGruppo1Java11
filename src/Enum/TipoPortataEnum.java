package Enum;

public enum TipoPortataEnum {

    BEVANDA("Bevande", "tipologia per la portata bevande"),
    PRIMO("Cibo.Primo", "tipologia per la portata primo"),
    SECONDO("Cibo.Secondo", "tipologia per la portata secondo"),
    DESSERT("Cibo.Dessert","tipologia per la portata dessert");

    private final String nome;
    private final String descrizione;

    TipoPortataEnum(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
}
