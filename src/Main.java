import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Hello world
        System.out.println("Hello, Java!");

        // Data types
        String myString = "Hello, I am a string";
        myString = "Hello, I am Liliana!";
        System.out.println(myString);

        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        Double myDouble = 6d;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat);
        System.out.println(myDouble + Double.valueOf(myFloat));

        System.out.println(myDouble + " " + myString + " " + myFloat + " " + myInt);

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        // Conditionals

        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
            System.out.println("myFloat is not null");
        } else {
            System.out.println("myFloat is null");
        }

        if(myInt == 11){
            System.out.println("myInt == 11");
        }else if(myInt == 12){
            System.out.println("myInt == 12");
        }else {
            System.out.println("The value is neither 11 nor 12");
        }

        // Lists
        List<String> myList = new ArrayList<String>();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList); // [Hello, I am Liliana!, 11]

        // Maps
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("string", myString);
        myMap.put("int", myInt);
        System.out.println(myMap);  // {string=Hello, I am Liliana!, int=11}
        System.out.println(myMap.get("int"));   // 11

        // Iterations
        for(int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
            // Hello, I am Liliana!
            // 11
        }

        // Modifier (final)
        final String myConstant = "Hello, I am a constant";

        Main myMain = new Main();
        myMain.myFunction(5,2);

        Main fruitfulMain = new Main();
        System.out.println(fruitfulMain.fruitfulFunction(5,5)); // 10
    }

    // Functions
    public void myFunction(int myFirstNumber, int mySecondNumber){
        System.out.println(myFirstNumber + mySecondNumber); // 7
    }

    public int fruitfulFunction(int FirstNumber, int SecondNumber){
        return FirstNumber + SecondNumber;
    }

}