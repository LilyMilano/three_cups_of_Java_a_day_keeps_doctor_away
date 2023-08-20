package Java_Barry_Burd.chapter8.placeToLive;

import Java_Barry_Burd.chapter7_GUI.PracticeFrame;
public class PlaceToLiveGUI {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("Display cost of a place");
        frame.addRow("Address");
        frame.addRow("Number of bedrooms");
        frame.addRow("Area (ft^2)");
        frame.addRow("Cost ($)");
        frame.setButtonText("Display");
        frame.go();
    }

    public static String calculate(String address, int numberOfBedrooms, double area, double cost){
        PlaceToLive myPlace = new PlaceToLive();

        myPlace.setAddress(address);
        myPlace.setNumberOfBedrooms(numberOfBedrooms);
        myPlace.setArea(area);
        myPlace.cost = cost;

        return "Address: " + myPlace.getAddress() + "; Cost/ ft^2: $" + myPlace.getCostPerSquareFoot() + "; Cost/bedroom: $" + myPlace.getCostPerBedroom();
    }
}
