package Java_Barry_Burd.chapter17.items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableItems {
    public static void main(String[] args) throws SQLException {

        final String CONNECTION =
                "jdbc:mysql://127.0.0.1:3306/itemsdb?useSSL=false";

        try (Connection conn = DriverManager.getConnection(CONNECTION); Statement statement =
                conn.createStatement()) {
            statement.executeUpdate("""
                    CREATE TABLE ITEMS
                    (NAME VARCHAR(32) NOT NULL PRIMARY KEY,
                    PRICE FLOAT,
                    TAX_RATE FLOAT )""");
            statement.executeUpdate("""
                    insert into ITEMS values
                    ('RICE', 20.00, 0.01)""");
            statement.executeUpdate("""
                    insert into ITEMS values
                    ('BEANS', 10.00, 0.01)""");
            statement.executeUpdate("""
                    insert into ITEMS values
                    ('CARROTS', 20.00, 0.01)""");
            System.out.println("ITEMS table created. Rows added.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

