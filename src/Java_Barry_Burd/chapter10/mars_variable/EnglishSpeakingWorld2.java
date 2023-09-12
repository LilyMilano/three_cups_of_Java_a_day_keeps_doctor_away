package Java_Barry_Burd.chapter10.mars_variable;
import static java.lang.System.out;

public class EnglishSpeakingWorld2 {
    String mars;    // Field or instance variable

    void visitIdaho(){
        out.println("visitID is running:");

        mars = " red planet";
        String atomicCity = " Population: 25";  // method-local variable

        out.println(mars);
        out.println(atomicCity);
    }

    void visitNewJersey(){
        out.println("visitNJ is running:");
        out.println(mars);
        //out.println(atomicCity);  Cannot resolve symbol 'atomicCity'
    }
}
