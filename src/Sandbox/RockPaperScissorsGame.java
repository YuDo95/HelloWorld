package Sandbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissorsGame extends JFrame implements ActionListener {
    private JLabel userLabel, computerLabel, resultLabel;
    private JButton rockButton, paperButton, scissorsButton;

    public RockPaperScissorsGame() {
        setTitle("Rock, Paper, Scissors Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        userLabel = new JLabel("Your choice: ");
        computerLabel = new JLabel("Computer's choice: ");
        resultLabel = new JLabel("");

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        add(userLabel);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(computerLabel);
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computerChoice = random.nextInt(3);  // 0: Rock, 1: Paper, 2: Scissors

        String userChoice = e.getActionCommand();
        String computerChoiceStr = choices[computerChoice];

        userLabel.setText("Your choice: " + userChoice);
        computerLabel.setText("Computer's choice: " + computerChoiceStr);

        String result = determineWinner(userChoice, computerChoiceStr);
        resultLabel.setText("Result: " + result);
    }

    private String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice))
            return "Draw";
        else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equals("Scissors") && computerChoice.equals("Paper")))
            return "You win!";
        else
            return "You lose!";
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        game.setVisible(true);
    }
}