/**
 *
 * @author Kraptukrait
 */
public class PlayerList {

    private String playerName;
    private int playerScore;

    public PlayerList(String name, int score) {
        this.playerName = name;
        this.playerScore = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }
}
