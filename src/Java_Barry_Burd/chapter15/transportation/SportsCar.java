package Java_Barry_Burd.chapter15.transportation;

public class SportsCar extends Car implements Convertible{
    @Override
    public void start(){
        System.out.println("Sport car started");
    }

    @Override
    public void stop() {
        System.out.println("Sport car stopped");
    }

    @Override
    public void openRoof() {
        System.out.println("Convertible roof opened");
    }

    @Override
    public void closeRoof() {
        System.out.println("Convertible roof closed");
    }
}
