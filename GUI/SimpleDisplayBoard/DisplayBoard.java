
/**
 *
 * @author KraptuKrait
 */
public class DisplayBoard {

    public static void main(String[] args) throws InterruptedException {
        TimeoutWindow window = new TimeoutWindow();
        window.setLocation(20, 20);
        window.setSize(300, 400);
        window.setVisible(true);

        // Set window color to red
        window.redButtonLeft.setTimeoutRed();
        // Wait 600 milliseconds
        Thread.sleep(600);
        // Set window color to green
        window.redButtonLeft.removeTimeout();
        // Wait 600 milliseconds
        Thread.sleep(600);

        // Set window color to red
        window.redButtonRight.setTimeoutRed();
        // Wait 600 milliseconds
        Thread.sleep(600);
        // Set window color to green
        window.redButtonRight.removeTimeout();
        // Wait 600 milliseconds
        Thread.sleep(600);

        // Set window color to green
        window.greenButtonLeft.setTimeoutGreen();
        // Wait 600 milliseconds
        Thread.sleep(600);
        // Set window color to green
        window.greenButtonLeft.removeTimeout();
        // Wait 600 milliseconds
        Thread.sleep(600);

        // Set window color to green
        window.greenButtonRight.setTimeoutGreen();
        // Wait 600 milliseconds
        Thread.sleep(600);
        // Set window color to green
        window.greenButtonRight.removeTimeout();
        // Wait 600 milliseconds
        Thread.sleep(600);
    }
}
