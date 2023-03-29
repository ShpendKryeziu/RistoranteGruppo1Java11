public enum TipoPortata {

    //TODO finire
    BEVANDE("Bevande", "tipologia per la portata bevande"),
    DESSERT("","");

    private final String nome;

    private final String descrizione;

    TipoPortata(String nome, String descrizione) {
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
