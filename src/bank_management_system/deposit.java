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
/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class deposit extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    deposit(String pin){
        this.pin = pin;
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(190,350,400,35);
        l3.add(l1);
        
        t1.setBounds(190,420,320,25);
        l3.add(t1);
        
        b1.setBounds(390,588,150,35);
        l3.add(b1);
        
        b2.setBounds(390,633,150,35);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(960,1080);
        setUndecorated(true);
        setLocation(500,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    conn c = new conn();
                    c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new transaction(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}*/
  public class deposit extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1,t2;
     JButton b1,b2,b3;
    //String pinnumber;
     public deposit()
     {
       // this.pinnumber = pinnumber;
          setBounds(150,80,630,554);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        
        l1= new JLabel("Enter PIN:");
        l1.setBackground(new Color(255,204,204));
        l1.setFont(new Font("Trebuchet MS",1,13));
        l1.setForeground(new java.awt.Color(102,51,0));
        l1.setBounds(460,10,380,20);
        add(l1);
        
          
        t1 = new JTextField();
        t1.setBounds(530,10,100,40);
        add(t1);
        
        l2= new JLabel("Enter Amount You Want To Deposit");
        l2.setBackground(new java.awt.Color(255,255,255));
        l2.setFont(new Font("Trebuchet MS",1,18));
        l2.setForeground(new java.awt.Color(242,29,6));
        l2.setBounds(150,40,400,40);
        add(l2);
        
        t2 = new JTextField();
        t2.setBounds(180,130,280,40);
        add(t2);
        
             
         b1 = new javax.swing.JButton("DEPOSIT");
        b1.setBackground(new java.awt.Color(0,0,0));
        b1.setFont(new java.awt.Font ("Tahoma",1,16));
        b1.setForeground(Color.white);
        b1.setBounds(180,220,120,30);
        add(b1);
        b1.addActionListener(this); 
        
    /*    b2 = new javax.swing.JButton("CANCEL");
        b2.setBackground(new java.awt.Color(0,0,0));
        b2.setFont(new Font ("Tahoma",1,16));
        b2.setForeground(Color.white);
        b2.setBounds(330,220,130,30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new javax.swing.JButton("EXIT");
        b3.setBackground(new java.awt.Color(0,0,0));
        b3.setFont(new java.awt.Font ("Tahoma",1,16));
        b3.setForeground(Color.white);
        b3.setBounds(250,290,130,30);
        add(b3);
        b3.addActionListener(this); */
     }
     
        public void actionPerformed(ActionEvent e){
            
        //    String pinnumber = t1.getText();
         //   String amount = t2.getText();
            try{
                conn c =new conn();
                int bal = Integer.parseInt(t2.getText());
                 if(e.getSource() == b1){
                   if(t1.getText()==" "|| t2.getText()==" "){  
                      JOptionPane.showMessageDialog(null,"Fields Should Not Be Empty");
                   }
                   else{
                     
                       String q1 = "Update login set balance=balance+'" +bal+ "' where pinnumber='" + t1.getText() + "' ";
                       int result = c.s.executeUpdate(q1);
                       if(result == 1){
                             JOptionPane.showMessageDialog(null,"Amount Deposited Successfully");
                             t1.setText("");
                             t2.setText("");
                       }else{
                          JOptionPane.showMessageDialog(null,"Please check your PIN or Amount"); 
                       }
                             
                   }
                 }
                /* else if(e.getSource() == b2){
                     setVisible(false);
                     new transaction();  
                    setVisible(true);
            }
                 else if(e.getSource() == b3){
                  System.exit(0);
                 }*/
            }
            catch(SQLException ex){
                       // Logger.getLogger(signup2.class.getName()).log(Level.SEVERE,null,ex);
                       ex.printStackTrace();
                    }
        }
        public static void main(String[] args)
        {
            new deposit();
        }
}
