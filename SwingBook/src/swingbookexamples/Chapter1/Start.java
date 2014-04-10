package SwingBookExamples.Chapter1;

import javax.swing.SwingUtilities;

/*
 * @author Aaron Hinton
 */
public class Start 
{
   public static void main (String [] args)
    {
   
    SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
        //new SwingDemo(); //1.5
        //new JButtonDemo(); //1.7
        new StopWatch(); //Project 1-1
        //new JTextFieldDemo(); //1.8
        //new TwoJTextFieldDemo(); //1.8a
        //new Coder(); //Project 1-2
        
        }    
    });
}
   
}
