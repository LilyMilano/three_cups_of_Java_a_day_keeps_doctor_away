package Java_Barry_Burd.chapter15.data;

public class DeletableTable extends Table implements Deletable{

    public DeletableTable(String fileName){
        super(fileName);
    }

    @Override
    public void delete(){
        for(int i = lines.size() - 1; i > 0; i--) {
            lines.remove(i);
        }
    }
}
