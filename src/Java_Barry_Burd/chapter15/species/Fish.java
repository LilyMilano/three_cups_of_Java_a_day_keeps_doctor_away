package Java_Barry_Burd.chapter15.species;

public class Fish extends HousePet{

    // Constructor:
    public Fish(String name, double weight) {
        super(name, weight, null);
    }

    @Override
    public void howToCareFor() {
        System.out.println("Feed " + name + " daily.");
    }
}
