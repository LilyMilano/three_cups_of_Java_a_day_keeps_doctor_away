package Java_Barry_Burd.chapter10.baseball_player_record;

import java.text.DecimalFormat;

public record Player(String name, double average) {


    // Method:
    public String getAverageString(){
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
        return decFormat.format(average);
    }


}