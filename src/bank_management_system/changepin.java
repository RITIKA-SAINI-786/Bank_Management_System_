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
public class changepin extends JFrame implements ActionListener {
     JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
     JButton b1,b2;
     public changepin()
     {setBounds(150,80,680,554);
        setVisible(true);
        setLayout(null);
        l1= new JLabel("CHANGE THE PIN:");
        l1.setBackground(new Color(255,255,255));
        l1.setFont(new Font("Trebuchet MS",1,13));
        l1.setFont(new java.awt.Font("Tahoma",1,18));
        l1.setBounds(190,50,230,40);
        add(l1);
        l2= new JLabel("Enter Old PIN:"); 
        l2.setFont(new java.awt.Font("Tahoma",1,14));
        l2.setBounds(80,130,160,30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(290,130,220,30);
        add(t1);
        l3= new JLabel("Enter New PIN:"); 
        l3.setFont(new java.awt.Font("Tahoma",1,14));
        l3.setBounds(80,190,160,30);
        add(l3);
        
          
         
        t2 = new JTextField();
        t2.setBounds(290,190,220,30);
        add(t2);
        
        l4= new JLabel(" Re-Enter New PIN:"); 
        l4.setFont(new java.awt.Font("Tahoma",1,14));
        l4.setBounds(80,250,160,30);
        add(l4);
        
        t3 = new JTextField();
        t3.setBounds(290,250,220,30);
        add(t3);
        
         b1 = new JButton("CHANGE");
        b1.setBackground( new java.awt.Color(0,0,0));
        b1.setFont(new Font ("Tahoma",1,16));
        b1.setForeground(Color.white);
        b1.setBounds(140,320,110,30);
        add(b1);
        b1.addActionListener(this); 
        
      /*  b2 = new JButton("CANCEL");
        b2.setBackground( new java.awt.Color(0,0,0));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(Color.white);
        b2.setBounds(280,320,110,30);
        add(b2);
        b2.addActionListener(this);  */
     }
      public void actionPerformed(ActionEvent e){
         try{
             String newpin = t2.getText();
             String oldpin = t1.getText();
             conn c = new conn();
             String q="select * from signup3 where pinnumber='"+t1.getText()+"' ";
             ResultSet rs= c.s.executeQuery(q);
             if(e.getSource() == b1){
                 if(rs.next())
                 {
                     if(t2.getText().length() == 4){
                         if(t2.getText().equals(t3.getText())){
                             String  q1="update signup3 set pinnumber = '" +newpin+"' where pinnumber = '"+oldpin+"'";
                             // String  q1 = "upadte signup3 set pin ='" + newpin + "','" + oldpin+"' ";
                             c.s.executeUpdate(q1);
                             String q2="update login set pinnumber = '" +newpin+"' where pinnumber = '"+oldpin+"'";
                        // String q2 =  "upadte login set pin ='" + newpin + "','"+oldpin+"' ";
                             c.s.executeUpdate(q2);  
                    JOptionPane.showMessageDialog(null,"Data Changed Successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    setVisible(false);
                    new transaction();
                         }
                         else{
                             JOptionPane.showMessageDialog(null,"Check your pin");  
                         }
                     }
                     else{
                         
                      JOptionPane.showMessageDialog(null,"PIN is Wrong");  
                     }
         } 
              /*   else if(e.getSource() == b2)
                 {
                     setVisible(false);
                    new transaction(); 
                 }
                 */
      }
         }
              catch(SQLException ex){
          //  Logger.getLogger(signup1.class.getName()).log(Level.SEVERE,null,ex);
          ex.printStackTrace();
                      }
      }
         
      public static void main(String[] args)       
      {
          new changepin();
          
      }
      
     

    
}
