package Java_Barry_Burd.chapter17.accounts;
import java.sql.*;
import java.text.NumberFormat;
import static java.lang.System.out;
public class GetData {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        final String CONNECTION =
                "jdbc:mysql://127.0.0.1:3306/accountdatabase?useSSL=false";

        try(Connection conn = DriverManager.getConnection(CONNECTION);
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery
                    ("select * from " + "ACCOUNTS where BALANCE > 30")) {

            while (resultset.next()) {
                out.print(resultset.getString("NAME"));
                out.print(", ");
                out.print(resultset.getString("ADDRESS"));
                out.print(" ");
                out.println(currency.format(resultset.getFloat("BALANCE")));
            }
        } catch (SQLException e) {
            out.println(e.getMessage());
        }
    }
}
