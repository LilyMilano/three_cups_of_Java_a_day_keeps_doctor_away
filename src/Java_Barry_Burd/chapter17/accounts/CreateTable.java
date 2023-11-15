package Java_Barry_Burd.chapter17.accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {

        final String CONNECTION =
                "jdbc:mysql://127.0.0.1:3306/accountdatabase?useSSL=false";

        try (Connection conn = DriverManager.getConnection(CONNECTION); Statement statement=
                conn.createStatement()) {
            statement.executeUpdate("""
                    CREATE TABLE ACCOUNTS
                    (NAME VARCHAR(32) NOT NULL PRIMARY KEY,
                    ADDRESS VARCHAR(32),
                    BALANCE FLOAT )""");
            System.out.println("ACCOUNTS table created.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}