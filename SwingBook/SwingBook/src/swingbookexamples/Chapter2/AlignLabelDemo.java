package SwingBookExamples.Chapter2;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * @author Aaron Hinton
 */
public class AlignLabelDemo 
{
    public AlignLabelDemo()
    {
    JLabel [] jlabs = new JLabel[9];
    
    JFrame jfrm = new JFrame("Horizontal and Vertical Alignment");
    jfrm.setSize(500,200);
    jfrm.setLayout(new GridLayout(3, 3, 4, 4));
    jfrm.setLocationRelativeTo(null);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    jlabs[0] = new JLabel("Left, Top", JLabel.LEFT);
    jlabs[0].setVerticalAlignment(JLabel.TOP);
    
    jlabs[1] = new JLabel("Center, Top", JLabel.CENTER);
    jlabs[1].setVerticalAlignment(JLabel.TOP);
    
    jlabs[2] = new JLabel("Right, Top", JLabel.RIGHT);
    jlabs[2].setVerticalAlignment(JLabel.TOP);
    
    jlabs[3] = new JLabel("Left, Center", JLabel.LEFT);
    
    jlabs[4] = new JLabel("Center, Center", JLabel.CENTER);
    
    jlabs[5] = new JLabel("Right, Center", JLabel.RIGHT);
    
    jlabs[6] = new JLabel("Left, Bottom", JLabel.LEFT);
    jlabs[6].setVerticalAlignment(JLabel.BOTTOM);
    
    jlabs[7] = new JLabel("Center, Bottom", JLabel.CENTER);
    jlabs[7].setVerticalAlignment(JLabel.BOTTOM);
    
    jlabs[8] = new JLabel("Right, Bottom", JLabel.RIGHT);
    jlabs[8].setVerticalAlignment(JLabel.BOTTOM);
    
    Border border = BorderFactory.createEtchedBorder();
    
    for (int i=0; i<9; i++)
        jlabs[i].setBorder(border);
    
    for (int i=0; i<9; i++)
        jfrm.add(jlabs[i]);
    
    JPanel cp = ((JPanel) jfrm.getContentPane());
    cp.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    
    jfrm.setVisible(true);
    }
}
