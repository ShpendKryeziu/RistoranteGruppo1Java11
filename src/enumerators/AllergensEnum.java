package enumerators;

public enum AllergensEnum {

    // DA DECRETO LEGISLATIVO
    ARACHIDI("arachidi", 1),
    FRUTTAGUSCIO("frutta a guscio", 2),
    LATTE("latte", 3),
    MOLLUSCHI("molluschi", 4),
    PESCE("pesce", 5),
    SESAMO("sesamo", 6),
    SOIA("soia", 7),
    CROSTACEI("crostacei", 8),
    GLUTINE("glutine", 9),
    LUPINI("lupini", 10),
    SENAPE("senape", 11),
    SEDANO("sedano", 12),
    SOLFITI("solfiti", 13),
    UOVA("uova", 14);
    private final String name;
    private final Integer id;

    AllergensEnum(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}


