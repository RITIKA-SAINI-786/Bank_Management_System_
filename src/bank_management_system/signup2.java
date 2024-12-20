/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;/**
 *
 * @author HP
 */
public class signup2 extends JFrame implements ActionListener {
     JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3;
    JButton b1,b2;
    JComboBox c1,c2,c3,c4;
    String form_no;
    public signup2(int x){
        form_no = String.valueOf(x);
   //   this.formno=formno;
        setBounds(150,80,710,527);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        l1= new JLabel(" Form no:");
        l1.setBackground(new java.awt.Color(255,204,204));
        l1.setFont(new Font("Trebuchet MS",1,16));
        l1.setForeground(new java.awt.Color(102,51,0));
        l1.setBounds(530,10,60,20);
        getContentPane().add(l1);
        t1 = new JTextField(form_no);
       t1.setBounds(600,10,70,20);
       add(t1);
        
        l2= new JLabel("Page 2: Additional details");
        l2.setBackground( java.awt.Color.black);
        l2.setFont(new Font("Trebuchet MS",1,18));
        l2.setForeground(new java.awt.Color(0,0,0));
        l2.setBounds(150,50,240,40);
        getContentPane().add(l2);
        
        l3= new JLabel("Religion");
        l3.setBackground( new Color(255,204,204));
        l3.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l3.setForeground(new java.awt.Color(102,51,0));
        l3.setBounds(50,130,160,30);
        add(l3);
        
        String religion[]= {"Hindu","Muslim","Sikh","Christan","other"};
        
        c1= new JComboBox(religion);
        c1.setBounds(240,130,250,30);
        add(c1);
        
        l4= new JLabel("Category");
        l4.setBackground( new Color(255,204,204));
        l4.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l4.setForeground(new java.awt.Color(102,51,0));
        l4.setBounds(50,180,170,30);
        add(l4);
        
        String category[]= {"General","OBC","SC","ST","other"};
        
        c2= new JComboBox(category);
        c2.setBounds(240,180,250,30);
        add(c2);
        
        l5= new JLabel("Occupation");
        l5.setBackground( new Color(255,204,204));
        l5.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l5.setForeground(new java.awt.Color(102,51,0));
        l5.setBounds(50,230,170,30);
        add(l5);
        
        String occupation[]= {"Salaried","self Employed","Business","Student","Retired","other"};
        
        c3= new JComboBox(occupation);
        c3.setBounds(240,230,250,30);
        add(c3);
        
        l6= new JLabel("Education");
        l6.setBackground( new Color(255,204,204));
        l6.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l6.setForeground(new java.awt.Color(102,51,0));
        l6.setBounds(50,280,170,30);
        add(l6);
        
        String education[]= {"Graduate","Non Graduate","Post Graduate"};
        
        c4= new JComboBox(education);
        c4.setBounds(240,280,250,30);
        add(c4);
        
        l7= new JLabel("Aadhar no:");
        l7.setBackground( new Color(255,204,204));
        l7.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l7.setForeground(new java.awt.Color(102,51,0));
        l7.setBounds(50,330,170,30);
        add(l7);
        
        t2 = new JTextField();
        t2.setBounds(240,330,250,30);
        add(t2);
         
        l8= new JLabel("PAN no:");
        l8.setBackground( new Color(255,204,204));
        l8.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l8.setForeground(new java.awt.Color(102,51,0));
        l8.setBounds(50,380,170,30);
        add(l8);
        
         t3 = new JTextField();
        t3.setBounds(240,380,250,30);
        add(t3);
        
         b1 = new JButton("NEXT");
        b1.setBackground(new java.awt.Color(255,255,255));
        b1.setFont(new java.awt.Font ("Tahoma",1,16));
        b1.setForeground(new java.awt.Color(255,0,0));
        b1.setBounds(240,450,110,30);
        add(b1);
       // signup1  obj = new signup1();
        b1.addActionListener(this); 
        
        b2 = new JButton("EXIT");
        b2.setBackground(new java.awt.Color(255,255,255));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(new java.awt.Color(255,0,0));
        b2.setBounds(380,450,110,30);
        add(b2);
        b2.addActionListener(this);
    }
        
        public void actionPerformed(ActionEvent e)
        {
          //  String formno = t1.getText();
            String form, rel,cat,occ,edu,aad,pan;
            rel = (String) c1.getSelectedItem();
            cat = (String) c2.getSelectedItem();
            occ = (String) c3.getSelectedItem();
            edu = (String) c4.getSelectedItem();
            aad=t2.getText();
            pan =t3.getText();
            
           conn c = new conn();
           form = t1.getText();
           int aa = 1;
      /*    try{
             
               conn c= new conn();
                String q = "insert into signup2 value('" + formno + "','" + rel + "','" + cat + "','" + occ + "','"+ edu + "','" + aad + "','"+ pan+"',')";
                c.s.executeUpdate(q);
          }
          catch(Exception ex)
          {
              System.out.println(ex);
          }*/
            
            if(e.getSource() == b1){
                if(form_no.equals(form)){
                  if(t1.getText().equals("") ||t2.getText().equals("")){
                      JOptionPane.showMessageDialog(null,"PLease Check All Input Fields");
                  }
                  else{
                      try{
                          String q = "insert into signup2 value('" + form_no + "','" + rel + "','" + cat + "','" + occ + "','"+ edu + "','" + aad + "','"+ pan+"')";
                          int result = c.s.executeUpdate(q);
                          JOptionPane.showMessageDialog(null," Data Inserted Successfully");
                          setVisible(false);
                          new signup3(form_no);
                      }
                      catch(Exception ex)
                      {
                           // Logger.getLogger(signup2.class.getName()).log(Level.SEVERE,null,ex);
                           ex.printStackTrace();
            }
                  }
                }
            }
                else{
                    try{
                
                    String q3 = "delete from signup1 where id= '" + form_no + "' ";
                    c.s.executeUpdate(q3);
                    setVisible(false);
                    }
                    catch(SQLException ex){
                       // Logger.getLogger(signup2.class.getName()).log(Level.SEVERE,null,ex);
                       ex.printStackTrace();
                    }
                }
            }
        public static void main(String[] args){
           int y =10;
            new signup2(y);
                    
                
            
    }
}
