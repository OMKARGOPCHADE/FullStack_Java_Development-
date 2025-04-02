package com.college.om;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame implements ActionListener {
    Welcome()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("assets/lab_bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,840, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();
        //new Information
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.black);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        newInfo.add(facultyInfo);
        facultyInfo.addActionListener(this);

        JMenuItem studentInfo =new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        newInfo.add(studentInfo);
        studentInfo.addActionListener(this);
        // Details
        JMenu details = new JMenu("View Details");
        newInfo.setForeground(Color.black);
        mb.add(details);

        JMenuItem facultyDetails = new JMenuItem("Faculty Details");
        facultyInfo.setBackground(Color.white);
        details.add(facultyDetails);
        facultyDetails.addActionListener(this);


        JMenuItem studentDetails =new JMenuItem("Student Details");
        studentInfo.setBackground(Color.white);
        details.add(studentDetails);
        studentDetails.addActionListener(this);


        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.black);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.white);
        leave.add(facultyLeave);
        facultyLeave.addActionListener(this);

        JMenuItem studentLeave =new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.white);
        leave.add(studentLeave);
        studentLeave.addActionListener(this);
//        Leave Details
        JMenu leaveDetails = new JMenu("View Leave Details");
       leaveDetails.setForeground(Color.black);
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.white);
        leaveDetails.add(facultyLeaveDetails);
        facultyLeaveDetails.addActionListener(this);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.white);
        leaveDetails.add(studentLeaveDetails);
        studentLeaveDetails.addActionListener(this);

//        Exam
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.black);
        mb.add(exam);

        JMenuItem examinantionDetails = new JMenuItem("Examination Results");
       examinantionDetails.setBackground(Color.white);
        exam.add(examinantionDetails);
        examinantionDetails.addActionListener(this);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.white);
        exam.add(enterMarks);
        enterMarks.addActionListener(this);

//        update info
        JMenu updateInfo = new JMenu("Update Info");
        updateInfo.setForeground(Color.black);
        mb.add(updateInfo);

        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Info");
        updateFacultyInfo.setBackground(Color.white);
        updateInfo.add(updateFacultyInfo);
        updateFacultyInfo.addActionListener(this);

        JMenuItem updateStudentInfo = new JMenuItem("Update Student Info");
        updateStudentInfo.setBackground(Color.white);
        updateInfo.add(updateStudentInfo);
        updateStudentInfo.addActionListener(this);

//        Fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.black);
        mb.add(fee);

        JMenuItem feeStrucutre = new JMenuItem("Fee Structure");
        feeStrucutre.setBackground(Color.white);
        fee.add(feeStrucutre);
        feeStrucutre.addActionListener(this);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.white);
        fee.add(feeForm);
        feeForm.addActionListener(this);

//      about
        JMenu about = new JMenu("About");
        about.setForeground(Color.black);
        mb.add(about);

        JMenuItem about1 = new JMenuItem("About");
        about1.setBackground(Color.white);
        about.add(about1);
        about1.addActionListener(this);

//      exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.black);
        mb.add(exit);

        JMenuItem exit1 = new JMenuItem("Exit");
        exit1.setBackground(Color.white);
        exit.add(exit1);
        exit1.addActionListener(this);

        setJMenuBar(mb);
        setSize(1540,850);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if(sm.equals("Exit"))
        {
            System.exit(1);
        }
        else if(sm.equals("New Faculty Information"))
        {
            new AddFaculty();
        }
        else if(sm.equals("New Student Information"))
        {
            new AddStudent();
        }
        else if(sm.equals("Faculty Details"))
        {
            new TeacherDetails();
        }
        else if(sm.equals("Student Details"))
        {
            new StudentDetails();
        }
        else if(sm.equals("Faculty Leave"))
        {
            new TeacherLeave();
        }
        else if(sm.equals("Student Leave"))
        {
            new StudentLeave();
        }
        else if(sm.equals("Faculty Leave Details"))
        {
            new TeacherLeaveDetails();
        }
        else if(sm.equals("Student Leave Details"))
        {
            new StudentLeaveDetails();
        }
        else if(sm.equals("Examination Results"))
        {
            new ExaminationDetails();
        }
        else if(sm.equals("Enter Marks"))
        {
            new EnterMarks();
        }
        else if(sm.equals("Update Faculty Info"))
        {
            new UpdateTeacher();
        }
        else if(sm.equals("Update Student Info"))
        {
            new UpdateStudent();
        }
        else if(sm.equals("Fee Structure"))
        {
            new FreeStructure();
        }
        else if(sm.equals("Student Fee Form"))
        {
            new StudentFeeForm();
        }
        else if(sm.equals("About"))
        {
            new About();
        }
    }
    public static void main(String[] args) {
        new Welcome();
    }

}
