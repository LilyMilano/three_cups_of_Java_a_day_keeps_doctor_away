package Fundamentals;

import java.util.Scanner;

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
        boolean r4 = (n1 > n2 || n1 == n2)||(lie == true);
        boolean r5 = ((n1 > n2 && lie == false) || (n1 == n2 && n1 < n2) && lie == false);
        System.out.println(r1); // true
        System.out.println(r2); // false
        System.out.println(r3); // false
        System.out.println(r4); // true
        System.out.println(r5); // true
        //..............................................................................................................

        // Example: Login

        String username = "Lily";
        String password = "12345";

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter your username:");
        String user = entry.nextLine();
        System.out.println("Enter your password:");
        String pass = entry.nextLine();

        if (username.equals(user) && password.equals(pass)){
            System.out.println("You are successfully logged in. Welcome.");
        }
        else {
            System.out.println("Incorrect data. Please try again.");
        }

        // nextLine(): It returns the input read from the console as a String.
        // You should call nextLine() once for each line you want to read from the user.

        //..............................................................................................................

        // Ternary Operators - Examples:

        // Scanner entry = new Scanner(System.in); use the previous scanner defined in this scope
        System.out.println("Enter your grade:");
        double grade = entry.nextDouble();

        if (grade >= 6){
            System.out.println("You approved the exam");
        }
        else {
            System.out.println("You failed the exam");
        }

        // Max number:
        // Scanner entry = new Scanner(System.in); use the previous scanner defined in this scope
        System.out.println("Enter the first integer number:");
        int first = entry.nextInt();
        System.out.println("Enter the second integer number:");
        int second = entry.nextInt();
        System.out.println("Enter the third integer number:");
        int third = entry.nextInt();

        // Ternary Operators
        int max;
        max = (first > second)?first:second;
        max = (max > third)?max:third;
        System.out.println(("The maximum number is: ").concat(String.valueOf(max)));

        // Math.max() function
        int maxNumber = Math.max(first, second);
        // System.out.println(maxNumber);
        int maxNumber1 = Math.max(maxNumber,third);
        System.out.println(("The maximum number is: ").concat(String.valueOf(maxNumber1)));

        // instanceof()
        String text = "O frabjous day! Callooh! Callay!";
        Number num = 6;

        boolean answer = text instanceof String;
        System.out.println(answer);    // true

        answer = text instanceof Object;
        System.out.println(answer);    // true

        answer = num instanceof Integer;
        System.out.println(answer);    // true

        answer = num instanceof Object;
        System.out.println(answer);    // true Integer != int (instanceof do not work with primitives)

        answer =  num instanceof Long;
        System.out.println(answer);    // false

        answer =  num instanceof Double;
        System.out.println(answer);    // false

        answer =  num instanceof Float;
        System.out.println(answer);    // false

        // Operator precedence: Java reads operators right-to-left
        int wage_2020 = 18;
        int wage_2021 = 15;
        int wage_2022 = 5;

        double average = (wage_2020 + wage_2021 + wage_2022)/3d;
        System.out.println(average);    // 12.666666666666666

        average = (++wage_2020 + wage_2021-- + wage_2022)/3d;
        System.out.println(average);    // 13.0

        //..............................................................................................................



    }
}
