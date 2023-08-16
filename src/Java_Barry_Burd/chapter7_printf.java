package Java_Barry_Burd;
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
        /*Output:
        -98,765 :: 54321
        */
    }
}
