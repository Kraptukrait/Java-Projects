import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author KraptuKrait
 */
public class TimeoutWindow extends JFrame {

    TimeoutButton redButtonLeft = new TimeoutButton("red");
    // Creates a red button named "red"
    TimeoutButton redButtonRight = new TimeoutButton("red");
    // Creates a red button named "red"
    TimeoutButton greenButtonLeft = new TimeoutButton("green");
    // Creates a green button named "green"
    TimeoutButton greenButtonRight = new TimeoutButton("green");

    public TimeoutWindow() {
        // Create a panel
        JPanel board = new JPanel();
        // Set a grid layout with 3 rows and 2 columns
        board.setLayout(new GridLayout(3, 2));

        // Create a new label with content "Team 1" centered
        JLabel teamLabel1 = new JLabel("Team 1", SwingConstants.CENTER);
        // Create a new label with content "Team 2" centered
        JLabel teamLabel2 = new JLabel("Team 2", SwingConstants.CENTER);

        // Add components to the panel
        board.add(teamLabel1);
        board.add(teamLabel2);
        board.add(redButtonLeft);
        board.add(redButtonRight);
        board.add(greenButtonLeft);
        board.add(greenButtonRight);

        // Add the panel to the frame
        this.add(board);
    }
}
