/*
   ▄████████ ████████▄   ▄█    █▄     ▄████████ ███▄▄▄▄       ███     ███    █▄     ▄████████    ▄████████        ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████
  ███    ███ ███   ▀███ ███    ███   ███    ███ ███▀▀▀██▄ ▀█████████▄ ███    ███   ███    ███   ███    ███       ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███
  ███    ███ ███    ███ ███    ███   ███    █▀  ███   ███    ▀███▀▀██ ███    ███   ███    ███   ███    █▀        ███    █▀    ███    ███ ███   ███   ███   ███    █▀
  ███    ███ ███    ███ ███    ███  ▄███▄▄▄     ███   ███     ███   ▀ ███    ███  ▄███▄▄▄▄██▀  ▄███▄▄▄          ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄
▀███████████ ███    ███ ███    ███ ▀▀███▀▀▀     ███   ███     ███     ███    ███ ▀▀███▀▀▀▀▀   ▀▀███▀▀▀         ▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀
  ███    ███ ███    ███ ███    ███   ███    █▄  ███   ███     ███     ███    ███ ▀███████████   ███    █▄        ███    ███   ███    ███ ███   ███   ███   ███    █▄
  ███    ███ ███   ▄███ ███    ███   ███    ███ ███   ███     ███     ███    ███   ███    ███   ███    ███       ███    ███   ███    ███ ███   ███   ███   ███    ███
  ███    █▀  ████████▀   ▀██████▀    ██████████  ▀█   █▀     ▄████▀   ████████▀    ███    ███   ██████████       ████████▀    ███    █▀   ▀█   ███   █▀    ██████████
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHP;
    String weapon, position;


    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Adventure Game");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("Start");
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);

        window.setVisible(true);
    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setForeground(Color.black);
        choice1.setFont(normalFont);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setForeground(Color.black);
        choice2.setFont(normalFont);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setForeground(Color.black);
        choice3.setFont(normalFont);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setForeground(Color.black);
        choice4.setFont(normalFont);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        con.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetup();
    }

    public void playerSetup() {
        playerHP = 15;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        townGate();
    }

    public void townGate() {
        position = "townGate";
        mainTextArea.setText("You are at the entrance of the town. \nA guard is standing in front of you. \n\nWhat do you do?");

        choice1.setText("Talk to the guard");
        choice2.setText("Attack guard");
        choice3.setText("Leave");
        choice4.setText(" ");
    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello Stranger. \nI have never seen your face. \nI am sorry but I cannot let you into the town.");

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (position) {
                case "townGate":
                    switch (yourChoice) {
                        case "c1":
                            talkGuard();
                            break;
                        case "c2":
                            break;
                        case "c3":
                            break;
                    }
                    break;
                case "talkGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                    }
            }
        }

    }
}

