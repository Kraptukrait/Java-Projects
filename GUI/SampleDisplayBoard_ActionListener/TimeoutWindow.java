package com.mycompany.SampleDisplayBoard_ActionListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author KraptuKrait
 */
public class TimeoutWindow extends JFrame implements ActionListener {

    TimeoutButton team1_button1 = new TimeoutButton("T1");
    TimeoutButton team1_button2 = new TimeoutButton("T2");
    TimeoutButton team2_button1 = new TimeoutButton("T1");
    TimeoutButton team2_button2 = new TimeoutButton("T2");
    TimeoutLabel team_1, team_2;

    public TimeoutWindow() {
        super.setTitle("Scoreboard");

        JPanel teamPanel = new JPanel(new GridLayout(3, 2));

        team_1 = new TimeoutLabel("Team 1", SwingConstants.CENTER);
        team_2 = new TimeoutLabel("Team 2", SwingConstants.CENTER);

        team_1.setBorder(new LineBorder(Color.BLACK));
        team_2.setBorder(new LineBorder(Color.BLACK));

        team_1.setFont(team_1.getFont().deriveFont(20f));
        team_2.setFont(team_2.getFont().deriveFont(20f));

        teamPanel.add(team_1);
        teamPanel.add(team_2);

        team1_button1.addActionListener(this);
        team1_button2.addActionListener(this);
        team2_button1.addActionListener(this);
        team2_button2.addActionListener(this);

        teamPanel.add(team1_button1);
        teamPanel.add(team1_button2);
        teamPanel.add(team2_button1);
        teamPanel.add(team2_button2);

        teamPanel.add(team_1);
        teamPanel.add(team_2);

        this.add(teamPanel);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().getName().contains("A")) {
            TimeoutButton pushButton = (TimeoutButton) e.getSource();
            if (pushButton.getName().contains("T1")) {
                if (!pushButton.getCountValue()) {
                    pushButton.setTimeout();
                    pushButton.setCountValue(true);
                    team_1.setTimeoutLabel();
                    System.out.println(pushButton.getCountValue());
                } else {
                    pushButton.consumeTimeout();
                    team_1.consumeTimeoutLabel();
                }

            }
            if (pushButton.getName().contains("T2")) {
                if (!pushButton.getCountValue()) {
                    pushButton.setTimeout();
                    pushButton.setCountValue(true);
                    team_2.setTimeoutLabel();
                    System.out.println(pushButton.getCountValue());
                } else {
                    pushButton.consumeTimeout();
                    team_2.consumeTimeoutLabel();
                }
            }
        }
    }
}
