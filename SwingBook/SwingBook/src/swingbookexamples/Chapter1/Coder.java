package SwingBookExamples.Chapter1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * @author Aaron Hinton
 */
public class Coder implements ActionListener
{
    
    JTextField jtfPlaintext, jtfCiphertext;
    
    public Coder()
    {
    JFrame jfrm = new JFrame("A Simple Code Machine");
    jfrm.setSize(340,175);
    jfrm.setLayout(new FlowLayout());
    jfrm.setLocationRelativeTo(null);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel jlabPlaintext = new JLabel("  Plain Text: ");
    JLabel jlabCiphertext = new JLabel("Cipher Text: ");
    
    jtfPlaintext = new JTextField(20);
    jtfCiphertext = new JTextField(20);
    
    jtfPlaintext.setActionCommand("Encode");
    jtfCiphertext.setActionCommand("Decode");
    jtfPlaintext.addActionListener(this);
    jtfCiphertext.addActionListener(this);
    
    jfrm.add(jlabPlaintext);
    jfrm.add(jtfPlaintext);
    jfrm.add(jlabCiphertext);
    jfrm.add(jtfCiphertext);
    
    JButton jbtnEncode = new JButton ("Encode");
    JButton jbtnDecode = new JButton ("Decode");
    JButton jbtnReset = new JButton ("Reset");
    jbtnEncode.addActionListener(this);
    jbtnDecode.addActionListener(this);
    jbtnReset.addActionListener(this);
    
    jfrm.add(jbtnEncode);
    jfrm.add(jbtnDecode);
    jfrm.add(jbtnReset);
    
    jfrm.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Encode"))
        {
        StringBuilder str = new StringBuilder(jtfPlaintext.getText());
        
        //add 1 to each charecter
        for (int i=0; i<str.length(); i++)
            str.setCharAt(i, (char)(str.charAt(i)+1));
        
        jtfCiphertext.setText(str.toString());
        }
        
        else if(ae.getActionCommand().equals("Decode"))
        {
        StringBuilder str = new StringBuilder(jtfCiphertext.getText());
        
        for (int i=0; i<str.length(); i++)
            str.setCharAt(i, (char)(str.charAt(i) - 1));
        
        jtfPlaintext.setText(str.toString());
        }
        
        else
        {
        jtfPlaintext.setText("");
        jtfCiphertext.setText("");
        }
    }
}
