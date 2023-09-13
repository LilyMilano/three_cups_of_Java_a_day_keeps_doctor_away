package Java_Barry_Burd.chapter10.pass_by_reference;

public class TrackPopulation3 {
    public static void main(String[] args) {
        City smackerAR = new City();
        smackerAR.population = 2232;

        smackerAR = doBirth(smackerAR);
        System.out.println(smackerAR.population);   // prints 2233
    }

    static City doBirth(City aCity){
        City myCity = new City();
        myCity.population = aCity.population + 1;
        return myCity;
    }
}
