import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static VisualFrame mainFrame;
    public static void main(String[] args) {
        mainFrame = generateVisualFrame();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter operand Type (+-*/)");
        String operand = scan.next();


        startTimer();
        for (int i = 0; i < 15; i++) {
            //Generate new question
            Question question = new Question(operand);

            //Ask the question
            System.out.println(question.getQuestionAsText());

            //Get the user answer
            while (!scan.hasNextInt()) scan.next();
            int answer = scan.nextInt();

            System.out.println(answer == question.solve());
        }
    }

    private static VisualFrame generateVisualFrame() {
        VisualFrame display = new VisualFrame();
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.add(new VisualPanel(), BorderLayout.CENTER);
        display.pack();
        display.setVisible(true);
        display.setResizable(false);

        return display;
    }

    public static void startTimer(){
        Timer timer = new Timer();

        TimerTask task = new TimerTask(){
            private int i = 90;
            public void run(){
                if (i > 0) {
                    System.out.println("" + i--);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); //1000ms = 1sec
    }
}