package Java_Barry_Burd.chapter10.whoIsWho;

public class Main4 {
    String name = "Betty";

    public static void main(String[] args) {
        new Main4();
    }

    Main4(){
        String name = "Thelma";
        new YetAnotherClass(this);
    }
}

class YetAnotherClass {

    YetAnotherClass(Main4 whoCreatedMe){
        String name = "Leonard";
        System.out.println(name); // Prints "Leonard"
        // System.out.println(Main4.name);  Non-static field 'name' cannot be referenced from a static context
        System.out.println(whoCreatedMe.name); // Prints "Betty"
    }
}

/* 'whoCreatedMe' is a reference to the 'Main4' instance that created the 'YetAnotherClass' instance.

        When we call 'new Main4()', it creates a 'Main4' instance. Inside the 'Main4' constructor, it creates a
        'YetAnotherClass' instance, passing 'this' which points to the 'Main4' instance.

        So in 'YetAnotherClass', 'whoCreatedMe' refers to the 'Main4' instance that constructed it.

        That 'Main4' instance has a 'name' field with value "Betty".

        So by accessing 'whoCreatedMe.name', we are accessing the 'name' field of the 'Main4' instance that constructed
        this 'YetAnotherClass' instance.

        Therefore, 'whoCreatedMe.name' prints "Betty".

        In summary:
        - 'whoCreatedMe' refers to the 'Main4' instance
        - That 'Main4' instance has a 'name' field with value "Betty"
        - So 'whoCreatedMe.name' accesses that field and prints "Betty"*/
