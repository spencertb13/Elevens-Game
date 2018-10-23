package game;

import game.ElevensTools;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SuperListener extends JPanel
{
    private JButton submit;
    private JButton reset;
    private JLabel label;
    private ElevensTools tools;
    
    public SuperListener()
    {
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        submit.addActionListener(new SubmitListener());
        reset.addActionListener(new ResetListener());
        
        add(submit);
        add(reset);
        add(label);
        setPreferredSize(new Dimension(800,800));
        setBackground(Color.green);
    }

    private static class ResetListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent event)
        {
            //tools.start();
        }
    }
   
    private class SubmitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            
        }
    }
}
