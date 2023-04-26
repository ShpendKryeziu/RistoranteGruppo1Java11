package enumerators;

public enum FasciaOrariaEnum {
        FASCIA_ORARIA1("18.30 - 20.00"),
        FASCIA_ORARIA2("20.00 - 21.30"),
        FASCIA_ORARIA3("21.30 - 23.00");
        String fasciaOraria;
        FasciaOrariaEnum(String fasciaOraria) {
            this.fasciaOraria = fasciaOraria;
        }
        public String getFasciaOraria() {
            return fasciaOraria;
        }
        public void setFasciaOraria(String fasciaOraria) {
            this.fasciaOraria = fasciaOraria;
        }
}
