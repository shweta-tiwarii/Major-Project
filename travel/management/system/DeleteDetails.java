package travel.management.system;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class DeleteDetails extends JFrame implements ActionListener {

    JButton delete , back;
    String username;
   DeleteDetails(String username) {
       this.username=username;
        setBounds(450, 70, 840, 630);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);
        
         JLabel text = new JLabel("DELETE CUSTOMER DETAILS");
     text.setBounds(50,0,300,25);
     text.setFont(new Font("Tahoma",Font.PLAIN,20));
     add(text);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("id");
        lblid.setBounds(30, 110, 150, 25);
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 110, 150, 25);
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 170, 150, 25);
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 170, 150, 25);
        add(labelnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 230, 150, 25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220, 230, 150, 25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 290, 150, 25);
        add(lblgender);

        JLabel labelgender = new JLabel();
        labelgender.setBounds(220, 290, 150, 25);
        add(labelgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 350, 150, 25);
        add(lblcountry);

        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(220, 350, 150, 25);
        add(labelcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 410, 150, 25);
        add(lbladdress);

        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(220, 410, 150, 25);
        add(labeladdress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 470, 150, 25);
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 470, 150, 25);
        add(labelphone);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 530, 150, 25);
        add(lblemail);

        JLabel labelemail = new JLabel();
        labelemail.setBounds(220, 530, 150, 25);
        add(labelemail);

        delete = new JButton("Delete");
        delete.setBackground(Color.black);
         delete.setForeground(Color.white);
         delete.setBounds(350, 550, 100, 20);
         delete.addActionListener(this);
        add( delete);
        
          back = new JButton("Back");
        back.setBackground(Color.black);
         back.setForeground(Color.white);
         back.setBounds(490, 550, 100, 20);
         back.addActionListener(this);
        add( back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 190, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300, 210, 600, 200);
        add(image);
        
         
        
        try {
            
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
           ResultSet rs = conn.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
              labelnumber.setText(rs.getString("number"));
              labelname.setText(rs.getString("name"));
              labelgender.setText(rs.getString("gender"));
              labelcountry.setText(rs.getString("country")); 
              labeladdress.setText(rs.getString("address"));
              labelphone.setText(rs.getString("phone"));
              labelemail.setText(rs.getString("emails"));
           }
          
            
        } catch(Exception e) {
            e.printStackTrace();
        }

        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== delete)
       try {
           Conn c = new Conn();
           c.s.executeUpdate("delete from account where username = '"+username+"'");
           c.s.executeUpdate("delete from customer where username = '"+username+"'");
           c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
          c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
          
          JOptionPane.showMessageDialog(null, "Data Deleted Successfuly");
          setVisible(false);
           
       } catch(Exception e){
           e.printStackTrace();
       }
        else{
            setVisible(false);
        }
    
}
            
   
    
    
    public static void main(String[] args) {
        new DeleteDetails("shweta106");
}
}


