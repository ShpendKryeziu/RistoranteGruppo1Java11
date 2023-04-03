public enum Allergens {
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
        PESCE("pesce");
        private final String name;

        Allergens(String name){
                this.name=name;
        }
        public String getName(){
                return name;
        }
}


