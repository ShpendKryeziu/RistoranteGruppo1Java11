import Enum.*;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {

    //TODO così si scrivono le static final variable
    private Integer ID;
    private Integer capacity;

    //TODO ma perchè un enum a comune visto che già lo avete, nel senso che possiamo usare una lista di enumerati
    private Boolean disponibileFasciaOraria1;
    private Boolean disponibileFasciaOraria2;
    private Boolean disponibileFasciaOraria3;
    private List<FasciaOrariaEnum> fasceOrarie = new ArrayList<>();

    //TODO il modificatore di accesso
    Tavolo(Integer ID, Integer capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public void addFasciaOraria(FasciaOrariaEnum fasciaOrariaEnum){fasceOrarie.add(fasciaOrariaEnum);}
    public void removeFasciaOraria(FasciaOrariaEnum fasciaOrariaEnum){fasceOrarie.remove(fasciaOrariaEnum);}


    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public List<FasciaOrariaEnum> getFasceOrarie() {
        return fasceOrarie;
    }
}
