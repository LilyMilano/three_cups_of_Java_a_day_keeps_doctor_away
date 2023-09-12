package Java_Barry_Burd.chapter10.whoIsWho;

public class Main3 {
    static String name = "George";  // Field or instance variable

    public static void main(String[] args) {
        String name = "Liliana";
        new OtherClass();
    }
}

class OtherClass {
    OtherClass(){
        String name = "Leonard";
        System.out.println(name);   // Output: Leonard
        System.out.println(Main3.name);    // Output: George
        // System.out.println(this.name); Cannot resolve symbol 'name'
    }
}
