package com.mycompany.SampleDisplayBoard_ActionListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author KraptuKrait
 */
public class TimeoutButton extends JButton {

    public int countClicks = 0;
    private boolean count = false;

    public TimeoutButton(String name) {
        this.setBackground(Color.GREEN);
        this.setName(name);
        this.setOpaque(true);
    }

    public void setTimeout() {
        this.setText("T");
        this.setFont(this.getFont().deriveFont(Font.BOLD));
    }

    public void consumeTimeout() {
        this.setBackground(Color.RED);
        this.setOpaque(true);
    }

    public boolean getCountValue() {
        return count;
    }

    public void setCountValue(boolean newValue) {
        count = newValue;
    }
}
