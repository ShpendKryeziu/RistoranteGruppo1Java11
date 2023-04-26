package enumerators;

public enum AllergensEnum {

        // DA DECRETO LEGISLATIVO
        ARACHIDI("arachidi"),
        FRUTTAGUSCIO("frutta a guscio"),
        LATTE("latte"),
        MOLLUSCHI("molluschi"),
        PESCE("pesce"),
        SESAMO("sesamo"),
        SOIA("soia"),
        CROSTACEI("crostacei"),
        GLUTINE("glutine"),
        LUPINI("lupini"),
        SENAPE("senape"),
        SEDANO("sedano"),
        SOLFITI("solfiti"),
        UOVA("uova")
        ;
        private final String name;

        AllergensEnum(String name){
                this.name=name;
        }

        public String getName() {return name;}
}


