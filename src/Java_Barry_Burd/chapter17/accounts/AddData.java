package Java_Barry_Burd.chapter17.accounts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AddData {
    public static void main(String[] args) {

        final String CONNECTION =
                "jdbc:mysql://127.0.0.1:3306/accountdatabase?useSSL=false";

        try(Connection conn = DriverManager.getConnection(CONNECTION);
            Statement statement = conn.createStatement()) {

            statement.executeUpdate("""
                    insert into ACCOUNTS values
                    ('Barry Burd', '222 Cyber Lane', 24.02)""");
                    statement.executeUpdate("""
                    insert into ACCOUNTS values
                    ('Joe Dow', '111 Luddite Street', 55.63)""");

            System.out.println("Rows added.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
