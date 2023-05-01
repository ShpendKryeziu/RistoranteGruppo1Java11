package enumerators;

public enum FasciaOrariaEnum {

    FASCIA_ORARIA1("18.30 - 20.00", 1),
    FASCIA_ORARIA2("20.00 - 21.30", 2),
    FASCIA_ORARIA3("21.30 - 23.00", 3);
    private String fasciaOraria;
    private final Integer id;

    FasciaOrariaEnum(String fasciaOraria, Integer id) {
        this.fasciaOraria = fasciaOraria;
        this.id = id;
    }

    public String getFasciaOraria() {
        return fasciaOraria;
    }

    public Integer getId() {
        return id;
    }

}
