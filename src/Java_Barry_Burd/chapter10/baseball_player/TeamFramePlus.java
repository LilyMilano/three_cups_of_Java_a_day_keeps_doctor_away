package Java_Barry_Burd.chapter10.baseball_player;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFramePlus extends JFrame {

    public TeamFramePlus() throws IOException {
        PlayerPlus player;
        Scanner yankeesData = new Scanner(new File("Yankees.txt"));

        for(int num = 1; num <= 9; num++){
            player = new PlayerPlus(yankeesData.nextLine(), yankeesData.nextDouble());
            yankeesData.nextLine();

            addPlayerInfo(player);
        }

        // Setting JFrame:
        add(new JLabel());
        add(new JLabel("____"));
        add(new JLabel("    Team Batting Average:"));
        add(new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("The Yankees");
        setLayout(new GridLayout(12, 2, 20, 6));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        yankeesData.close();
    }

    void addPlayerInfo(Player player){
        add(new JLabel("    " + player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}
