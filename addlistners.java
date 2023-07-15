//action listener ki working 
//process is 1.declare(outside function )2.memory 3.setbounds 4add 5.register..........................
package gui;

import java.awt.*;
import java.awt.event.*;

public class addlistners extends Frame implements ActionListener
{
    //declaration
        TextField tf;
        Button bt;
        Label lb;
    addlistners()
    {

        //memory assignment
        lb=new Label("this is a label");
        tf=new TextField();
        bt=new Button(" button");
        //set bounds
        lb.setBounds(100, 100, 100, 30);
        tf.setBounds(100, 150, 100,30);
        bt.setBounds(150,250 ,70,50);
        //adding to frame 
         add(lb);
         add(tf);
         add(bt);
        //register
        bt.addActionListener(this);
        //frame ki description
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText(Math.random()+"");
        tf.setBounds(100, 150,400, 50);
       // lb.setBounds(100, 100, 100, 80);
        lb.setBackground(Color.red);
        lb.setText("HIIIIIII");
    }
    public static void main(String[] args)
    {
            addlistners obj=new addlistners();
    }

}

