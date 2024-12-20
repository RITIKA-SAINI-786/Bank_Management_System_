/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class login extends JFrame implements ActionListener {
       JLabel l1,l2,l3;
    JTextField t1,t2,t3;
     JButton b1,b2,b3;
     ResultSet rs;
     
        public login(){
            super("BANK MANAGEMENT SYSTEM");
             setBounds(150,120,860,484);
        getContentPane().setBackground(new Color (244,255,255));
        setVisible(true);
        setLayout(null);
        
          l1= new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
           l1.setBounds(230,30,460,50);
           l1.setFont(new Font("Tahoma",1,21));
        l1.setBackground(Color.white);
         add(l1);
         l2= new JLabel("Card No.");
           l2.setBounds(230,130,100,30);
        l2.setFont(new Font("Trebuchet MS",1,16));
        add(l2);
        t1 = new JTextField();
        t1.setBounds(370,130,290,30);
        add(t1);
        l3= new JLabel("PIN No.");
        l3.setBounds(230,210,100,30);
        l3.setFont(new Font("Trebuchet MS",1,16));
        add(l3);
        t2 = new JTextField();
        t2.setBounds(370,210,290,30);
        add(t2);
         b1 = new JButton("SIGN IN");
        b1.setBackground(new java.awt.Color(255,255,255));
        b1.setFont(new java.awt.Font ("Tahoma",1,16));
        b1.setForeground(new java.awt.Color(255,0,0));
        b1.setBounds(290,290,110,30);
        b1.addActionListener(this); 
        add(b1);
        b2 = new JButton("CLEAR");
        b2.setBackground(new java.awt.Color(255,255,255));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(new java.awt.Color(255,0,0));
        b2.setBounds(450,290,110,30);
        b2.addActionListener(this);
        add(b2);
        b3 = new JButton("SIGN UP");
        b3.setBackground(new java.awt.Color(255,255,255));
        b2.setFont(new Font ("Tahoma",1,16));
        b3.setForeground(new java.awt.Color(255,0,0));
        b3.setBounds(290,340,230,40);
        b3.addActionListener(this);
        add(b3);}
        public void actionPerformed(ActionEvent e){
             conn c = new conn();
              if(e.getSource()==b1){
                  try{
                      String cardnumber = t1.getText();
                      String pinnumber = t2.getText();
 String q = "Select * from signup3 where cardnumber ='"+ cardnumber + "' and pinnumber ='"+ pinnumber+ "' ";
                      rs = c.s.executeQuery(q);
                      if(rs.next()){
                          setVisible(false);
                          new transaction();} else {
 JOptionPane.showMessageDialog(null,"Your Card No And PIN No are Incorrect");
                        t1.setText("");
                        t2.setText("");}}
                  catch(Exception ex)
                      {// Logger.getLogger(signup2.class.getName()).log(Level.SEVERE,null,ex);
                          ex.printStackTrace();}}
              else if(e.getSource() == b2){
                        t1.setText("");
                        t2.setText("");}
              else if(e.getSource() == b3){
                  setVisible(false);
                  new signup1();}}
         public static void main(String[] args){
             new login();}}
