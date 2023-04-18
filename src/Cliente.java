import Enum.*;
public class Cliente {

    private String username;
    private String name;
    private String surname;
    private String numeroDiTelefono;
    private String city;
    private String address;
    public Cliente (String username, String name, String surname, String numero, String city, String address) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.numeroDiTelefono = numero;
        this.city = city;
        this.address = address;
    }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getNumeroDiTelefono() { return numeroDiTelefono; }
    public void setNumeroDiTelefono(String numeroDiTelefono) { this.numeroDiTelefono = numeroDiTelefono; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public void printInfo() {
        System.out.println("ID: " + username + ", " + name+surname);
    }
}
