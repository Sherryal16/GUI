
package gui;

import java.awt.*;

public class addcomponents extends Frame 

{
    addcomponents()
    {
        //declaration
        TextField tf;
        Button bt;
        Label lb;
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
        
        //frame ki description
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    
    }
    public static void main(String[] args)
    {
            addcomponents obj=new addcomponents();
    }
}

