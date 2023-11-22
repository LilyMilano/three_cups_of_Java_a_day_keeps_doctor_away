package Java_Barry_Burd.chapter17.items;

import java.sql.*;
import java.text.NumberFormat;
import static java.lang.System.out;

public class GetItemsData {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double totalTaxes = 0;
        final String CONNECTION =
                "jdbc:mysql://127.0.0.1:3306/itemsdb?useSSL=false";

        try(Connection conn = DriverManager.getConnection(CONNECTION);
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery
                    ("select * from " + "ITEMS")) {

            while (resultset.next()) {
                out.print(resultset.getString("NAME"));
                out.print(", ");
                double price = resultset.getFloat("PRICE");
                double taxRate = resultset.getFloat("TAX_RATE");
                double itemTotalPrice = price + price * taxRate;
                out.println(currency.format(itemTotalPrice));
                double itemTotalTaxes = price * taxRate;
                totalTaxes += itemTotalTaxes;
            }
            out.printf("Total taxes: %.2f%n", totalTaxes);
        } catch (SQLException e) {
            out.println(e.getMessage());
        }

        /*Output:
        BEANS, $10.10
        CARROTS, $20.20
        RICE, $20.20
        Total taxes: 0.50*/
    }
}
