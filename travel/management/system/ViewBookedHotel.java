package travel.management.system;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class ViewBookedHotel extends JFrame implements ActionListener {

    JButton back;

   ViewBookedHotel(String username) {
        setBounds(320, 160, 1000, 540);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);

        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblname = new JLabel("Hotel Name");
        lblname.setBounds(30, 90, 150, 25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220, 90, 150, 25);
        add(labelname);

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30, 130, 150, 25);
        add(lblpersons);

        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220, 130, 150, 25);
        add(labelpersons);
        
         JLabel lbldays = new JLabel("Total Days");
      lbldays.setBounds(30, 170, 150, 25);
        add(lbldays);

        JLabel labeldays = new JLabel();
        labeldays.setBounds(220, 170, 150, 25);
        add( labeldays);
        
         JLabel lblac = new JLabel("AC/Non-AC");
       lblac.setBounds(30, 210, 150, 25);
        add(lblac);

        JLabel labelac = new JLabel();
        labelac.setBounds(220, 210, 150, 25);
        add(labelac);
        
         JLabel lblfood = new JLabel("Food Included");
       lblfood.setBounds(30, 250, 150, 25);
        add(lblfood);

        JLabel labelfood = new JLabel();
       labelfood.setBounds(220, 250, 150, 25);
        add(labelfood);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 290, 150, 25);
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 290, 150, 25);
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 330, 150, 25);
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 330, 150, 25);
        add(labelnumber);

        JLabel lblphone= new JLabel("Phone");
        lblphone.setBounds(30, 370, 150, 25);
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 370, 150, 25);
        add(labelphone);

        JLabel lblcost = new JLabel("Total Cost");
        lblcost.setBounds(30, 410, 150, 25);
        add(lblcost);

        JLabel labelcost = new JLabel();
        labelcost.setBounds(220, 410, 150, 25);
        add(labelcost);

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130, 460, 100, 25);
        back.addActionListener(this);
        add(back);

        
          ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(450, 20, 500, 400);
        add(image2);
        
        try {
            
            Conn conn = new Conn();
            String query = "select * from bookhotel where username = '"+username+"'";
           ResultSet rs = conn.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               
               labelid.setText(rs.getString("id"));
              labelnumber.setText(rs.getString("number"));
              labelname.setText(rs.getString("name"));
              labelcost.setText(rs.getString("price"));
              labelphone.setText(rs.getString("phone")); 
              labelpersons.setText(rs.getString("persons"));
              labelfood.setText(rs.getString("food"));
              labelac.setText(rs.getString("ac"));
              labeldays.setText(rs.getString("days"));
              
           }
          
            
        } catch(Exception e) {
            e.printStackTrace();
        }

        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
            
   
    
    
    public static void main(String[] args) {
        new ViewBookedHotel("shweta106");
}
}



