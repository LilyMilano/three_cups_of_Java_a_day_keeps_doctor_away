package Java_Barry_Burd;
import java.util.Date;

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

     /* -------------------------------
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
        out.printf("Local Time: %tH %tM %tS %tz %n%n", d, d, d, d);
        /*Output:
        Local Time: 23 23 05 -0400
        */


    }
}
