package enumerators;

/**
 * Questa classe è di utility per un rapido accesso ai modificatori di stile del testo.
 */


public enum TextStyleEnum {
    ANSI_BLACK_BACKGROUND("\u001B[40m", "sfondo nero"),
    ANSI_GREEN_BACKGROUND("\u001B[42m", "sfondo verde"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m", "sfondo giallo"),
    ANSI_BLUE_BACKGROUND("\u001B[44m", "sfondo blu"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m", "sfondo viola"),
    ANSI_CYAN_BACKGROUND("\u001B[46m", "sfondo ciano"),
    ANSI_WHITE_BACKGROUND("\u001B[47m", "sfondo bianco"),
    ANSI_BRIGHT_WHITE("\u001B[97m", "carattere bianco"),
    ANSI_RED_FONT("\u001B[31m", "font rosso"),
    ANSI_BOLD("\u001B[1m", "font in grassetto"),
    ANSI_BLACK("\u001B[30m", "carattere nero"),
    ANSI_ITALIC("\u001B[3m", "font in italico"),
    ANSI_GREY("\u001B[90m", "carattere grigio"),
    ANSI_RED_BACKGROUND("\u001B[41m", "sfondo rosso"),
    EMOJY_FIRE("\uD83D\uDD25", "emoji del fuoco"),
    ANSI_RESET("\u001B[0m", "comando di reset dei colori");

    private final String value;
    private final String descrizione;
    TextStyleEnum(String value, String descrizione) {
        this.value = value;
        this.descrizione = descrizione;
    }

    public String getValue() {
        return value;
    }
    public String getDescrizione() {
        return descrizione;
    }
}
