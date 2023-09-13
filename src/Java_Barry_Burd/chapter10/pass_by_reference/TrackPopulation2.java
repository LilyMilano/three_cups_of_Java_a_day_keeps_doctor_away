package Java_Barry_Burd.chapter10.pass_by_reference;

public class TrackPopulation2 {
    public static void main(String[] args) {

        City smackerAR = new City();
        smackerAR.population = 2232;    // instance of the City class.

        birth(smackerAR);
        /*When the birth method is called and smackerAR is passed to the birth
        method’s aCity parameter, the computer copies the reference from
        smackerAR to aCity*/

        System.out.println(smackerAR.population);    // 2233
    }

    static void birth(City aCity){
        aCity.population++;
    }
}
