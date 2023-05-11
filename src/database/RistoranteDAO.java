package database;

import gestione_prenotazione.Ristorante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RistoranteDAO {

    public static void createTable() throws SQLException {
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String createQuery =
                "create table if not exists restaurant (\n" +
                        "    id int auto_increment not null primary key,\n" +
                        "    name varchar(255),\n" +
                        "    address varchar(255),\n" +
                        "    rating double\n" +
                        ");";

        stmt.execute(createQuery);
        con.close();
    }

    public static void insertRestaurant(Ristorante ristorante) throws SQLException {
        int restaurant_id = 0;
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String insertQuery =
                "insert into restaurant (name,address,rating) values(" + ristorante.getName()
                + "," + ristorante.getAddress() +","+ ristorante.getRating() +");";

        int rowsAffected = stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        if (rowsAffected == 1) {
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                restaurant_id = rs.getInt(1);
            }
        }
        
        ristorante.setRestaurant_id(restaurant_id);

        con.close();
    }
}
