public class Cliente {
    private String username;
    private String name;
    private String surname;
    private String numeroDiTelefono;
    private String address;
    public Cliente (String username, String name, String surname, String numero, String address) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.numeroDiTelefono = numero;
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
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
