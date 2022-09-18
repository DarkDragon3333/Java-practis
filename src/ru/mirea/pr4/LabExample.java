package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample implements ActionListener{

    JLabel label, label2, label3;
    int mad = 0, mil = 0;

    LabExample(){
        JFrame obj = new JFrame("what");
        obj.setSize(500, 100);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        obj.setLayout(new BorderLayout());

        JButton buttonUp = new JButton("AC Milan");
        JButton buttonDown = new JButton("Real Madrid");
        label = new JLabel("Result: " + mad + "X" + mil);
        label2 = new JLabel("");
        label3 = new JLabel("");

        buttonUp.setSize(200, 20);
        buttonDown.setSize(200, 20);
        label.setSize(200, 40);
        label2.setSize(200, 40);
        label3.setSize(200, 40);

        obj.add(buttonUp, BorderLayout.NORTH);
        obj.add(buttonDown, BorderLayout.SOUTH);
        obj.add(label, BorderLayout.WEST);
        obj.add(label2, BorderLayout.CENTER);
        obj.add(label3, BorderLayout.EAST);

        obj.setVisible(true);

        buttonDown.addActionListener( this);
        buttonUp.addActionListener( this);

    }

    public void actionPerformed(ActionEvent click) {
        if (click.getActionCommand().equals("AC Milan")) {
            mil++;
            label.setText("Result: " + mad + "X" + mil);
            label2.setText("Last Scorer: AC Milan");
        }
        else {
            mad++;
            label.setText("Result: " + mad + "X" + mil);
            label2.setText("Last Scorer: Real Madrid");
        }

        if (mil > mad) {
            label3.setText("Winner: AC Milan");
        }
        else if(mil < mad) {
            label3.setText("Winner: Real Madrid");
        }
        else {
            label3.setText("Winner: ");
        }
    }

}
