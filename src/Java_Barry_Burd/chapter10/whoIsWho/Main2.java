package Java_Barry_Burd.chapter10.whoIsWho;

public class Main2 {
    String name = "George"; // Field or instance variable

    public static void main(String[] args) {
        new Main2();
    }

    Main2(){
        System.out.println(name);   // Output: George

        String name = "Barry";  // Method-local variable
        System.out.println(name);   // Output: Barry

        System.out.println(this.name);   // Output: George
    }
}
