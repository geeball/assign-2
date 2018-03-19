import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayScreen extends JFrame implements ActionListener {
    JButton questionButton, answer1Button, answer2Button, answer3Button, answer4Button, fiftyfiftyButton, asktheaudienceButton, equalizerButton, takethemoneyButton, submitanswerButton;
    JTextPane categoryTextPane, questionAmountTextPane;
    JSlider DifficultySlider;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;

    PlayScreen () {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout (3,4));

    }

    public void actionPerformed(ActionEvent event) {

    }
}
