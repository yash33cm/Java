import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class design {
    public static void main(String[] args) {
        train n =new train();
       
        
    }
    
}
class train extends JFrame{
    
  
    JTextField t1, t2,t3,t4;
    JButton b;
    JLabel l ,l1,l2,l3;
    JCheckBox c1,c2;

    train(){
        t1=new JTextField(20);
        t2= new JTextField(20);
        b =new JButton("ok");
        l=new JLabel("source");
        l2=new JLabel("no of passengers");
        c1= new JCheckBox("ff-player");
        c2 =new JCheckBox("web-developer");
        l1 =new JLabel("Destination");
        l3 =new JLabel("Date of travel");

        add(l);
        add(t1);
        add(l1);
        add(t2);
        add(l2);
        add(t3);
        add(l3);
        add(t4);
        add(b);
        
        add(c1);
        add(c2);
        add(l1);
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x =e.getX();
                int y=e.getY();
                System.out.println(x+" "+y);
            }

        });

        c1.addItemListener(ai ->{
            l1.setText("ff-player hu be chakke");
        });
        c2.addItemListener(ai ->{
            l1.setText("i m professional web developer");
        });
        b.addActionListener(ae ->{
            int num1 =Integer.parseInt(t1.getText());
            int num2 =Integer.parseInt(t2.getText());
            int val = num1+num2;
            l.setText(val+" ");
        });
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    
    
    }
}
