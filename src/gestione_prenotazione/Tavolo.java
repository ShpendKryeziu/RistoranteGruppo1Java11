package gestione_prenotazione;

import enumerators.*;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {

    private Integer id;
    private Integer capacity;

    //TODO ma perchè un enum a comune visto che già lo avete, nel senso che possiamo usare una lista di enumerati
    private Boolean disponibileFasciaOraria1;
    private Boolean disponibileFasciaOraria2;
    private Boolean disponibileFasciaOraria3;
    private List<FasciaOrariaEnum> fasceOrarie = new ArrayList<>();

    public Tavolo(Integer id, Integer capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void addFasciaOraria(FasciaOrariaEnum fasciaOrariaEnum){fasceOrarie.add(fasciaOrariaEnum);}
    public void removeFasciaOraria(FasciaOrariaEnum fasciaOrariaEnum){fasceOrarie.remove(fasciaOrariaEnum);}


    public Integer getId() { return id; }
    public void setId(Integer id) {
        this.id = id;
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