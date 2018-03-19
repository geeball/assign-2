import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayScreen extends JFrame implements ActionListener {
    JButton questionButton, answer1Button, answer2Button, answer3Button, answer4Button, button6, button7, button8, button9, button10;
    JTextPane categoryTextPane, questionAmountTextPane;
    JSlider DifficultySlider;

    PlayScreen () {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout (3,4));

    }

    public void actionPerformed(ActionEvent event) {

    }
}
