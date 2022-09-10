import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualPanel extends JPanel {

    JButton accuseButton;
    JButton guessButton;
    JButton moveButton;
    JButton endTurnButton;


    public VisualPanel() {
        moveButton = new JButton();
        moveButton.setText("Move");

        guessButton = new JButton();
        guessButton.setText("Guess");

        accuseButton = new JButton();
        accuseButton.setText("Accuse");

        endTurnButton = new JButton();
        endTurnButton.setText("End Turn");

        this.add(accuseButton);
        this.add(guessButton);
        this.add(moveButton);
        this.add(endTurnButton);

        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        accuseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        endTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }


    //This method updates so the buttons can be used at the correct times
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}