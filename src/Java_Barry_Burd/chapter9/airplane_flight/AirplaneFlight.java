package Java_Barry_Burd.chapter9.airplane_flight;

import java.time.LocalTime;

public class AirplaneFlight {

    // Class Fields:
    private int flightNumber;
    private Airport departureAirport;
    private LocalTime timeOfDeparture;
    private Airport arrivalAirport = null;
    private LocalTime timeOfArrival = null;

    // Constructors:
    public AirplaneFlight(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.timeOfDeparture = timeOfDeparture;
    }
    public AirplaneFlight(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, Airport arrivalAirport){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.timeOfDeparture = timeOfDeparture;
        this.arrivalAirport = arrivalAirport;
    }
    public AirplaneFlight(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, LocalTime timeOfArrival){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }
    public AirplaneFlight(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, Airport arrivalAirport, LocalTime timeOfArrival){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.timeOfDeparture = timeOfDeparture;
        this.arrivalAirport = arrivalAirport;
        this.timeOfArrival = timeOfArrival;
    }

    // Setters and getters:
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }
    public Airport getDepartureAirport() {
        return departureAirport;
    }
    public void setTimeOfDeparture(LocalTime timeOfDeparture){
        this.timeOfDeparture = timeOfDeparture;
    }
    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }
    public void setTimeOfArrival(LocalTime timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }
    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    // Methods:
    public void display(){
        String info = "Flight Number: "  + getFlightNumber() + "\n ";
        info += "Departure Airport: " + getDepartureAirport() + "\n ";
        info += "Time of Departure: " + getTimeOfDeparture() + "\n ";
        info += "Arrival Airport: " + getArrivalAirport() + "\n ";
        info += "Time of Arrival: " + getTimeOfArrival() + "\n ";
        System.out.println(info);
    }
}
