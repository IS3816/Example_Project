package SwingBookExamples.Chapter1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/*
 * @author Aaron Hinton
 */
public class StopWatch implements ActionListener
{
    JLabel jlab;
    long start; //holds the start time in milliseconds
    
    public StopWatch ()
    {
    JFrame jfrm = new JFrame("A Simple Stopwatch");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(230, 90);
    jfrm.setLocationRelativeTo(null);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton jbtnStart = new JButton("Start");
    JButton jbtnStop = new JButton("Stop");
    jbtnStart.addActionListener(this);
    jbtnStop.addActionListener(this);
    jfrm.add(jbtnStart);
    jfrm.add(jbtnStop);
    
    jlab = new JLabel("Press Start to begin timing.");
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    }
    
    @Override    
        public void actionPerformed (ActionEvent ae)
        {
        Calendar cal = Calendar.getInstance();
        
        if(ae.getActionCommand().equals("Start"))
        {
            //Store start time
            start = cal.getTimeInMillis();
            jlab.setText("Stopwatch is Running...");
        }
        else
        {
            //compute the elapsed time...
            jlab.setText("Elapsed time is " + (double) (cal.getTimeInMillis() - start)/1000);
            
        }   
        
        }

}
