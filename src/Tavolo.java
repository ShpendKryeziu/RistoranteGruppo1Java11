import Enum.*;

import java.util.List;

public class Tavolo {

    //TODO così si scrivono le static final variable
    private Integer ID;
    private Integer capacity;

    //TODO ma perchè un enum a comune visto che già lo avete, nel senso che possiamo usare una lista di enumerati
    private Boolean disponibileFasciaOraria1;
    private Boolean disponibileFasciaOraria2;
    private Boolean disponibileFasciaOraria3;

    private List<Ristorante.FasciaOrariaEnum> fasciaOrariaEnums;

    //TODO il modificatore di accesso
    Tavolo(Integer ID, Integer capacity) {
        this.ID = ID;
        this.capacity = capacity;
        this.disponibileFasciaOraria1 = true;
        this.disponibileFasciaOraria2 = true;
        this.disponibileFasciaOraria3 = true;
    }

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
    public Boolean getFasciaOraria1() {
        return disponibileFasciaOraria1;
    }
    public void setFasciaOraria1(Boolean fasciaOraria1) {
        this.disponibileFasciaOraria1 = fasciaOraria1;
    }
    public Boolean getFasciaOraria2() {
        return disponibileFasciaOraria2;
    }
    public void setFasciaOraria2(Boolean fasciaOraria2) {
        this.disponibileFasciaOraria2 = fasciaOraria2;
    }
    public Boolean getFasciaOraria3() {
        return disponibileFasciaOraria3;
    }
    public void setFasciaOraria3(Boolean fasciaOraria3) {
        this.disponibileFasciaOraria3 = fasciaOraria3;
    }

    public void addFasciaOraria(Ristorante.FasciaOrariaEnum fasciaOrariaEnum){

        fasciaOrariaEnums.add(fasciaOrariaEnum);

    }
    public void removeFascioOraria(Ristorante.FasciaOrariaEnum fasciaOrariaEnum){

        fasciaOrariaEnums.remove(fasciaOrariaEnum);

    }

    public List<Ristorante.FasciaOrariaEnum> getFasciaOrariaEnums() {
        return fasciaOrariaEnums;
    }
}
