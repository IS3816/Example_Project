package SwingBookExamples.Chapter1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * @author Aaron Hinton
 */
public class TwoJTextFieldDemo implements ActionListener
{
    JLabel jlab;
    JTextField jtf1, jtf2;
    
    public TwoJTextFieldDemo()
    {
    JFrame jfrm = new JFrame("Use Two Text Fields");
    jfrm.setSize(240,120);
    jfrm.setLayout(new FlowLayout());
    jfrm.setLocationRelativeTo(null);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    jtf1 = new JTextField(10);
    jtf2 = new JTextField(10);
    jtf1.setActionCommand("One");
    jtf2.setActionCommand("Two");
    jtf1.addActionListener(this);
    jtf2.addActionListener(this);
    jfrm.add(jtf1);
    jfrm.add(jtf2);
    
    jlab = new JLabel("");
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae)
    {
    if(ae.getActionCommand().equals("One"))
        jlab.setText("ENTER Pressed in tf1: " + jtf1.getText());
    else
        jlab.setText("ENTER Pressed in tf2: " + jtf2.getText());
    }
}
