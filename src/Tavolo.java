public class Tavolo {
    private Integer ID;
    private Integer capacity;
    private Boolean disponibileFasciaOraria1;
    private Boolean disponibileFasciaOraria2;
    private Boolean disponibileFasciaOraria3;

    Tavolo(Integer ID, Integer capacity, Boolean fasciaOraria1, Boolean fasciaOraria2, Boolean fasciaOraria3) {
        this.ID = ID;
        this.capacity = capacity;
        this.disponibileFasciaOraria1 = fasciaOraria1;
        this.disponibileFasciaOraria2 = fasciaOraria2;
        this.disponibileFasciaOraria3 = fasciaOraria3;
    }

    public Integer getID() {return ID;}
    public void setID(Integer ID) {this.ID = ID;}
    public Integer getCapacity() {return capacity;}
    public void setCapacity(Integer capacity) {this.capacity = capacity;}
    public Boolean getFasciaOraria1() {return disponibileFasciaOraria1;}
    public void setFasciaOraria1(Boolean fasciaOraria1) {this.disponibileFasciaOraria1 = fasciaOraria1;}
    public Boolean getFasciaOraria2() {return disponibileFasciaOraria2;}
    public void setFasciaOraria2(Boolean fasciaOraria2) {this.disponibileFasciaOraria2 = fasciaOraria2;}
    public Boolean getFasciaOraria3() {return disponibileFasciaOraria3;}
    public void setFasciaOraria3(Boolean fasciaOraria3) {this.disponibileFasciaOraria3 = fasciaOraria3;}
}
