package SwingBookExamples.Chapter1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * @author Aaron Hinton
 */
public class JTextFieldDemo implements ActionListener
{
    JTextField jtf;
    JLabel jlab;

    public JTextFieldDemo()
    {
    JFrame jfrm = new JFrame("A Text Field Example");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(240, 90);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setLocationRelativeTo(null);
    
    jtf = new JTextField(10);
    jtf.addActionListener(this);
    jfrm.add(jtf);
    
    jlab = new JLabel("");
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    }
    
    //Handle Action Events
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    //Obtain the current text and display it in a label, Reset Text Box
    jlab.setText("Current Contents: " + jtf.getText());
    jtf.setText("");
    }
}
