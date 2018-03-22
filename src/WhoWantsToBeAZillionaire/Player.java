/**
 * Created by U1759657 on 26/02/2018.
 */
public class Player {
    private String playerName;

    public Player(String playerName) {
        // this is me making sure the afore declared variables can be accessed by other classes
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
