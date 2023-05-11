package database;

import portate.Bevanda;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BevandaDAO {
    public static void createTable() throws SQLException {
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String createQuery =
                "create table if not exists drink (\n" +
                        "\tid int auto_increment not null primary key,\n" +
                        "\tname varchar(255),\n" +
                        "\tprice double,\n" +
                        "\tcapacity double,\n" +
                        "\talcoholic boolean,\n" +
                        "\tmenu_id int foreign key references menu(id)\n" +
                        ");";

        stmt.execute(createQuery);
        con.close();
    }

    public static void addDrink(Bevanda bevanda, Integer menu_id) throws SQLException {
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();

        String insertQuery =
                "insert into drink (name, price, capacity, alcoholic, menu_id)"+
                "values (" + bevanda.getName() + "," +bevanda.getPrice() + "," +
                bevanda.getCapacity() + "," + bevanda.getAlcoholic() + "," + menu_id + ");";

        stmt.executeUpdate(insertQuery);
        con.close();
    }
}
