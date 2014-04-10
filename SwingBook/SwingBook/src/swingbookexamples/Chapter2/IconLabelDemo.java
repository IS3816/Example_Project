package SwingBookExamples.Chapter2;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

/*
 * @author Aaron Hinton
 */
public class IconLabelDemo 
{
    public IconLabelDemo()
    {
    JFrame jfrm = new JFrame("Use Images In Labels");
    jfrm.setSize(500,500);
    jfrm.setLocationRelativeTo(null);
    jfrm.setLayout(new GridLayout(4,1));
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ImageIcon myIcon = new ImageIcon("/Library/Application Support/Apple/iChat Icons/Gems/Diamond Round.gif");
    JLabel jlabIcon = new JLabel(myIcon);
    JLabel jlabIconTxt = new JLabel("Default Icon and Text Position", myIcon, JLabel.CENTER);
    
    JLabel jlabIconTxt2 = new JLabel("Text Left of Icon", myIcon, JLabel.CENTER);
    jlabIconTxt2.setHorizontalTextPosition(JLabel.LEFT);
    
    JLabel jlabIconTxt3 = new JLabel("Text Over Icon", myIcon, JLabel.CENTER);
    jlabIconTxt3.setVerticalTextPosition(JLabel.TOP);
    jlabIconTxt3.setHorizontalTextPosition(JLabel.CENTER);
    
    jfrm.add(jlabIcon);
    jfrm.add(jlabIconTxt);
    jfrm.add(jlabIconTxt2);
    jfrm.add(jlabIconTxt3);
    
    jfrm.setVisible(true);
    }
    
    
}
