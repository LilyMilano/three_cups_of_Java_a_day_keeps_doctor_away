package Java_Barry_Burd.chapter10.mars_variable;

import static java.lang.System.out;

public class EnglishSpeakingWorld {

    // Field or instance variable:
    String mars = " red planet";

    // Method:
    void visitPennsylvania(){
        out.println("visitPA is running:");

        String mars = " Janine's home town";

        out.println(mars);
        out.println(this.mars);
    }
}
