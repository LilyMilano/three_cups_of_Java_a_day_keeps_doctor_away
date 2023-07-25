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

    }
}
