package Java_Barry_Burd.chapter8.placeToLive;

import static java.lang.System.out;

public class DisplayTheThree {
    public static void main(String[] args) {

        House house = new House();
        house.setAddress("333 Roses Street, Pasadena, FL");
        house.setNumberOfBedrooms(1);
        house.setArea(1000.00);
        house.setMonthlyMortgage(1000.00);
        house.setYearlyPropertyTax(600);
        double costHouse = house.getTotalMonthlyPayment();

        Apartment apartment = new Apartment();
        apartment.setAddress("111 Sunny Lane, California, FL");
        apartment.setNumberOfBedrooms(1);
        apartment.setArea(1000);
        apartment.setRent(1000.00);
        double costApartment = apartment.getRent();

        ApartmentWithFees apartmentWithFees = new ApartmentWithFees();
        apartmentWithFees.setAddress("222 Alberta Lake, Alberta, CA");
        apartmentWithFees.setNumberOfBedrooms(1);
        apartmentWithFees.setArea(1000.00);
        apartmentWithFees.setRent(1000.00);
        apartmentWithFees.setFees(300.00);
        double costApartmentWithFees = apartmentWithFees.getRentWithFees();

        // Display:

        out.println(house.getAddress());
        out.println("Cost per month: $" + costHouse);
        out.println();

        out.println(apartment.getAddress());
        out.println("Cost per month: $" + costApartment);
        out.println();

        out.println(apartmentWithFees.getAddress());
        out.println("Cost per month: $" + costApartmentWithFees);
        out.println();

        /*
        Output:
        333 Roses Street, Pasadena, FL
        Cost per month: $1050.0

        111 Sunny Lane, California, FL
        Cost per month: $1000.0

        222 Alberta Lake, Alberta, CA
        Cost per month: $1100.0
        */

    }
}
