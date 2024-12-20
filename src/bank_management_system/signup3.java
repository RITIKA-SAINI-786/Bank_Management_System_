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
import java.util.logging.Logger; /**
 *
 * @author HP
 */
public class signup3 extends JFrame implements ActionListener {
     JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    ButtonGroup bg;
    Random r20,r21,r22,r23,r24;
    //int n1,n2,n3,pin;
    JButton b1,b2;
    String form_no;
    public signup3(String x)
    {form_no = x;
        setBounds(150,80,680,554);
        setVisible(true);
        setLayout(null);
        l1= new JLabel("Form no:");
        l1.setBackground(new Color(255,204,204));
        l1.setFont(new Font("Trebuchet MS",1,13));
        l1.setForeground(new java.awt.Color(102,51,0));
        l1.setBounds(470,10,60,20);
        getContentPane().add(l1);
        
        t1 = new JTextField(form_no);
        t1.setBounds(530,10,70,20);
        add(t1);
        
        l2= new JLabel("Page 3: Account Details");
        l2.setBackground(new java.awt.Color(255,255,255));
        l2.setFont( new java.awt.Font("Tohoma",1,18));
        l2.setForeground(new java.awt.Color(242,29,6));
        l2.setBounds(200,20,220,40);
        getContentPane().add(l2);
        
        l3= new JLabel("Account Type:");
        l3.setBackground(new Color(255,255,255));
        l3.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l3.setForeground(new java.awt.Color(51,51,255));
        l3.setBounds(80,70,120,30);
        add(l3);
        
           
        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new java.awt.Color(0,0,0));
        r1.setFont(new java.awt.Font("Tahoma",1,12));
        r1.setForeground(new java.awt.Color(255,255,255));
        r1.setBounds(180,110,130,30);
        add(r1);
            
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new java.awt.Color(0,0,0));
        r2.setFont(new java.awt.Font("Tahoma",1,12));
        r2.setForeground(new java.awt.Color(255,255,255));
        r2.setBounds(340,110,190,30);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setBackground(new java.awt.Color(0,0,0));
        r3.setFont(new java.awt.Font("Tahoma",1,12));
        r3.setForeground(new java.awt.Color(255,255,255));
        r3.setBounds(180,160,130,30);
        add(r3);
        
        r4 = new JRadioButton("Recuring desposit Account");
        r4.setBackground(new java.awt.Color(0,0,0));
        r4.setFont(new java.awt.Font("Tahoma",1,12));
        r4.setForeground(new java.awt.Color(255,255,255));
        r4.setBounds(340,160,190,30);
        add(r4);
        
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
        l4= new JLabel("Card Number:");
        l4.setBackground(new Color(255,255,255));
        l4.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l4.setForeground(new java.awt.Color(51,51,255));
        l4.setBounds(80,220,120,30);
        add(l4);
        
      //  r24 = new Random();
       // n4= 1000 + r24.nextInt(9999-1000);
        
        l5= new JLabel("XXXX-XXXX-XXXX-4184");
        l5.setBackground(new Color(0,0,0));
        l5.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l5.setForeground(new java.awt.Color(255,255,255));
        l5.setBounds(240,220,190,30);
        add(l5);
        
        l6= new JLabel("PIN:");
        l6.setBackground(new Color(255,255,255));
        l6.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l6.setForeground(new java.awt.Color(51,51,255));
        l6.setBounds(80,260,120,30);
        add(l6);
        
         
        l7= new JLabel("XXXX");
        l7.setBackground(new Color(0,0,0));
        l7.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l7.setForeground(new java.awt.Color(255,255,255));
        l7.setBounds(240,260,230,30);
        add(l7);
        
         
        l8= new JLabel("Service Required");
        l8.setBackground(new Color(255,255,255));
        l8.setFont(new java.awt.Font("Trebuchet MS",1,16));
        l8.setForeground(new java.awt.Color(51,51,255));
        l8.setBounds(80,310,140,30);
        add(l8);
        
         
        c1= new JCheckBox("ATM Card");
        c1.setBackground(new java.awt.Color(0,0,0));
        c1.setFont(new java.awt.Font("Tahoma",1,12));
        c1.setForeground(new java.awt.Color(255,255,255));
        c1.setBounds(190,350,120,23);
        add(c1);
        
        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new java.awt.Color(0,0,0));
        c2.setFont(new java.awt.Font("Tahoma",1,12));
        c2.setForeground(new java.awt.Color(255,255,255));
        c2.setBounds(340,350,140,23);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new java.awt.Color(0,0,0));
        c3.setFont(new java.awt.Font("Tahoma",1,12));
        c3.setForeground(new java.awt.Color(255,255,255));
        c3.setBounds(340,390,120,23);
        add(c3);
        
        c4= new JCheckBox("Email Alerts");
        c4.setBackground(new java.awt.Color(0,0,0));
        c4.setFont(new java.awt.Font("Tahoma",1,12));
        c4.setForeground(new java.awt.Color(255,255,255));
        c4.setBounds(190,390,140,23);
        add(c4);
        
        c5= new JCheckBox("Check Book");
        c5.setBackground(new java.awt.Color(0,0,0));
        c5.setFont(new java.awt.Font("Tahoma",1,12));
        c5.setForeground(new java.awt.Color(255,255,255));
        c5.setBounds(190,430,120,23);
        add(c5);
        
        c6= new JCheckBox("E-Statement");
        c6.setBackground(new java.awt.Color(0,0,0));
        c6.setFont(new java.awt.Font("Tahoma",1,12));
        c6.setForeground(new java.awt.Color(255,255,255));
        c6.setBounds(340,430,140,23);
        add(c6);
        
        b1 = new JButton("SUBMIT");
        b1.setBackground(new java.awt.Color(255,255,255));
        b1.setFont(new java.awt.Font ("Tahoma",1,16));
        b1.setForeground(new java.awt.Color(51,51,255));
        b1.setBounds(200,490,120,23);
        b1.addActionListener(this); 
        add(b1);
        
        b2 = new JButton("CANCEL");
        b2.setBackground(new java.awt.Color(255,255,255));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(new java.awt.Color(51,51,255));
        b2.setBounds(340,490,110,30);
        b2.addActionListener(this);
        add(b2);
        
    /*    r20 = new Random();
        pin = 1000+r20.nextInt(9999-1000);
        
         r21 = new Random();
        pin = 1000+r21.nextInt(9999-1000);
        
          r22 = new Random();
        pin = 1000+r22.nextInt(9999-1000);
        
          r23 = new Random();
        pin = 1000+r23.nextInt(9999-1000);
        
          r24 = new Random();
        pin = 1000+r24.nextInt(9999-1000);
        
        card_no = String.valueOf(n1) +"-"+ String.valueOf(n2)+"-"+ String.valueOf(n3)+"-"+ String.valueOf(n4);*/
    }
        
        
        public void actionPerformed(ActionEvent e)
        {
               if (e.getSource() == b1)
               {
            String account = "",services = "";
            if(r1.isSelected())
        {
            account = "Saving Account ";
        }
        else if(r2.isSelected())
        {
            account = "Fixed Deposit Account";
        }
        else if(r3.isSelected())
        {
            account = "Current Account";
        } 
           else if(r4.isSelected())
        {
            account = "Recuring Deposit Account";
        } 
            Random  random = new Random();
            String cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) +1000L);
            
            if(c1.isSelected())
            {
                services = "ATM card ,";
            }
             if(c2.isSelected())
            {
                services = services+ "Internet Banking ,";
            }
              if(c3.isSelected())
            {
                services = services+"Mobile Banking ,";
            }
               if(c4.isSelected())
            {
                services = services+"Email Alert ,";
            }
                if(c5.isSelected())
            {
                services = services+"Cheque Book, ";
            }
                 if(c6.isSelected())
            {
                services = services+"  E-Statement,";
            }
         /*    conn c= new conn();
               if (e.getSource() == b1)
               {
              if(form_no.equals(t1.getText())){
                  try{
                    String q = "insert into signup3 values('" + form_no + "', '" + cardnumber + "', '" + pinnumber+ "', '"+account +"', '"+services +"')";
                     c.s.executeUpdate(q);
                      int bal =0;
                      String q1 = "insert into login(card,pin,balance) values ('" + cardnumber+ "','"+pinnumber + "','"+bal+"')";
                       c.s.executeUpdate(q1);
                        JOptionPane.showMessageDialog(null,"Your Card Number is: "+ cardnumber + "\n Your Pin is: "+pinnumber);
                        setVisible(false);
                        new transaction();
                  }catch(SQLException ex){
                     // Logger.getLogger(signup3.class.getName()).log(Level.SEVERE,null,ex);
                      ex.printStackTrace();
                    }
                               }
              else{
                    JOptionPane.showMessageDialog(null,"check your form number"); 
              }
               }
               else{
                  try{
               
                 String q = "delete from signup1 where id ='" + form_no +"'";
                 String q1 = "delete from signup2 where id ='" + form_no +"'";
                 c.s.executeUpdate(q);
                 c.s.executeUpdate(q1);
                 setVisible(false);
                  JOptionPane.showMessageDialog(null,"form number is wrong: "); 
                  }
                 catch(SQLException ex){
                      //Logger.getLogger(signup3.class.getName()).log(Level.SEVERE,null,ex);
                       ex.printStackTrace();
                    }
                 
               }*/
         
         try{
             if(account.equals("")){
                  JOptionPane.showMessageDialog(null,"account type is required"); 
         }else{ 
                 conn c = new conn();
                 String q = "insert into signup3 values('" + form_no + "', '" + cardnumber + "', '" + pinnumber+ "', '"+account +"', '"+services +"')";
                     c.s.executeUpdate(q);
                 JOptionPane.showMessageDialog(null,"card number: " + cardnumber + "\n pin: " + pinnumber);
                 int bal =0;
                 String q1 = "insert into login values ('" + cardnumber+ "','"+pinnumber + "','"+bal+"')";
                  c.s.executeUpdate(q1);
             }
         }catch(SQLException ex)
         {
             ex.printStackTrace();
         }
               }
               else if(e.getSource()== b2)
               {
               }  
        
}
public static void main(String[] args)
{
    String form = "6765";
    new signup3(form);
}
}