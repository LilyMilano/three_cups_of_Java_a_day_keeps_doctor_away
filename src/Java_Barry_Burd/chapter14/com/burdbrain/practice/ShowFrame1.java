package Java_Barry_Burd.chapter14.com.burdbrain.practice;
import Java_Barry_Burd.chapter14.com.burdbrain.drawings.Drawing1;
import Java_Barry_Burd.chapter14.com.burdbrain.frames.ArtFrame1;
public class ShowFrame1 {
    public static void main(String[] args) {
        ArtFrame1 artFrame1 = new ArtFrame1(new Drawing1());

        artFrame1.setSize(60, 200);
        artFrame1.setVisible(true);

        while(true){
            try {
                Thread.sleep(10000);
                artFrame1.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
