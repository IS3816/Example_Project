package SwingBookExamples.Chapter1;

import javax.swing.*;
       
/*
 * @author Aaron Hinton
 */
public class SwingDemo 
{
    public SwingDemo()
    {
    JFrame jfrm = new JFrame("A Simple Swing Program");
    jfrm.setSize(275, 100);
    
    JLabel jlab = new JLabel ("Swing Powers the Modern Java GUI.");
    jfrm.add(jlab);
    
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
    
    }   
}
