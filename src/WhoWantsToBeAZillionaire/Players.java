import java.util.ArrayList;

public class Players {
    private ArrayList<Player> zillionaiirePlayers = new ArrayList<>();

    public Players() {
        Player one = new Player("John");
        Player two = new Player("Mary");
        zillionaiirePlayers.add(one);
        zillionaiirePlayers.add(two);

        printPlayers();
    }

    public void printPlayers(){
        for (Player player : zillionaiirePlayers) {
            System.out.println(player);
        }
    }
    public static void main(String[] args) {
        new Players();
    }
}
