package Java_Barry_Burd.chapter9.airplane_flight;

import java.time.LocalTime;

public class UseAirplaneFlight {
    public static void main(String[] args) {

        LocalTime twoFifteen = LocalTime.of(14, 15);
        LocalTime currentTime = LocalTime.now();

        // New Objects - AirplaneFlight type

        AirplaneFlight flight1 = new AirplaneFlight(111, Airport.EZE, currentTime);
        AirplaneFlight flight2 = new AirplaneFlight(222, Airport.MEX, currentTime, Airport.LAX);
        AirplaneFlight flight3 = new AirplaneFlight(333, Airport.LON, currentTime, twoFifteen);
        AirplaneFlight flight4 = new AirplaneFlight(444, Airport.TYO, currentTime, Airport.SAO, twoFifteen);

        // Print out:
        flight1.display();
        flight2.display();
        flight3.display();
        flight4.display();

        /*
        Output:
        Flight Number: 111
        Departure Airport: EZE
        Time of Departure: 23:42:48.973776500
        Arrival Airport: null
        Time of Arrival: null

        Flight Number: 222
        Departure Airport: MEX
        Time of Departure: 23:42:48.973776500
        Arrival Airport: LAX
        Time of Arrival: null

        Flight Number: 333
        Departure Airport: LON
        Time of Departure: 23:42:48.973776500
        Arrival Airport: null
        Time of Arrival: 14:15

        Flight Number: 444
        Departure Airport: TYO
        Time of Departure: 23:42:48.973776500
        Arrival Airport: SAO
        Time of Arrival: 14:15
        */
    }
}
