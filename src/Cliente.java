import Enum.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Cliente.
 * Ogni cliente ha i suoi dati personali, una lista prenotazioni e una lista ristoranti preferiti!
 */
public class Cliente {

    private String username;
    private String name;
    private String surname;
    private String numeroDiTelefono;
    private String city;
    private String address;
    private final List<Ristorante> ristorantiPreferiti;
    private final List<Prenotazione> listaPrenotazioni;

    public Cliente(String username, String name, String surname, String numero, String city, String address) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.numeroDiTelefono = numero;
        this.city = city;
        this.address = address;
        this.ristorantiPreferiti = new ArrayList<>();
        this.listaPrenotazioni = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }
    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void addPreferito(Ristorante ristorante) {
        ristorantiPreferiti.add(ristorante);
    }
    public void removePreferito(Ristorante ristorante) {
        ristorantiPreferiti.remove(ristorante);
    }
    public List<Ristorante> getRistorantiPreferiti() {
        return ristorantiPreferiti;
    }
    public void addPrenotazione(Prenotazione prenotazione) {
        listaPrenotazioni.add(prenotazione);
    }
    public void removePrenotazione(Prenotazione prenotazione) {
        listaPrenotazioni.remove(prenotazione);
    }
    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    //TODO facciamo un metodo che stampa lo storico delle prenotazioni, possiamo dare un punteggio
    public void printInfo() {
        System.out.println("ID: " + username + ", " + name + surname);
    }
}
