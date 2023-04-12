public enum TextStyle {
    ANSI_BLACK_BACKGROUND("\u001B[40m"),
    ANSI_GREEN_BACKGROUND("\u001B[42m"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m"),
    ANSI_BLUE_BACKGROUND("\u001B[44m"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m"),
    ANSI_CYAN_BACKGROUND("\u001B[46m"),
    ANSI_WHITE_BACKGROUND("\u001B[47m"),
    ANSI_BRIGHT_WHITE("\u001B[97m"),
    ANSI_RED_FONT("\u001B[31m"),
    ANSI_BOLD("\u001B[1m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_ITALIC("\u001B[3m"),
    ANSI_GREY("\u001B[90m"),
    ANSI_RED_BACKGROUND("\u001B[41m"),
    EMOJY_FIRE("\uD83D\uDD25"),
    ANSI_RESET("\u001B[0m");

    private final String string;
    TextStyle(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
