package hi2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Animal {
  private static final int MAX_VISIBLE_IMAGES = 5;
  private static final int IMAGE_DISPLAY_TIME = 1000;
  static int KMC=2;
  public static void random(
      ImageIcon iconMole, ImageIcon iconKingMole, ImageIcon iconHedgehog,
      JButton[] set, List<Timer> timers) {
    int interval = 800;
    int repeatCount = (10000/interval);
    for (int i = 0; i < repeatCount; i++) {
      Timer iconTimer = new Timer(0, null);
      iconTimer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          int visibleImageCount = (int) (Math.random() * (MAX_VISIBLE_IMAGES + 1));
          boolean hedgehogAlreadySelected = false;

          for (int i = 0; i < visibleImageCount; i++) {
            int randomButtonIndex = (int) (Math.random() * set.length);

            int randomMole;
            if (hedgehogAlreadySelected) {
              randomMole = (int) (Math.random() * 2);
            } else {
              randomMole = (int) (Math.random() * 3);
            }

            if (randomMole == 0) {
              set[randomButtonIndex].setIcon(iconMole);
            } else if (randomMole == 1) {
              if(KMC>0 && catchMoles.n <= 5)
              {set[randomButtonIndex].setIcon(iconKingMole);
              KMC--;}
              else
              {set[randomButtonIndex].setIcon(iconMole);}
            } else {
              set[randomButtonIndex].setIcon(iconHedgehog);
              hedgehogAlreadySelected = true;
            }

            set[randomButtonIndex].setEnabled(true);
            Timer iconRemoveTimer = new Timer(0, null);

            iconRemoveTimer.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                set[randomButtonIndex].setIcon(null);
                set[randomButtonIndex].setEnabled(false);
              }
            });
            
            iconRemoveTimer.setInitialDelay(IMAGE_DISPLAY_TIME);
            iconRemoveTimer.setRepeats(false);
            iconRemoveTimer.start();
          }
        }
      });
      iconTimer.setInitialDelay(interval * i);
      iconTimer.setRepeats(false);
      timers.add(iconTimer);
      iconTimer.start();
    }
  }

  public static void updateScore(Icon icon, ImageIcon iconMole, ImageIcon iconKingMole, ImageIcon iconHedgehog,
      int cnt, JLabel score) {
    if (icon == iconMole) {
      cnt += 10;
    } else if (icon == iconKingMole) {
      cnt += 100;
    } else if (icon == iconHedgehog) {
      cnt -= 10;
      if (cnt < 0) {
        cnt = 0;
      }
    }
    score.setText("Score : " + cnt);
    catchMoles.cnt = cnt;
  }
}
