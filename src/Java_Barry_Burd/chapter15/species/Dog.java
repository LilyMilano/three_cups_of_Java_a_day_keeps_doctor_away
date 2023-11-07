package Java_Barry_Burd.chapter15.species;

public class Dog extends HousePet{
    // Field:
    int walksPerDay;

    // Constructor:
    public Dog(String name, double weight, int walksPerDay) {
        super(name, weight, "Woof");
        this.walksPerDay = walksPerDay;
    }

    @Override
    public void howToCareFor() {
        System.out.print("Walk " + name);
        System.out.println(" " + walksPerDay + " times each day.");
    }
}
