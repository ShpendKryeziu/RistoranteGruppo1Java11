package database;

import gestione_prenotazione.Menu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuDAO {
    
    public static void createTable() throws SQLException {
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String createQuery =
                "create table if not exists menu (\n" +
                        "    chef varchar(255),\n" +
                        "    description varchar(255),\n" +
                        "    type varchar(255),\n" +
                        "    id int auto_increment not null primary key,\n" +
                        "    restaurant_id int foreign key references restaurant(id)\n" +
                        ");";

        stmt.execute(createQuery);
        con.close();
    }

    public static void insertMenu(Menu menu, Integer restaurant_id) throws SQLException {
        int menu_id = 0;
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String insertQuery =
                "insert into menu (chef, description, type, restaurant_id)" +
                "values(" + menu.getChefName() + "," + menu.getDescription() + "," +
                menu.getTipologia() + "," + restaurant_id + ");";

        int rowsAffected = stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        if (rowsAffected == 1) {
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                menu_id = rs.getInt(1);
            }
        }

        menu.setMenuID(menu_id);
    }
}
