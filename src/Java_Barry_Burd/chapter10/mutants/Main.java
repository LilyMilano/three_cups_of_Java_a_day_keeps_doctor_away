package Java_Barry_Burd.chapter10.mutants;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("bigValue: " + MutableInteger.bigValue);
        //out.println("bigValue: " + IntegerHolder.value); ILLEGAL

        var holder1 = new MutableInteger(42);
        var holder2 = new MutableInteger(7);

        out.println("holder1: " + holder1.value);
        out.println("holder2: " + holder2.value);
        out.println();
        holder1.value++;
        holder2.value++;
        MutableInteger.bigValue++;

        out.println("bigValue:  " + MutableInteger.bigValue);
        out.println("holder1: " + holder1.value);
        out.println("holder2: " + holder2.value);

        out.println();
        holder1.bigValue++;
        out.println("bigValue according to holder1: " + holder1.bigValue);
        out.println("bigValue according to holder2: " + holder2.bigValue);
    }
}

class MutableInteger{
    int value;
    static int bigValue = 1_000_000;

    public MutableInteger(int value){
        this.value = value;
    }
}

/*
Output:
        bigValue: 1000000
        holder1: 42
        holder2: 7

        bigValue:  1000001
        holder1: 43
        holder2: 8

        bigValue according to holder1: 1000002
        bigValue according to holder2: 1000002*/
