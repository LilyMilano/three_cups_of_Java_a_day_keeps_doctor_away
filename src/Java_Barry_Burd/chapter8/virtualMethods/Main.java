package Java_Barry_Burd.chapter8.virtualMethods;

public class Main {
    public static void main(String[] args) {
        MyThing myThing, myThing2;

        myThing = new MySubThing();
        myThing2 = new MyOtherThing();

        myThing.value = 7;
        myThing2.value = 44;

        myThing.display();
        myThing2.display();

        /*Output:
        In MySUBThing, value is 7
        In MyOTHERThing, value is 44*/
    }
}
