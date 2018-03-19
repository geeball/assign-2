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

        submitanswerButton = new JButton("Submit Answer");
        takethemoneyButton = new JButton("Take The Money");
        fiftyfiftyButton = new JButton("50/50");
        asktheaudienceButton = new JButton("Ask The Audience");
        equalizerButton = new JButton("Equalizer");

        submitanswerButton.addActionListener(this);
        takethemoneyButton.addActionListener(this);
        fiftyfiftyButton.addActionListener(this);
        asktheaudienceButton.addActionListener(this);
        equalizerButton.addActionListener(this);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent event) {

    }
}
