package Java_Barry_Burd.chapter15.data;

public class DeletableColumnOfNumbers extends ColumnOfNumbers implements Deletable{

    public DeletableColumnOfNumbers(double[] numbers) {
        super(numbers);
    }
    @Override
    public void delete() {
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 0.0;
        }
    }
}
