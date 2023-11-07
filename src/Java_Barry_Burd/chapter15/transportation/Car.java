package Java_Barry_Burd.chapter15.transportation;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void honk() {
        System.out.println("Car honking");
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
