import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class VisualFrame extends  JFrame{
    private final JPanel MainPanel; //Main display panel
    private final VisualPanel visualDisplay; //Main display panel

    public VisualFrame() {
        //Set up main display panel
        MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout(0, 0));
        MainPanel.setName("Murder Madness");


        //Visual display
        visualDisplay = new VisualPanel();
        visualDisplay.setLayout(new BorderLayout(0, 0));
        visualDisplay.setName("Murder Madness");

        visualDisplay.setMinimumSize(new Dimension(482, 482));
        visualDisplay.setMaximumSize(new Dimension(482, 482));
        visualDisplay.setPreferredSize(new Dimension(482, 482));

        //Add panel
        MainPanel.add(visualDisplay, BorderLayout.CENTER);
    }
}
