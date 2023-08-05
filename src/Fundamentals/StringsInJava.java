package Fundamentals;

import java.util.Locale;

public class StringsInJava {
    public static void main(String[] args) {
        String bookName = "\"Tokio Blues\"";
        String bookName_ = new String("\"Tokio Blues\"");
        System.out.println(bookName);
        System.out.println(bookName_);
        System.out.println(bookName == bookName_); // false: Consider the type
        System.out.println(bookName.equals(bookName_)); // true: Consider only the chars

        // concat()
        String favoriteBook = ("My favorite book is ").concat(bookName);
        System.out.println(favoriteBook);   // My favorite book is "Tokio Blues"
        String name = "Liliana. ";
        String greet = ("Hello, ").concat(name).concat(favoriteBook);
        System.out.println(greet);  // Hello, Liliana. My favorite book is "Tokio Blues"

        /* transform(): Java String transform() method is used to apply a function to this string.
        The function should accept a single string argument and return an object.
        */

        greet = greet.transform(g -> {
            return g.concat(". What is yours?");
        });
        System.out.println(greet);  // Hello, Liliana. My favorite book is "Tokio Blues". What is yours?

        // replace()
        greet = greet.replace("o", "O");
        System.out.println(greet);  // HellO, Liliana. My favOrite bOOk is "TOkiO Blues". What is yOurs?

        // STRING METHODS .............................................................................................

        String firstName = "Sabrina";
        System.out.println(firstName.toUpperCase(Locale.ROOT)); // SABRINA
        System.out.println(firstName.toLowerCase(Locale.ROOT)); // sabrina
        System.out.println(firstName.equals("sabrina"));    // false
        System.out.println(firstName.equalsIgnoreCase("sabrina"));  // true
        //.............................................................................................................
        System.out.println(firstName.compareTo("sabrina")); // -32
        /* compareTo()
        * Compares two strings lexicographically. The comparison is based on the Unicode value of each
        * character in the strings. The character sequence represented by this String object is compared
        * lexicographically to the character sequence represented by the argument string.
        * The result is a negative integer if this String object lexicographically precedes the argument string.
        * The result is a positive integer if this String object lexicographically follows the argument string.
        * The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
        * */
        System.out.println(firstName.compareToIgnoreCase("sabrina"));   // 0
        //.............................................................................................................

        System.out.println(firstName.charAt(0));    // S -first char (index=0)
        System.out.println(firstName.charAt(firstName.length()-1));    // a -last char (index= .length()-1)
        System.out.println(firstName.replace("a", "#"));    // S#brin#
        System.out.println(firstName.lastIndexOf("a")); // 6
        System.out.println(firstName.indexOf("i")); // 4
        System.out.println(firstName.startsWith("Sabr"));   // true
        System.out.println(firstName.startsWith("ina"));    // false
        System.out.println(firstName.endsWith("ina"));      // true
        System.out.println(firstName.contains("bri"));      // true

        //.............................................................................................................

        System.out.println(firstName.trim());   //Sabrina
        /*
        * Returns a string whose value is this string, with all leading and trailing space removed, where space is
        * defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
        */
        //.............................................................................................................

        // Example: Get file extension

        String file = "random-image.png";
        int i = file.lastIndexOf(".");

        System.out.println(file.length());  // 16
        System.out.println(file.substring(i));  // .png

    }
}
