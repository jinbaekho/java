package hi2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Leaderboard {
    public String playerName;
    public int score;

    public Leaderboard(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public static void updateLeaderboard(JTextField inputField, ArrayList<Leaderboard> scoreEntries,int cnt,JTextArea leaderboardTextArea) {
        String playerName = inputField.getText();
        scoreEntries.add(new Leaderboard(playerName, cnt));
        Collections.sort(scoreEntries, Comparator.comparingInt(Leaderboard::getScore).reversed());

        StringBuilder leaderboardText = new StringBuilder("순위표:\n");
        for (int i = 0; i < Math.min(scoreEntries.size(), 5); i++) {
            Leaderboard entry = scoreEntries.get(i);
            leaderboardText.append(i + 1).append(". ").append(entry.getPlayerName()).append("님 ").append(entry.getScore()).append("점\n");
        }
        leaderboardTextArea.setText(leaderboardText.toString());
        
    }
}
