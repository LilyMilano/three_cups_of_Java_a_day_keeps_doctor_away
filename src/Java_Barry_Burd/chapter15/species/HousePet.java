package Java_Barry_Burd.chapter15.species;

public abstract class HousePet extends Animal {
    // Field:
    String name;

    // Constructor:
    public HousePet(String name, double weight, String sound) {
        super(weight, sound);
        this.name = name;
    }

    abstract public void howToCareFor();    // Abstract method

    public void about(){
        System.out.print(name + " weighs " + weight + " pounds");
        System.out.print(sound != null ? (" and says '" + sound + "'") : "");
        System.out.println(".");
    }
}
