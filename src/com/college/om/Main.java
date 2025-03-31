package com.college.om;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements Runnable{
    Thread t;
    Main()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("assets/college.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);
//        JLabel wcltxt = new JLabel("A.C Patil College Of Engineering Navi Mumbai");
//        wcltxt.setBounds(140,800,100,20);
//        wcltxt.setFont(Font.getFont(Font.SANS_SERIF));
//       // add(wcltxt);
        t = new Thread(this);
        t.start();
        setVisible(true);
        int x = 1;
        for(int i = 2; i<=600; i+=4, x+=1)
        {
            setLocation(600-((i+x)/2),350-(i/2));
            setSize(i + 3 * x,i+x/2);
            try {
                Thread.sleep(10);
            }catch (Exception e)
            {
                e.getStackTrace();
            }
        }
    }
    public void run()
    {
        try{
            Thread.sleep(8000);
            setVisible(false);
            new Login();
        }catch (Exception e)
        {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
