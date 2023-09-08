package Java_Barry_Burd.chapter10.baseball_player_record;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFrame extends JFrame {

    public TeamFrame() throws IOException{
        Player player;
        Scanner yankeesData = new Scanner(new File("Yankees.txt"));

        for(int num = 1; num <= 9; num++){
            player = new Player(yankeesData.nextLine(), yankeesData.nextDouble());
            yankeesData.nextLine();
            addPlayerInfo(player);
        }

        setTitle("The Yankees");
        setLayout(new GridLayout(10, 2, 20,6));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        yankeesData.close();

        }

    void addPlayerInfo(Player player){
        add(new JLabel("     " + player.name()));
        add(new JLabel(player.getAverageString()));
    }
}