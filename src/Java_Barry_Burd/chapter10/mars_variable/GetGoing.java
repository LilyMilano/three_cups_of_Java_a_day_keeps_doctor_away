package Java_Barry_Burd.chapter10.mars_variable;

import static java.lang.System.out;

public class GetGoing {
    public static void main(String[] args) {
        out.println("main is running:");
        EnglishSpeakingWorld e = new EnglishSpeakingWorld();

        // out.println(mars);   Cannot resolve symbol 'mars'
        out.println(e.mars);
        e.visitPennsylvania();
    }
}
