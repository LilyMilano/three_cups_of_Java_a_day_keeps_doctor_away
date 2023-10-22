package Java_Barry_Burd.chapter12.sales;
import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySalesRecord {
    public static void main(String[] args) {

        ArrayList<SaleRecord> sales = new ArrayList<>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        fillTheList(sales);

        double total = sales.stream()
                .filter(saleRecord -> saleRecord.item().equals("DVD"))
                .map(SaleRecord::price)
                .reduce(0.0, Double::sum);

        System.out.println(currency.format(total));    // $36.00
    }
    static void fillTheList(ArrayList<SaleRecord> sales){
        sales.add(new SaleRecord("DVD", 15.00));
        sales.add(new SaleRecord("Book", 12.00));
        sales.add(new SaleRecord("DVD", 21.00));
        sales.add(new SaleRecord("CD", 5.25));
    }
}
