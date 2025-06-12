import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author KraptuKrait
 */
public class TimeoutButton extends JButton {

    public TimeoutButton(String text) {
        super(text);
        // Set color to green
        this.setBackground(Color.GREEN);
        this.setOpaque(true);
    }

    public void setTimeoutRed() {
        // Set color to red
        this.setBackground(Color.RED);
        this.setOpaque(true);
    }

    public void setTimeoutGreen() {
        // Set color to green
        this.setBackground(Color.GREEN);
        this.setOpaque(true);
    }

    public void removeTimeout() {
        // Set color to white
        this.setBackground(Color.WHITE);
        this.setOpaque(true);
    }
}
