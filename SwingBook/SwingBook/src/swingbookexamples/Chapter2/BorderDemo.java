package SwingBookExamples.Chapter2;

import javax.swing.*;
import java.awt.*;

/*
 * @author Aaron Hinton
 */
public class BorderDemo 
{
    public BorderDemo()
    {
    JFrame jfrm = new JFrame("Use Line And Etched Border");
    jfrm.setSize(280,90);
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setLocationRelativeTo(null);
    
    JLabel jlab = new JLabel("This uses a line border...");
    jlab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
    JLabel jlab2 = new JLabel("This uses an etched border...");
    jlab2.setBorder(BorderFactory.createEtchedBorder());
    
    jfrm.add(jlab);
    jfrm.add(jlab2);
    
    jfrm.setVisible(true);
    }
}
