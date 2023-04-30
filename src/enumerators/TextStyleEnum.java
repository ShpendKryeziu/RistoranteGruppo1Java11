package enumerators;

/**
 * Questa classe è di utility per un rapido accesso ai modificatori di stile del testo.
 */


public enum TextStyleEnum {
    ANSI_BLACK_BACKGROUND("\u001B[40m", "sfondo nero", 1),
    ANSI_GREEN_BACKGROUND("\u001B[42m", "sfondo verde", 2),
    ANSI_YELLOW_BACKGROUND("\u001B[43m", "sfondo giallo", 3),
    ANSI_BLUE_BACKGROUND("\u001B[44m", "sfondo blu", 4),
    ANSI_PURPLE_BACKGROUND("\u001B[45m", "sfondo viola", 5),
    ANSI_CYAN_BACKGROUND("\u001B[46m", "sfondo ciano", 6),
    ANSI_WHITE_BACKGROUND("\u001B[47m", "sfondo bianco", 7),
    ANSI_BRIGHT_WHITE("\u001B[97m", "carattere bianco", 8),
    ANSI_RED_FONT("\u001B[31m", "font rosso", 9),
    ANSI_BOLD("\u001B[1m", "font in grassetto", 10),
    ANSI_BLACK("\u001B[30m", "carattere nero", 11),
    ANSI_ITALIC("\u001B[3m", "font in italico", 12),
    ANSI_GREY("\u001B[90m", "carattere grigio", 13),
    ANSI_RED_BACKGROUND("\u001B[41m", "sfondo rosso", 14),
    EMOJY_FIRE("\uD83D\uDD25", "emoji del fuoco", 15),
    ANSI_RESET("\u001B[0m", "comando di reset dei colori", 16);

    private final String value;
    private final String descrizione;
    private final Integer id;

    TextStyleEnum(String value, String descrizione, Integer id) {
        this.value = value;
        this.descrizione = descrizione;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Integer getId() {
        return id;
    }
}
