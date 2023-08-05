package Fundamentals;

public class javaIntellijUdemy {
    public static void main(String[] args) {
        int age = 20;
        short ticketNumber = 30000;
        long start = 400000000;
        byte number = 120;
        float fraction = 2.5e2f;
        String name = "Abraham";
        int[] array = new int[5];
        double VALUE_PI = 3.1415927;    // CONSTANT
        String studentFirstName = "Rose";   // camelCase

        System.out.println(age);
        System.out.println(fraction);
        System.out.println("My name is: " + name);
        System.out.println("The add is: " + (age+ticketNumber+start+number));

        // char type:

        // UNICODE
        char symbol1 = '\u0026';
        System.out.println(symbol1);

        // ASCII
        char symbol2 = 38;
        System.out.println(symbol2);

        // CHAR
        char symbol3 = '&';
        System.out.println(symbol3);

        // SCAPE CHARS:
        char lineFeed = '\n';
        char carriageReturn = '\r';
        char backSpace = '\b';
        char tab = '\t';
        char formFeed = '\f';
        char backslash = '\\';
        char singleQuote = '\'';
        char doubleQuote = '\"';

        // boolean type:
        boolean condition = false;
        boolean validation = 3 == 2 + 1;    // true
        System.out.println(validation);

        // numeric systems:

        int value = 450;    // decimal system
        System.out.println("Decimal system: " + value);

        String binarySystem = Integer.toBinaryString(value);    // Decimal system: 450
        System.out.println("Binary System: " + binarySystem);   // Binary System: 111000010
        System.out.println("From binary to decimal: " + 0b111000010);   // From binary to decimal: 450

        String hexSystem = Integer.toHexString(value);  // Hexadecimal system
        System.out.println("Hexadecimal System: " + hexSystem); // Hexadecimal System: 1c2
        System.out.println("From hexadecimal to decimal: " + 0x1c2);    // From hexadecimal to decimal: 450

        String octalSystem = Integer.toOctalString(value);  // Octal system
        System.out.println("Octal System: " + octalSystem); // Octal System: 702
        System.out.println("From octal to decimal: " + 0702);    // From octal to decimal: 450

        // ....................................................................................
        // Strings to primitives

        String booleanValue = "true";
        boolean stringToBoolean = Boolean.parseBoolean(booleanValue);
            System.out.println(stringToBoolean);
        String decimal = "2.56";
        double stringToDouble = Double.parseDouble(decimal);
            System.out.println(stringToDouble);

        String integerValue = "395";
        int stringToInteger = Integer.parseInt(integerValue);
            System.out.println(stringToInteger);

        String floating = "2.56e2f";
        float stringToFloat = Float.parseFloat(floating);
            System.out.println(stringToFloat);

        // Primitives to string
        boolean conditional = true;
        String conditionalToString = Boolean.toString(conditional);

        int horsesNumber = 5687;
        String horsesToString = Integer.toString(horsesNumber);

        float floatingPoint = 2.56e2f;
        String floatingToString = Float.toString(floatingPoint);

        double decimalNumber = 23.678;
        String doubleToString = Double.toString(decimalNumber);

        String message = conditionalToString + "\n" + horsesToString + "\n" + floatingToString + "\n" + doubleToString;
        System.out.println(message);

        // Primitive to primitive
        int i = 400;
        short s = (short)i;
            System.out.println(s); // 400
        long l = i;
            System.out.println(l);  // 400
        char c = (char)i;
            System.out.println(c);  // Ɛ
    }
}
