package Java_Barry_Burd.chapter8.placeToLive;

public class ApartmentWithFees extends Apartment{

    // Class Field:
    public double fees;

    // Getter and Setter:

    public double getFees(){
        return fees;
    }
    public void setFees(double fees){
        if(fees >= 0){
            this.fees = fees;
        }
    }

    // Method:

    public double getRentWithFees(){
        return getRent() + (fees / 3);
    }
}
