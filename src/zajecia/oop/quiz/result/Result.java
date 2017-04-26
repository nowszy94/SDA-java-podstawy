package zajecia.oop.quiz.result;

/**
 * Created by Szymon on 2017-04-25.
 */
public class Result {
    private String playerName;
    private int result;

    public Result(String playerName, int result) {
        this.playerName = playerName;
        this.result = result;
    }

    @Override
    public String toString() {
        return playerName + " " + result;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getResult() {
        return result;
    }
}
