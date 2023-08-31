package Java_Barry_Burd;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class chapter7_printf {
    public static void main(String[] args) {
        out.printf("%s%d%s", ">>", 7, "<<\n");
        out.printf("%s%10d%s", ">>", 7, "<<\n");
        out.printf("%s%-10d%s", ">>", 7, "<<\n");
        out.printf("%s%010d%s", ">>", 7, "<<\n");
        out.printf("%s%+d%s", ">>", 7, "<<\n");
        out.printf("%s%+d%s", ">>", -7, "<<\n");
        out.printf("%s(%d)%s", ">>", -7, "<<\n");
        out.printf("%s%(d%s", ">>", -7, "<<\n");
        out.printf("%s%10.5f%s", ">>", 7.0, "<<\n");
        out.printf("%s%S%s", ">>", "Hello", "<<\n");
        out.printf("%s%c%s", ">>", 'x', "<<\n");
        out.printf("%s%C%s", ">>", 'x', "<<\n");

        /*
        Output:
        >>7<<
        >>         7<<
        >>7         <<
        >>0000000007<<
        >>+7<<
        >>-7<<
        >>(-7)<<
        >>(7)<<
        >>   7.00000<<
        >>HELLO<<
        >>x<<
        >>X<<
        */

        // Exercises from:
        // https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output

        String name = "Cameron";
        String site = "TechTarget";
        out.printf("I like the stuff %s writes on %S. %n", name, site);
        /*Output:
        I like the stuff Cameron writes on TECHTARGET.*/

        /*Format integer output with Java printf: */
        int above = -98765;
        long below =  54321L;
        out.printf("%,d :: %d", above, below);
        out.println();
        out.println();
        /*Output:
        -98,765 :: 54321
        */

        out.printf("-------------------------------%n");
        out.printf("    Java int printf chart%n");
        out.printf("     (number: 123457890)%n");
        out.printf("-------------------------------%n");
        out.printf("|  %-8s |      %s     |%n", "PATTERN", "RESULT");
        out.printf("-------------------------------%n");
        out.printf("|  %-8s | %d |%n", "%d", 123457890);
        out.printf("|  %-8s | %,d |%n", "%,d", 123457890);
        out.printf("|  %-8s | %,15d |%n", "%,15d", 123457890);
        out.printf("|  %-8s | %+,15d |%n", "%+,15d", 123457890);
        out.printf("|  %-8s | %-+,15d |%n", "%-+,15d", 123457890);
        out.printf("|  %-8s | %0,15d |%n", "%0,15d", 123457890);

        /*
        -------------------------------
                Java int printf chart
                (number: 123457890)
        -------------------------------
        |  PATTERN  |      RESULT     |
        -------------------------------
        |  %d       | 123457890 |
        |  %,d      | 123,457,890 |
        |  %,15d    |     123,457,890 |
        |  %+,15d   |    +123,457,890 |
        |  %-+,15d  | +123,457,890    |
        |  %0,15d   | 0000123,457,890 |*/

        //..............................................................................................................

        /* Format float and double output with printf.
        * To output a floating point number using scientific notation, simply use %e instead of %f to specify the variables. */
        out.println();
        double top = 1234.12345;
        float bottom = 1234.12345f;

        out.printf("%+,.3f :: %,.5f %n", top, bottom);
        out.printf("%+.3e :: %.5e %n%n", top, bottom);

        /*Output:
        +1,234.123 :: 1,234.12341
        +1.234e+03 :: 1.23412e+03
        */

        //..............................................................................................................

        out.printf("-------------------------------%n");
        out.printf("  Java double printf chart%n");
        out.printf("   (number: 12345.12345)%n");
        out.printf("-------------------------------%n");
        out.printf("|  %-8s |      %s     |%n", "PATTERN", "RESULT");
        out.printf("-------------------------------%n");
        out.printf("|  %-8s | %f |%n", "%f", 12345.12345);
        out.printf("|  %-8s | %15f |%n", "%15f", 12345.12345);
        out.printf("|  %-8s | %-15f |%n", "%-15f", 12345.12345);
        out.printf("|  %-8s | %-15.3f |%n", "%-15.3f", 12345.12345);
        out.printf("|  %-8s | %015.3f |%n", "%015.3f", 12345.12345);
        out.printf("-------------------------------%n%n");

        /*
        Output:
        -------------------------------
            Java double printf chart
            (number: 12345.12345)
        -------------------------------
        |  PATTERN  |      RESULT     |
        -------------------------------
        |  %f       | 12345.123450 |
        |  %15f     |    12345.123450 |
        |  %-15f    | 12345.123450    |
        |  %-15.3f  | 12345.123       |
        |  %015.3f  | 00000012345.123 |
        -------------------------------
        */

        //..............................................................................................................
        /*Format a Java char or boolean with printf
        In Java, a char uses the %c specifier. A boolean values uses %b.
        If you use %C or %B is used to format a boolean or char with Java printf, the values are printed in uppercase.*/

        boolean flag = false;
        char coal = 'a';
        out.printf("%B :: %c :: %C %n%n", flag, coal, '\u0077');
        /*Output:
        FALSE :: a :: W
        */

        out.println("I love " + Math.PI + " a lot!");
        out.printf("I love %.5f a lot! %n%n", Math.PI);
        /*Output:
        I love 3.141592653589793 a lot!
        I love 3.14159 a lot!
        */

        //..............................................................................................................
        /*Format a Date in Java with printf: java.util.Date
        The best way to output date and time values in Java is with the DateTimeFormatter class.
        But the printf method supports simple date formatting through the use of the %t conversion specifier along with
        an additional date detail parameter.*/

        Date d = new Date();
        out.printf("Current Hour: %tH %tM %tS %tz %n%n", d, d, d, d);
        /*Output:
        Current Hour: 23 23 05 -0400
        */

        //..............................................................................................................
        /*Format local time in Java with printf:
        Modern programs prefer to use the LocalDateTime object over java.util.Date*/

        LocalDateTime dt = LocalDateTime.now();
        out.printf("Local Date Time: %tA, %tB %te, %tY %tT %tp %n%n", dt, dt, dt, dt, dt, dt);
        /* Output:
        Local Date Time: Thursday, August 17, 2023 00:01:10 am
        */

        //..............................................................................................................

        out.printf("--------------------------------%n");
        out.printf("      Java's Primitive Types    %n");
        out.printf("      (printf table example)    %n");

        out.printf("--------------------------------%n");
        out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        out.printf("--------------------------------%n");

        out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
        out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
        out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
        out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
        out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
        out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
        out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
        out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);

        out.printf("--------------------------------%n%n");

        /*
        Output:
        --------------------------------
            Java's Primitive Types
            (printf table example)
        --------------------------------
        | CATEGORY   | NAME     | BITS |
        --------------------------------
        | Floating   | double   | 0064 |
        | Floating   | float    | 0032 |
        | Integral   | long     | 0064 |
        | Integral   | int      | 0032 |
        | Integral   | char     | 0016 |
        | Integral   | short    | 0016 |
        | Integral   | byte     | 0008 |
        | Boolean    | boolean  | 0001 |
        --------------------------------
        */

        //..............................................................................................................

        out.printf("-------------------------------------------------------%n");
        out.printf("                 Java printf cheatsheet     %n");
        out.printf("                 (printf table example)     %n");

        out.printf("-------------------------------------------------------%n");
        out.printf("| %-10s | %-20s | %15s |%n", "PATTERN", "DATA", "Printf output");
        out.printf("-------------------------------------------------------%n");

        out.printf("| %-10s | %-20s | %s | %n", "%s", "Java", "Java");
        out.printf("| %-10s | %-20s | %15s | %n", "%15s", "Java", "Java");
        out.printf("| %-10s | %-20s | %-15s | %n", "%-15s", "Java", "Java");
        out.printf("| %-10s | %-20s | %d | %n", "%d", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %,15d | %n", "%,15d", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %+,15d | %n", "%+,15d", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %-+,15d | %n", "%-+,15d", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %0,15d | %n", "%0,15d", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %15o | %n", "%15o", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %15x | %n", "%15x", 123457890, 123457890);
        out.printf("| %-10s | %-20s | %15f | %n", "%15f", 12345.123450, 12345.123450);
        out.printf("| %-10s | %-20s | %-15.3f | %n", "%-15.3f", 12345.123450, 12345.123450);
        out.printf("| %-10s | %-20s | %015.3f | %n", "%015.3f", 12345.123450, 12345.123450);
        out.printf("| %-10s | %-20s | %e | %n", "%e", 12345.123450, 12345.123450);
        out.printf("| %-10s | %-20s | %.2e | %n", "%.2e", 12345.123450, 12345.123450);
        out.printf("| %-10s | %-20s | %7tH %<-7tM | %n", "%7tH %<-7tM", new Date(), new Date());
        out.printf("| %-10s | %-20s | %15tT | %n", "%15tT", LocalDateTime.now(), LocalDateTime.now());
        out.printf("-------------------------------------------------------%n%n");

        /* Output:
        -------------------------------------------------------
                    Java printf cheatsheet
                    (printf table example)
        -------------------------------------------------------
        | PATTERN    | DATA                 |   Printf output |
        -------------------------------------------------------
        | %s         | Java                 | Java |
        | %15s       | Java                 |            Java |
        | %-15s      | Java                 | Java            |
        | %d         | 123457890            | 123457890 |
        | %,15d      | 123457890            |     123,457,890 |
        | %+,15d     | 123457890            |    +123,457,890 |
        | %-+,15d    | 123457890            | +123,457,890    |
        | %0,15d     | 123457890            | 0000123,457,890 |
        | %15o       | 123457890            |       726750542 |
        | %15x       | 123457890            |         75bd162 |
        | %15f       | 12345.12345          |    12345.123450 |
        | %-15.3f    | 12345.12345          | 12345.123       |
        | %015.3f    | 12345.12345          | 00000012345.123 |
        | %e         | 12345.12345          | 1.234512e+04 |
        | %.2e       | 12345.12345          | 1.23e+04 |
        | %7tH %<-7tM | Thu Aug 17 01:39:07 VET 2023 |      01 39      |
        | %15tT      | 2023-08-17T01:39:07.613037700 |        01:39:07 |
        -------------------------------------------------------
        */

    // HackerRank exercise:
        /*Every line of input will contain a String followed by an integer.
        Each String will have a maximum of 10 alphabetic characters, and each integer will be in the
        inclusive range from 0 to 999.
        Output Format:
        In each line of output there should be two columns:
        The first column contains the String and is left justified using exactly  characters.
        The second column contains the integer, expressed in exactly  digits; if the original
        input has less than three digits, you must pad your output's leading digits with zeroes.*/

        Scanner keyboard = new Scanner(in);
        out.println("Enter three pair of values. E.g:");
        out.println("winter 500");
        out.println("summer 999");
        out.println("solstice 0");

        String[] str = new String[3];
        int[] numbers = new int[3];

        for(int i = 0; i < 3; i++){
            str[i] = getValidString(keyboard);
            numbers[i] = getValidNumber(keyboard);
        }
        out.printf("================================%n");
        for (int i  = 0;  i < 3; i++){
            System.out.printf("%-15s%03d %n", str[i], numbers[i]);
        }
        out.printf("================================%n");

        /*Input:
        waterfall 1
        stars 999
        strawberry -1
        Output:
        ================================
        waterfall      001
        stars          999
        strawberry     000
        ================================*/
    }
    public static String getValidString(Scanner keyboard){
        String str = keyboard.next();
        if(str.length() > 10){
            return str.substring(0, 10);
        }
        return str;
    }
    public static int getValidNumber(Scanner keyboard){
        int number = keyboard.nextInt();
        if(number >= 0 && number <= 999){
            return number;
        }
        else return 0;
    }
}
