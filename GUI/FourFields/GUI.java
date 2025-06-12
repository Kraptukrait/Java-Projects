package com.mycompany.FourFieldGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author KraptuKrait
 */
public class GUI extends JFrame {

    public GUI() {
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(2, 3));

        JButton redButtonLeft = new JButton("Red");
        JButton redButtonRight = new JButton("Red");
        JButton greenButtonLeft = new JButton("Green");
        JButton greenButtonRight = new JButton("Green");

        board.add(redButtonLeft);
        board.add(redButtonRight);
        board.add(greenButtonLeft);
        board.add(greenButtonRight);

        redButtonLeft.setBackground(Color.RED);     // Background color
        redButtonLeft.setOpaque(true);
        redButtonRight.setBackground(Color.RED);    // Background color
        redButtonRight.setOpaque(true);
        greenButtonLeft.setBackground(Color.GREEN); // Background color
        greenButtonLeft.setOpaque(true);
        greenButtonRight.setBackground(Color.GREEN); // Background color
        greenButtonRight.setOpaque(true);

        this.add(board);
    }
}
