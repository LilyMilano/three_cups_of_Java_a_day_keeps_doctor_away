public class OperatorsInJava {
    public static void main(String[] args) {
        // Unary Operators
        int i = -2;
        int j =  -i;
        System.out.println(j);  // 2

        int k = -4;
        int m = +k;
        System.out.println(m);  // -4

        //..............................................................................................................
        // Arithmetic increment and decrement operators
        int a = 5;

        // Increments by one and then returns the value
        int b = ++a;
        System.out.println(b);  // 6

        // Returns the value and then increments by one
        a = 5;
        int c = a++;
        System.out.println(c);  // 5
        System.out.println(a);  // 6

        // Decrements by one and then returns the value
        a = 5;
        int d = --a;
        System.out.println(d);  // 4

        // Returns the value and then decrements by one
        a = 5;
        int e = a--;
        System.out.println(e);  // 5
        System.out.println(a);  // 4

        //..............................................................................................................

        // Logical operators
        int n1 = 7, n2 = 5;
        boolean lie = false;
        boolean r1 = n1 > n2 || n1 == n2;
        boolean r2 = n1 > n2 && n1 == n2;
        boolean r3 = n1 > n2 && lie == true;
        boolean r4 = (n1 > n2 || n1 == n2)|| lie == true;
        System.out.println(r1); // true
        System.out.println(r2); // false
        System.out.println(r3); // false
        System.out.println(r4); // true

    }


}
