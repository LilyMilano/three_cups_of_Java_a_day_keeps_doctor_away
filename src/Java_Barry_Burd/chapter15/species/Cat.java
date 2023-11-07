package Java_Barry_Burd.chapter15.species;

public class Cat extends HousePet{

    // Field:
    boolean isOutdoor;

    // Constructor:
    public Cat(String name, double weight, boolean isOutdoor){
        super(name, weight, "Meow");
        this.isOutdoor = isOutdoor;
    }

    @Override
    public void howToCareFor() {
        System.out.println(isOutdoor ? "Let " : "Do not let " + name +
                " outdoors.");
    }
}
