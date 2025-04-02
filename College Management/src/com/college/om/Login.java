package com.college.om;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField usernametxt;
    JPasswordField passwordField;
    JButton login;
    JButton back;
    Login()
    {
        JLabel username = new JLabel("UserName");
        username.setBounds(40,20,100,20);
        username.setForeground(Color.white);
        usernametxt = new JTextField();
        usernametxt.setBounds(150,20,150,20);
        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,20);
        password.setForeground(Color.white);
        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,20);
        login = new JButton("Log In");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        back = new JButton("Back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(usernametxt);
        add(username);
        add(password);
        add(passwordField);
        add(login);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("assets/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);

        ImageIcon lback1 = new ImageIcon(ClassLoader.getSystemResource("assets/login.png"));
        Image lback2 = lback1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon lback3 = new ImageIcon(lback2);
        JLabel lback = new JLabel(lback3);
        lback.setBounds(0,0,600,300);
        add(lback);
        setSize(600,300);
        setLocation(500,240);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == login )
            {
                String uname = usernametxt.getText();
                String pass = passwordField.getText();
                try{
                    Conn cn = new Conn();
                    String query = "select * from login where username= '"+uname+"' and password= '"+pass+"'";
                    cn.preparedStatement = cn.connection.prepareStatement(query);
                    ResultSet resultSet = cn.preparedStatement.executeQuery();
                    if(resultSet.next())
                    {
                        setVisible(false);
                        new Welcome();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                        setVisible(true);
                    }
                }catch (Exception exception)
                {
                    exception.getStackTrace();
                }
            }
            else {
                setVisible(false);
            }
    }
    public static void main(String[] args) {
        new Login();
    }
}
