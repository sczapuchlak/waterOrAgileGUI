package com.stephanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;



public class waterfallOrAgile extends JFrame {



    private JPanel rootPanel;
    private JTextField projectName;
    private JLabel whatIsProjectName;
    private JCheckBox haveMoreThan4CheckBox;
    private JCheckBox needToHaveFirmCheckBox;
    private JCheckBox doTheProgrammersHaveCheckBox;
    private JCheckBox areThereStringentQualityCheckBox;
    private JCheckBox isEarlyIntegrationDesirableCheckBox;
    private JCheckBox willTheCustomerBeCheckBox;
    private JButton quitButton;
    private JButton clickForResultsButton;
    private JLabel resultsShowHere;

    protected waterfallOrAgile() {
        setContentPane(rootPanel); //set the contents of the window to be the rootPanel JPanel
        pack(); //add the components to the window
        setSize(new Dimension(775, 350)); // set the size. user can always resize
        setTitle("Agile or Waterfall? "); // sets the text in the title bar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close the program when you close the window
        setVisible(true); // make this visible


        clickForResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myProjectName = projectName.getText();
                String decision = agileOrWaterfallDecision();
                clickForResultsButton.setText(myProjectName + " should use " + decision);
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quit = JOptionPane.showConfirmDialog(waterfallOrAgile.this, "Are you sure you want to quit?",
                        "Quit", JOptionPane.OK_CANCEL_OPTION);
                if (quit == JOptionPane.OK_CANCEL_OPTION);
                System.exit(0);
            }
        });
    }

    public String agileOrWaterfallDecision() {
       int total=0;
        String decision ="Waterfall";
        if (haveMoreThan4CheckBox.isSelected())
            total+=1;
        if (needToHaveFirmCheckBox.isSelected())
            total+=1;
        if (doTheProgrammersHaveCheckBox.isSelected())
            total+=1;
        if (areThereStringentQualityCheckBox.isSelected())
            total+=1;
        if (isEarlyIntegrationDesirableCheckBox.isSelected())
            total+=1;
        if (willTheCustomerBeCheckBox.isSelected())
            total+=1;
        if (total<3)
            decision = "Agile";
        if (total>3)
            decision= "Waterfall";
        if (total==3)
            decision= "whichever you feel comfortable with!" ;

return decision;
}}