public enum Allergens {

        //TODO si devono chiamare Enum alla fine
        // decidete voi quanto effort mettere su questa funzionalità
        GLUTINE("glutine"),
        LATTOSIO("lattosio"),
        SEDANO("sedano"),
        AGLIO("aglio"),
        UOVA("uova"),
        CIPOLLA("cipolla"),
        CAROTE("carotte"),
        FRUMENTO("frumento"),
        ARACHIDI("arachidi"),
        MOLLUSCHI("molluschi"),
        SOLFITI("solfiti"),
        CACAO("cacao"),
        NOCCIOLA ("nocciola"),
        PESCE("pesce");
        private final String name;

        Allergens(String name){
                this.name=name;
        }
        public String getName(){
                return name;
        }
}


