package SwingBookExamples.Chapter1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * @author Aaron Hinton
 */
public class JButtonDemo implements ActionListener
{

JLabel jlab;

    public JButtonDemo ()
    {
        //Create JFrame Container
    JFrame jfrm = new JFrame("A Button Example");
    jfrm.getContentPane().setLayout(new FlowLayout());
    jfrm.setSize(220, 90);
    jfrm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //Create 2 JButtons
    JButton jbtnFirst = new JButton("First");
    JButton jbtnSecond = new JButton("Second");
    
    //Create 2 ActionListeners to handle Button Clicks
    jbtnFirst.addActionListener(this);
    jbtnSecond.addActionListener(this);
    
    //add buttons to content Pane
    jfrm.add(jbtnFirst);
    jfrm.add(jbtnSecond);
    
    //add window label
    jlab = new JLabel("Press Button.");
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
    if(ae.getActionCommand().equals("First"))
        jlab.setText("First Button Was Pressed");
    else
        jlab.setText("Second Button Was Pressed");
    }
}