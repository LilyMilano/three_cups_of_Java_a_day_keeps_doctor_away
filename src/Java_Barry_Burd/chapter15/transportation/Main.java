package Java_Barry_Burd.chapter15.transportation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.honk();
        System.out.println("Number of wheels: " + car.getNumberOfWheels());

        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.stop();
        sportsCar.honk();
        sportsCar.openRoof();
        sportsCar.closeRoof();
        System.out.println("Number of wheels: " + sportsCar.getNumberOfWheels());

        /*Output>>
        Car started
        Car stopped
        Car honking
        Number of wheels: 4
        Sport car started
        Sport car stopped
        Car honking
        Convertible roof opened
        Convertible roof closed
        Number of wheels: 4

        In the main() method of the Main class, we create objects of the Car
        and SportsCar classes and call their respective methods, including
        the methods from the Convertible interface. This demonstrates how a
        class can extend another class and implement multiple interfaces.*/
    }
}
