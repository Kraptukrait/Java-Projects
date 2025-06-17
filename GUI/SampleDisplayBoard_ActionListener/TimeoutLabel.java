package com.mycompany.SampleDisplayBoard_ActionListener;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author KraptuKrait
 */
public class TimeoutLabel extends JLabel {

    public TimeoutLabel(String text, int position) {
        super(text, position);
        this.setOpaque(true);
    }

    public void setTimeoutLabel() {
        this.setBackground(Color.YELLOW);
        this.setOpaque(true);
    }

    public void consumeTimeoutLabel() {
        this.setBackground(Color.WHITE);
        this.setOpaque(true);
    }
}
