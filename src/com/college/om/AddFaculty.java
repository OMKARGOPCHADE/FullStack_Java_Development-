package com.college.om;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddFaculty extends JFrame implements ActionListener {
    JTextField tname,fname1,txtaddrees,txtphone,txtemail,txtm10,txtm12,txtaadhar;
    JLabel empText;
    Random random = new Random();
    long f4 = Math.abs((random.nextLong() % 9000L) + 1000L);
    JDateChooser jDateChooser;
    JComboBox coursesBox,departmentBox;
    JButton sumbit,cancel;
    AddFaculty()
    {
        getContentPane().setBackground(new Color(166,15,158));

        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,40));
        add(heading);

        JLabel name = new JLabel("Name: ");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);
        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        add(tname);

        JLabel fname = new JLabel("Father Name: ");
        fname.setBounds(400,150,200,30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);
        fname1 = new JTextField();
        fname1.setBounds(600,150,150,30);
        add(fname1);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,200,30);
        empID.setFont(new Font("serif",Font.BOLD,20));
        add(empID);

        empText = new JLabel("23105"+f4);
        empText.setBounds(200,200,150,30);
        empText.setFont(new Font("serif",Font.BOLD,20));
        add(empText);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400,200,200,30);
        dob.setFont(new Font("serif",Font.BOLD,20));
        add(dob);

        jDateChooser = new JDateChooser();
        jDateChooser.setBounds(600,200,150,30);
        jDateChooser.setFont(new Font("serif",Font.BOLD,20));
        add(jDateChooser);

        JLabel address = new JLabel("Address");
        address.setBounds(50,250,200,30);
        address.setFont(new Font("serif",Font.BOLD,20));
        add(address);

        txtaddrees = new JTextField();
        txtaddrees.setBounds(200,250,150,30);
        add(txtaddrees);

        JLabel phone = new JLabel("Phone");
       phone.setBounds(400,250,200,30);
        phone.setFont(new Font("serif",Font.BOLD,20));
        add(phone);

        txtphone = new JTextField();
        txtphone.setBounds(600,250,150,30);
        add(txtphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50,300,200,30);
       email.setFont(new Font("serif",Font.BOLD,20));
        add(email);

        txtemail = new JTextField();
        txtemail.setBounds(200,300,150,30);
        add(txtemail);

        JLabel m10 = new JLabel("Class X (%)");
        m10.setBounds(400,300,200,30);
        m10.setFont(new Font("serif",Font.BOLD,20));
        add(m10);

        txtm10 = new JTextField();
        txtm10.setBounds(600,300,150,30);
        add(txtm10);

        JLabel m12 = new JLabel("Class XII (%)");
        m12.setBounds(50,350,200,30);
        m12.setFont(new Font("serif",Font.BOLD,20));
        add(m12);

        txtm12 = new JTextField();
        txtm12.setBounds(200,350,150,30);
        add(txtm12);

        JLabel aadhar = new JLabel("Aadhar No");
        aadhar.setBounds(400,350,200,30);
        aadhar.setFont(new Font("serif",Font.BOLD,20));
        add(aadhar);

        txtaadhar = new JTextField();
        txtaadhar.setBounds(600,350,150,30);
        add(txtaadhar);

        JLabel qualification = new JLabel("Qualification");
        qualification.setBounds(50,400,200,30);
       qualification.setFont(new Font("serif",Font.BOLD,20));
        add(qualification);

        String coures[] = {"BE","BTech","BA","MTech","ME","MMS","BMS","BPharm","MPharm","MCom","BCom","MA"};
        coursesBox = new JComboBox<>(coures);
        coursesBox.setBounds(200,400,150,30);
        coursesBox.setBackground(Color.white);
        add(coursesBox);

        JLabel department = new JLabel("Department");
        department.setBounds(400,400,200,30);
        department.setFont(new Font("serif",Font.BOLD,20));
        add(department);

        String departments[] = {"Computer Science","Information Technology","Civil","Electrical","Electronics"};
        departmentBox = new JComboBox<>(departments);
        departmentBox.setBounds(600,400,150,30);
        departmentBox.setBackground(Color.white);
        add(departmentBox);

        sumbit = new JButton("Submit");
        sumbit.setBounds(250,550,120,30);
        sumbit.setBackground(Color.black);
        sumbit.setForeground(Color.white);
        add(sumbit);
        sumbit.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        add(cancel);
        cancel.addActionListener(this);
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //tname,fname1,txtaddrees,txtphone,txtemail,txtm10,txtm12,txtaadhar;
            if(e.getSource()==sumbit)
            {
                String name = tname.getText();
                String fname = fname1.getText();
                String address = txtaddrees.getText();
                String phone = txtphone.getText();
                String email = txtemail.getText();
                double xi = Double.valueOf(txtm10.getText());
                double xii = Double.valueOf(txtm12.getText());
                String aadhar = txtaadhar.getText();
                int empid = Integer.parseInt(empText.getText());
                String dob = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
                String department = (String) departmentBox.getSelectedItem();
                String courses = (String)  coursesBox.getSelectedItem();

                try{

                    String query = "insert into teacher values(?,?,?,?,?,?,?,?,?,?,?,?)";
                    Conn cn = new Conn();
                    cn.preparedStatement = cn.connection.prepareStatement(query);;
                    cn.preparedStatement.setString(1,name);
                    cn.preparedStatement.setString(2,fname);
                    cn.preparedStatement.setInt(3,empid);
                    cn.preparedStatement.setString(4,dob);
                    cn.preparedStatement.setString(5,address);
                    cn.preparedStatement.setString(6,phone);
                    cn.preparedStatement.setString(7,aadhar);
                    cn.preparedStatement.setString(8,email);
                    cn.preparedStatement.setDouble(9,xi);
                    cn.preparedStatement.setDouble(10,xii);
                    cn.preparedStatement.setString(11,department);
                    cn.preparedStatement.setString(12,courses);
                    cn.preparedStatement.execute();
                    JOptionPane.showMessageDialog(null,"Details Inserted");
                    setVisible(false);

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
        new AddFaculty();
    }

}
