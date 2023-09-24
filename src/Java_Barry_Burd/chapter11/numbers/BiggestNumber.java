package Java_Barry_Burd.chapter11.numbers;

import java.io.IOException;

import static java.lang.System.out;

public class BiggestNumber {
    public static void main(String[] args) throws IOException {

        if(args.length < 3) {
            out.println("Usage: BiggestNumber filename number");
            System.exit(1);
        }

        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);

        int max =  Math.max(arg1, Math.max(arg2, arg3));

        out.printf("The largest number between %d, %d, and %d is: %d%n", arg1, arg2, arg3, max);
    }
}
