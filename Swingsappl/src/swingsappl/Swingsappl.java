package swingsappl;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingsappl {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JFrame jf=new JFrame();
        jf.setTitle("First Form");
        jf.setSize(500,500);
        jf.setLayout(null);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JLabel lbl=new JLabel();
        lbl.setText("Enter first number");
        lbl.setBounds(100, 100, 150, 30);
        lbl.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        jf.add(lbl);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JTextField txt1=new JTextField();
        txt1.setBounds(300,100,150,30);
        jf.add(txt1);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JLabel lbl2=new JLabel();
        lbl2.setText("Enter second number");
        lbl2.setBounds(100, 180, 150, 30);
        lbl2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        jf.add(lbl2);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JTextField txt2=new JTextField();
        txt2.setBounds(300,180,150,30);
        jf.add(txt2);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JLabel lbl3=new JLabel();
        lbl3.setText("Result");
        lbl3.setBounds(100, 260, 150, 30);
        lbl3.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        jf.add(lbl3);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JTextField txt3=new JTextField();
        txt3.setEnabled(false);
        txt3.setBounds(300,260,150,30);
        jf.add(txt3);
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        JButton btn=new JButton();
        btn.setText("Show result");
        btn.setBounds(150,340,150,30);
        jf.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,c;
                a=Integer.parseInt(txt1.getText());
                 b=Integer.parseInt(txt2.getText());
                 c=a+b;
                 txt3.setText(Integer.toString(c));
            }
        });
        //------------------------------------------------------------------------------------------------------------------------------------------------------//
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
