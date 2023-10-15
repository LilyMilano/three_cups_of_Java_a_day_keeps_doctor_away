package Java_Barry_Burd.chapter12.player;
import Java_Barry_Burd.chapter10.baseball_player.Player;
import java.io.IOException;
import java.util.ArrayList;
import static java.lang.System.out;
public class OurBestPlayers {
    public static void main(String[] args) throws IOException {
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Matt Damon", 0.111);
        Player player2 = new Player("Ben Johnson", 0.100);
        Player player3 = new Player("Dan Brown", 0.099);
        Player player4 = new Player("John Green", 0.200);
        Player player5 = new Player("Matt LeBlanc", 0.211);
        Player player6 = new Player("Harper Lee", 0.089);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);

        for (Player player : players) {
            if (player.getAverage() >= 0.100) {
                out.println("Player: " + player.getName() + ", Average: "
                        + player.getAverageString());
            }
        }
        /*Output:
        Player: Matt Damon, Average: .111
        Player: Ben Johnson, Average: .100
        Player: John Green, Average: .200
        Player: Matt LeBlanc, Average: .211*/
    }
}