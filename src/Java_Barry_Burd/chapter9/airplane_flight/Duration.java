package Java_Barry_Burd.chapter9.airplane_flight;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Duration extends AirplaneFlight{

    // Constructors:

    public Duration(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, Airport arrivalAirport, LocalTime timeOfArrival){
        super(flightNumber, departureAirport, timeOfDeparture, arrivalAirport, timeOfArrival);
    }
    /*public Duration(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, Airport arrivalAirport){
        super(flightNumber, departureAirport, timeOfDeparture, arrivalAirport);
    }*/
    public Duration(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture, LocalTime timeOfArrival){
        super(flightNumber, departureAirport, timeOfDeparture, timeOfArrival);
    }
    /*public Duration(int flightNumber, Airport departureAirport, LocalTime timeOfDeparture){
        super(flightNumber, departureAirport, timeOfDeparture);
    }*/

    // Methods:

    public long duration(){
        if(getTimeOfArrival() != null && getTimeOfDeparture() != null){
            return ChronoUnit.MINUTES.between(getTimeOfArrival(), getTimeOfDeparture());
        } else {
            return 0L;
        }
    }

    /*Notes:
    LocalTime twoFifteen = LocalTime.of(14, 15);
    LocalTime currentTime = LocalTime.now();
    long hours = ChronoUnit.HOURS.between(twoFifteen, currentTime);
    long minutes = ChronoUnit.MINUTES.between(twoFifteen, currentTime);*/
}
