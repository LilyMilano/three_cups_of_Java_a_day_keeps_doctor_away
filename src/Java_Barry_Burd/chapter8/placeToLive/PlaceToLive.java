package Java_Barry_Burd.chapter8.placeToLive;

public class PlaceToLive {

    // Class Fields:
    private String address;
    private int numberOfBedrooms;
    private double area;

    // Setters and Getters:

    public void setAddress(String addressIn) {
        if(!addressIn.equals("")) {
            address = addressIn;
        }
    }
    public String getAddress() {
        return address;
    }
    public void setNumberOfBedrooms(int numberOfBedroomsIn) {
        if(numberOfBedroomsIn > 0) {
            numberOfBedrooms = numberOfBedroomsIn;
        }
    }
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public void setArea(double areaIn) {
        if(areaIn > 0) {
            area = areaIn;
        }
    }
    public double getArea() {
        return area;
    }

    // Methods:

    public double cost;
    public double getCostPerSquareFoot() {
        return cost * 1 / area;
    }

    public double getCostPerBedroom(){
        return cost * 1 / numberOfBedrooms;
    }

    public void display(){
        System.out.printf("Address: %s %n", getAddress());
        System.out.printf("Cost per square foot: $%.2f %n", getCostPerSquareFoot());
        System.out.printf("Cost per bedroom: $%.2f %n", getCostPerBedroom());
        System.out.println();
    }
}
