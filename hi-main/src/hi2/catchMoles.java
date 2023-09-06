package hi2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class catchMoles extends JFrame implements ActionListener, Runnable {

    JButton start = new JButton("Start");
    JButton set[] = new JButton[25];
    ImageIcon iconMole = new ImageIcon("digda.png");
    ImageIcon iconKingMole = new ImageIcon("digda2.png");
    ImageIcon iconHedgehog = new ImageIcon("dochi.png");
    JLabel score = new JLabel("Score : 0");
    JLabel time = new JLabel("Time 0:10");
    Container c = getContentPane();
    JPanel PanelD = new JPanel();
    JPanel PanelSc = new JPanel();
    JPanel PanelSt = new JPanel();
    JTextField inputField = new JTextField(20);
    static int cnt = 0;
    static int n = 10;
    boolean gameRunning = false;

    private List<javax.swing.Timer> timers = new ArrayList<>();
    private ArrayList<Leaderboard> scoreEntries = new ArrayList<>();
    private JTextArea leaderboardTextArea = new JTextArea(1, 10);

    Cursor customCursor; // 커스텀 커서 객체
    BufferedImage CursorImage = null; // 원본 이미지

    catchMoles() {
        try {
            CursorImage = ImageIO.read(new File("kill.png")); // 이미지 파일을 로드

        } catch (IOException e) {
            e.printStackTrace();
        }

        customCursor = Toolkit.getDefaultToolkit().createCustomCursor(CursorImage, new Point(0, 0), "customCursor");
        setCursor(customCursor);
        setTitle("Catch Moles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new BorderLayout(10, 10));
        time.setFont(new Font("Arial", Font.BOLD, 20));
        score.setFont(new Font("Arial", Font.BOLD, 20));

        c.add(time, BorderLayout.NORTH);

        c.add(PanelD, BorderLayout.CENTER);
        PanelD.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < set.length; i++) {
            set[i] = new JButton();
            PanelD.add(set[i], BorderLayout.CENTER);
            set[i].setBorderPainted(false);
            set[i].setFocusPainted(false);
            set[i].setBackground(Color.DARK_GRAY);
        }
        c.add(PanelSc, BorderLayout.SOUTH);
        PanelSc.setLayout(new GridLayout(1, 2));
        PanelSc.add(score);

        PanelSc.add(PanelSt);
        PanelSt.setLayout(new FlowLayout(FlowLayout.RIGHT));
        PanelSt.add(start);
        PanelSt.add(inputField);

        leaderboardTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(leaderboardTextArea);
        c.add(scrollPane, BorderLayout.EAST);
    

        PanelD.setBackground(Color.DARK_GRAY);
        PanelSt.setBackground(Color.LIGHT_GRAY);
        PanelSc.setBackground(Color.LIGHT_GRAY);
        c.setBackground(Color.LIGHT_GRAY);

        start.addActionListener(this);
        for (int i = 0; i < set.length; i++)
            set[i].addActionListener(this);

        setSize(1400, 1000);
        setResizable(false);
        setVisible(true);
        setLocation(260,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            if (!gameRunning) {
                String playerName = inputField.getText();
                if (playerName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "플레이어 이름을 입력하세요", "경고", JOptionPane.WARNING_MESSAGE);
                    System.out.println(this);
                    return;
                }
                gameRunning = true;
                score.setText("Score : 0");
                time.setText("Time 0:10");
                Animal.KMC=2;
                cnt = 0;
                Switch.StartGame(gameRunning, start, set);
                Thread th = new Thread(this);
                start.setEnabled(false);
                th.start();
                Animal.random(iconMole, iconKingMole, iconHedgehog, set, timers);

            }
        } else {
            for (int i = 0; i < set.length; i++) {
                if (e.getSource() == set[i] && gameRunning) {
                    if (set[i].getIcon() != null) {
                        Animal.updateScore(set[i].getIcon(), iconMole, iconKingMole, iconHedgehog, cnt, score);
                        set[i].setIcon(null);
                        set[i].setEnabled(false);
                    }
                }
            }
        }
    }

    // Animal 클래스 random 메서드 호출

    @Override
    public void run() {
        n = 10;
        while (gameRunning) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            n--;
            if (n == 0) {
                for (int i = 0; i < set.length; i++) {
                    set[i].setIcon(null);
                    set[i].setEnabled(false);
                }
                time.setText("Game Over !!");
                start.setEnabled(true);
                Switch.off(set);
                gameRunning = false;
                start.setText("Start");
                break;
            }
            time.setText("Time 0:" + n);
        }
        Leaderboard.updateLeaderboard(inputField, scoreEntries, cnt, leaderboardTextArea);
        cnt = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new catchMoles());
    }
}
