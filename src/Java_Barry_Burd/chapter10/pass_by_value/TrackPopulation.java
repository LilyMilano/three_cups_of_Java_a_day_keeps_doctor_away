package Java_Barry_Burd.chapter10.pass_by_value;

public class TrackPopulation {
    public static void main(String[] args) {
        int smackoverARpop = 2232;

        smackoverARpop = birth(smackoverARpop);
        System.out.println(smackoverARpop);     // 2233
    }

    static int birth(int cityPop){
        return cityPop + 1;
    }
}
