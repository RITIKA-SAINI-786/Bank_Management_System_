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
public class transaction extends JFrame implements ActionListener{
     JLabel l1;
      JButton b1,b2,b3,b4,b5,b6,b7;
   //   String pinnumber;
      public transaction()
      {//     this.pinnumber= pinnumber;
          setBounds(150,80,680,554);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        l1= new JLabel("Please Select Your Transaction");
        l1.setBackground(new java.awt.Color(255,225,225));
        l1.setFont(new Font("Trebuchet MS",1,21));
        l1.setForeground(new java.awt.Color(242,29,6));
        l1.setBounds(180,40,350,40);
        add(l1);
         b1 = new javax.swing.JButton("PIN CHANGE");
        b1.setBackground(new java.awt.Color(0,0,0));
        b1.setFont(new java.awt.Font ("Tahoma",1,16));
        b1.setForeground(Color.white);
        b1.setBounds(80,130,200,30);
        add(b1);
        b1.addActionListener(this); 
        
        b2 = new javax.swing.JButton("BALANCE ENQUIRY");
        b2.setBackground(new java.awt.Color(0,0,0));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(new java.awt.Color(255,255,255));
        b2.setBounds(310,130,210,30);
        add(b2);
        b2.addActionListener(this);
        
        b5 = new javax.swing.JButton("DEPOSIT");
        b5.setBackground(new java.awt.Color(0,0,0));
        b5.setFont(new java.awt.Font ("Tahoma",1,16));
        b5.setForeground(new java.awt.Color(255,255,255));
        b5.setBounds(80,210,200,30);
        add(b5);
        b5.addActionListener(this); 
        
        b6 = new javax.swing.JButton("CASH WITHDRAWL");
        b6.setBackground(new java.awt.Color(0,0,0));
        b6.setFont(new Font ("Tahoma",1,16));
        b6.setForeground(new java.awt.Color(255,255,255));
        b6.setBounds(310,210,210,30);
        add(b6);
        b6.addActionListener(this);
        
        b7 = new javax.swing.JButton("EXIT");   
        b7.setBackground(new java.awt.Color(0,0,0));
        b7.setFont(new java.awt.Font ("Tahoma",1,16));
        b7.setForeground(new java.awt.Color(255,255,255));
        b7.setBounds(210,270,180,40);
        add(b7);
        b7.addActionListener(this);  
      }
       public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b1){
                 setVisible(false);
                 new changepin();
                 
             }
             else if(e.getSource() == b2){
                 try{
                     String pinnumber =  JOptionPane.showInputDialog(null,"Enter your PIN");
                     conn c = new conn();
                     String q = " Select * from Login where pinnumber='"+pinnumber+"' ";
                     ResultSet rs = c.s.executeQuery(q);
                     
                     if(rs.next()){
                         int balance =rs.getInt(3);
                         JOptionPane.showMessageDialog(null,"Your Balance is:"+balance);                                 
                 }
                     else{
                         JOptionPane.showMessageDialog(null,"Your PIN is wrong");
                     }
             }
                 catch(Exception ex)
                      {
                          //  Logger.getLogger(signup2.class.getName()).log(Level.SEVERE,null,ex);
                          ex.printStackTrace();
            }
                   
                 
        }
        if(e.getSource() == b5){
             setVisible(false);
             new deposit();
        }
         if(e.getSource() == b6){
             setVisible(false);
             new withdrawl();
        }
          if(e.getSource() == b7){
           
             System.exit(0);
             
        }
        }
       public static void main(String []args)
          {
              new transaction();
          }  
}
