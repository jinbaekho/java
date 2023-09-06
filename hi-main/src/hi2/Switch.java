package hi2;

import javax.swing.JButton;

public class Switch {

    public static void off(JButton[] set) {
        for (int i = 0; i < set.length; i++) {
            set[i].setEnabled(false);
        }
    }

    public static void on(JButton[] set) {
        for (int i = 0; i < set.length; i++) {
            set[i].setEnabled(true);
        }
    }

    public static void StartGame(boolean gameRunning,JButton start,JButton[] set) {
        
        gameRunning = true;
        start.setText("In Game...");
        Switch.on(set);
        Thread th = new Thread();
        th.start();
    }
}
