package SwingBookExamples.Chapter2;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/*
 * @author Aaron Hinton
 */
public class DisabledLabelDemo 
{
    public DisabledLabelDemo()
    {
    JFrame jfrm = new JFrame("Use Images In Labels");
    jfrm.setSize(500,500);
    jfrm.setLocationRelativeTo(null);
    jfrm.setLayout(new GridLayout(3,1));
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ImageIcon myIcon = new ImageIcon("/Library/Application Support/Apple/iChat Icons/Gems/Diamond Round.gif");
    ImageIcon myDisIcon = new ImageIcon("/Library/Application Support/Apple/iChat Icons/Gems/Diamond Square.gif");
    
    JLabel jlabIconTxt = new JLabel("This Label is Enabled", myIcon, JLabel.CENTER);
    
    JLabel jlabIconTxt2 = new JLabel("This Label Is Disabled", myIcon, JLabel.CENTER);
    jlabIconTxt2.setEnabled(false);
    
    JLabel jlabIconTxt3 = new JLabel("Use the Disabled Icon", myIcon, JLabel.CENTER);
    jlabIconTxt3.setDisabledIcon(myDisIcon);
    jlabIconTxt3.setEnabled(false);
    
    jfrm.add(jlabIconTxt);
    jfrm.add(jlabIconTxt2);
    jfrm.add(jlabIconTxt3);
    
    jfrm.setVisible(true);
    }
}
