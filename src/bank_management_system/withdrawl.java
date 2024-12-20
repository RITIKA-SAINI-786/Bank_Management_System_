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
public class withdrawl extends JFrame implements ActionListener {
      JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
     JButton b1,b2;
     public withdrawl()
     {setBounds(150,80,680,554);
        setVisible(true);
        setLayout(null);
        l1= new JLabel("WITHDRAWL MONEY");
        l1.setBackground(new Color(255,255,255));
        l1.setFont(new Font("Trebuchet MS",1,13));
        l1.setFont(new java.awt.Font("Tahoma",1,18));
        l1.setBounds(190,50,230,40);
        add(l1);
        l2= new JLabel("Enter PIN:"); 
        l2.setFont(new java.awt.Font("Tahoma",1,14));
        l2.setBounds(110,130,160,30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(290,130,220,30);
        add(t1);
        
        l3= new JLabel("Enter Amount:"); 
        l3.setFont(new java.awt.Font("Tahoma",1,14));
        l3.setBounds(110,190,160,30);
        add(l3);
     
        t2 = new JTextField();
        t2.setBounds(290,190,220,30);
        add(t2);
        
        b1 = new JButton("WITHDRAWL");
        b1.setBackground( new java.awt.Color(0,0,0));
        b1.setFont(new Font ("Tahoma",1,16));
        b1.setForeground(Color.white);
        b1.setBounds(140,270,150,30);
        add(b1);
        b1.addActionListener(this); 
        
     /*   b2 = new JButton("CANCEL");
        b2.setBackground( new java.awt.Color(0,0,0));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(Color.white);
        b2.setBounds(320,270,150,30);
        add(b2);
        b2.addActionListener(this); */
     }
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == b1){
                try{
                    conn c = new conn();
                    String a = "select * from login where pinnumber='"+ t1.getText()+"' ";
                     ResultSet rs1 = c.s.executeQuery(a);
                     if(rs1.next()){
                     int bal = rs1.getInt(3);
                     int amount = Integer.parseInt(t2.getText());
                     int rem_am = bal-amount;
                     if(bal>amount)
                     {
                        
                        String q= "update login set balance='"+rem_am +"' where pinnumber='" + t1.getText()+"' ";
                         c.s.executeUpdate(q);
                         JOptionPane.showMessageDialog(null,"Money Withdrawed Successfully");
                         t1.setText("");
                         t2.setText(""); 
                }
                     else{
                          JOptionPane.showMessageDialog(null,"insufficient balance");
                     }
                     }
                     else{
                        JOptionPane.showMessageDialog(null,"PIN is wrong"); 
                     }
            }
                catch(SQLException ex){
            //Logger.getLogger(signup1.class.getName()).log(Level.SEVERE,null,ex);
            ex.printStackTrace();
                      }
        }
           /* else{
            setVisible(false);
            new transaction();
            
            
            }*/
     }
        
        public static void main(String [] args)
        {
            new withdrawl();
            
        }
        
}
