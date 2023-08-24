package Java_Barry_Burd.chapter8.placeToLive;

import static java.lang.System.out;

public class DisplayHouseOrApartment {
    public static void main(String[] args) {

        HouseOrApartment house = new HouseOrApartment();
        house.setAddress("111 Crocodile District, TX");
        house.setNumberOfBedrooms(2);
        house.setArea(1000);
        house.setMonthlyMortgage(1000.00);
        house.setYearlyPropertyTax(600);
        double costHouse = house.getTotalMonthlyPayment();

        HouseOrApartment apartment = new HouseOrApartment();
        apartment.setAddress("222 Sunflower Lane, FL");
        apartment.setNumberOfBedrooms(1);
        apartment.setArea(1000);
        apartment.setRent(1500.00);
        double costApartment = apartment.getRent();

        out.println(house.getAddress());
        out.println("Cost per unit area: " + costHouse / house.getArea());
        out.println("Cost per bedroom: " + costHouse / house.getNumberOfBedrooms());
        out.println();

        out.println(apartment.getAddress());
        out.println("Cost per unit area: " + costApartment / apartment.getArea());
        out.println("Cost per bedroom: " + costApartment / apartment.getNumberOfBedrooms());

        /*Output:
        111 Crocodile District, TX
        Cost per unit area: 1.05
        Cost per bedroom: 525.0

        222 Sunflower Lane, FL
        Cost per unit area: 1.5
        Cost per bedroom: 1500.0*/
    }
}
