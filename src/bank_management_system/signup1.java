
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class signup1 extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3;
    JRadioButton r1,r2,r3;
    JComboBox c1,c2,c3;
    ButtonGroup bg;
    JTextArea tal;
    JButton b1,b2;
    String day[] = new String[31];
    String Year[] = new String[26];
    String month[] = new String[12];        
    
    int no;
    public signup1()
    {super("BANK MANAGEMENT SYSTEM");
        setBounds(150,80,678,560);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        Random r = new Random();
       no = 1000+r.nextInt(9999-1000);
       l1= new JLabel("APPLICATION FORM NO." + no);
        l1.setBackground(java.awt.Color.white);
        l1.setFont(new Font("tohoma",1,21));
        l1.setBounds(130,10,460,50);
        add(l1);
        l2= new JLabel("Page 1 : Personal Details");
        l2.setBackground(new java.awt.Color(255,204,204));
        l2.setFont(new Font("Trebuchet MS",1,16));
        l2.setForeground(new java.awt.Color(102,51,0));
        l2.setBounds(240,60,210,30);
        add(l2);
        l3= new JLabel("Name : ");
        l3.setBackground(new java.awt.Color(255,204,204));
        l3.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l3.setForeground(new java.awt.Color(102,51,0));
        l3.setBounds(50,130,160,30);
        add(l3);
        t1 = new JTextField();
        t1.setBackground(new Color(204,255,255));
        t1.setBounds(240,130,320,30);
        add(t1);
        l4 = new JLabel("contact no: ");
        l4.setBackground( new java.awt.Color(255,204,204));
        l4.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l4.setForeground(new java.awt.Color(102,51,0));
        l4.setBounds(50,180,170,30);
        add(l4);
      
        t2 = new JTextField();
        t2.setBackground(new Color(204,255,255));
        t2.setBounds(240,180,320,30);
        add(t2);
        
        l5 = new JLabel("Gender: ");
        l5.setBackground( new java.awt.Color(255,204,204));
        l5.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l5.setForeground(new java.awt.Color(102,51,0));
        l5.setBounds(50,230,170,30);
        add(l5);
           
        r1 = new JRadioButton("Male");
        r1.setBackground( Color.white);
        r1.setBounds(240,230,80,30);
        add(r1);
            
        r2 = new JRadioButton("female");
        r2.setBackground( Color.white);
        r2.setBounds(320,230,80,30);
        add(r2);
      
        r3 = new JRadioButton("Other");
        r3.setBackground( Color.white);
        r3.setBounds(400,230,80,30);
        add(r3);
        
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        l6 = new JLabel("Date Of Birth:");
        l6.setBackground( new java.awt.Color(255,204,204));
        l6.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l6.setForeground(new java.awt.Color(102,51,0));
        l6.setBounds(50,280,170,30);
        add(l6);
        
        for(int i=1;i<=31;i++)
        {day[i-1]= String.valueOf(i);}
        c1= new JComboBox(day);
        c1.setBounds(240,280,60,30);
        add(c1);
        for(int i =1;i<=12;i++)
        {month[i-1]= String.valueOf(i);}
        c2= new JComboBox(month);
        c2.setBounds(330,280,110,30);
        add(c2);
        for(int i=1990;i<=2015;i++)
        {Year[i-1990]= String.valueOf(i);}
        c3= new JComboBox(Year);
        c3.setBounds(480,280,80,30);
        add(c3);
        l7 = new JLabel("Email Address:");
        l7.setBackground( new java.awt.Color(255,204,204));
        l7.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l7.setForeground(new java.awt.Color(102,51,0));
        l7.setBounds(50,330,170,30);
        add(l7);
        t3 = new JTextField();
        t3.setBackground(new Color(204,255,255));
        t3.setBounds(240,330,320,30);
        add(t3);
        l8 = new JLabel("Address:");
        l8.setBackground( new java.awt.Color(255,204,204));
        l8.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l8.setForeground(new java.awt.Color(102,51,0));
        l8.setBounds(50,380,170,30);
        add(l8);
       
        tal = new JTextArea();
        tal.setBackground(new Color(204,255,255));
        tal.setBounds(240,376,320,30);
        add(tal); 
        
        b1 = new JButton("NEXT");
        b1.setBackground(Color.black);
        b1.setFont(new Font ("Tahoma",1,16));
        b1.setForeground(new Color(255,0,0));
        b1.setBounds(240,450,110,30);
        
       //signup1  obj = new signup1();
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("CANCEL");
        b2.setBackground(Color.black);
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(new Color(255,0,0));
        b2.setBounds(380,450,110,30);
      
        b2.addActionListener(this); 
        add(b2);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name, contact,gender = "",dob="",gmail,address;
        name = t1.getText();
        contact = t2.getText();
        
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
                 gender = "Female";
        }
        else if(r3.isSelected())
        {
            gender = "Other";
        } 
    dob = String.valueOf(c1.getSelectedItem()) + "-" + String.valueOf(c2.getSelectedItem())+ "-" + String.valueOf(c3.getSelectedItem());
    gmail = t3.getText();
    address = tal.getText();
    if (e.getSource() == b1)
    {if(name.equals("") || gmail.equals("") || address.equals("")){
        JOptionPane.showMessageDialog(null, "Fields should not be empty");}
    else{
        conn c= new conn();
        String q ="insert into signup1 values('" +no+"','"+ name + "','"+contact+"','"+ gender +"','"+ dob +"','"+gmail+"','"+address+"')";
        try{
            int msg =c.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
            setVisible(false);
           new signup2(no);}
        catch(SQLException ex){
            Logger.getLogger(signup1.class.getName()).log(Level.SEVERE,null,ex);
        }}}
    else{
        setVisible(false);
    }}
     public static void main(String[] args){   
         new signup1();
     }}

            
