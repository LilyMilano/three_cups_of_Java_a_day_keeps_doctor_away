package Java_Barry_Burd.chapter15.species;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Fido", 54.7, 3);
        Dog dog2 = new Dog("Rover", 15.2, 2);
        Cat cat1 = new Cat("Felix", 10.0, false);
        Fish fish1 = new Fish("Bubbles", 0.1);

        dog1.howToCareFor();
        dog2.howToCareFor();
        cat1.howToCareFor();
        fish1.howToCareFor();

        dog1.about();
        dog2.about();
        cat1.about();
        fish1.about();

        /*Output:
                Walk Fido 3 times each day.
                Walk Rover 2 times each day.
                Do not let Felix outdoors.
                Feed Bubbles daily.
                Fido weighs 54.7 pounds and says 'Woof'.
                Rover weighs 15.2 pounds and says 'Woof'.
                Felix weighs 10.0 pounds and says 'Meow'.
                Bubbles weighs 0.1 pounds.*/
    }
}
