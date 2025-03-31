package com.college.om;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;

public class StudentDetails extends JFrame implements ActionListener {

    Choice choice;
    JTable jTable;
    JButton search,cancel,print,update,add;
    public StudentDetails()
    {
        getContentPane().setBackground(new Color(202,154,207));
        JLabel s1 = new JLabel("Search By Roll Number");
        s1.setBounds(20,20,150,20);
        add(s1);

        choice = new Choice();
        choice.setBounds(180,20,150,20);
        add(choice);

        try {
            Conn cn = new Conn();
            String query = "select * from student";
            cn.preparedStatement = cn.connection.prepareStatement(query);
            ResultSet rs = cn.preparedStatement.executeQuery();
            while(rs.next())
            {
                choice.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jTable = new JTable();
        try {
            Conn cn = new Conn();
            String query = "select * from student";
            cn.preparedStatement = cn.connection.prepareStatement(query);
            ResultSet rs = cn.preparedStatement.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane js = new JScrollPane(jTable);
        js.setBounds(0,100,900,600);
        add(js);

        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);

        add = new JButton("Add");
        add.setBounds(220,70,80,20);
        add.addActionListener(this);
        add(add);

        update = new JButton("Update");
        update.setBounds(320,70,80,20);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(420,70,80,20);
        cancel.addActionListener(this);
        add(cancel);


        setLayout(null);
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search)
        {
            try {
                Conn cn = new Conn();
                int roll = Integer.parseInt(choice.getSelectedItem());
                String query = "select * from student where rollno = ?";
                cn.preparedStatement = cn.connection.prepareStatement(query);
                cn.preparedStatement.setInt(1,roll);
                ResultSet rs = cn.preparedStatement.executeQuery();
                jTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==print)
        {
            try {
                jTable.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==add)
        {

            new AddStudent();
        }
        else if(e.getSource()==update)
        {

        }
        else if(e.getSource()==cancel)
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentDetails();
    }
}
