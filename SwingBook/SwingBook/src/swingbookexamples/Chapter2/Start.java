package SwingBookExamples.Chapter2;

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
        //new BorderDemo(); //2.1
        //new AlignLabelDemo(); //2.2
        //new IconLabelDemo(); //2.3
        //new DisabledLabelDemo(); //2.4
        new MnemDemo(); //2.5
        
        }    
    });
}
   
}
