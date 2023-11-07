package Java_Barry_Burd.chapter15.transportation;

public interface Vehicle {
    void start();
    void stop();
    default void honk(){
        System.out.println("Vehicle honking");
    }
    int getNumberOfWheels();
}
