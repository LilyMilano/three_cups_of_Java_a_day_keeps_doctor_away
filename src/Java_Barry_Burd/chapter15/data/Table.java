package Java_Barry_Burd.chapter15.data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Table implements Displayable, Summarize {
    Scanner diskFile;
    ArrayList<String> lines = new ArrayList<>();
    public Table(String fileName) {
        try{
            diskFile = new Scanner(new File(fileName));
        }catch (FileNotFoundException e) {
            e.getMessage();
        }
        while(diskFile.hasNextLine()) {
            lines.add(diskFile.nextLine());
        }
    }
    @Override
    public void display() {
        for(String line : lines) {
            System.out.println(line);
        }
    }
    @Override
    public String summarize(){
        return lines.get(0);
    }
}
