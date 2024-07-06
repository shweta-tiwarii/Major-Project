
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard  extends JFrame implements ActionListener{
    
    String username;
     JButton addPersonalDetails,  viewPersonalDetails, updatePersonalDetails ,checkpackges,       bookpackage, viewpackages ,   viewhotels,    destinations;
     JButton bookhotel , viewbookedhotel ,  payments , calculators , notepad ,about, deletePersonalDetails;
    Dashboard( String username){
        this.username = username;
     // setBounds(0,0,1600,1000);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
     setLayout(null);
     
     JPanel p1 = new JPanel();
     p1.setLayout(null);
     p1.setBackground(new Color(0,0,102));
     p1.setBounds(0,0,1600,65);
     add(p1);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
     Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel icon = new JLabel(i3);
     icon.setBounds(5, 0,70,70);
     p1.add(icon);
     
     JLabel heading = new JLabel("Dashboard");
     heading.setBounds(80,10,300,40);
     heading.setForeground(Color.white);
     heading.setFont(new Font("Tahoma",Font.BOLD,30));
     p1.add(heading);
     
       JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBackground(new Color(0,0,102));
     p2.setBounds(0,65,300,900);
     add(p2);
         
     addPersonalDetails = new JButton("Add Personal Details");
      addPersonalDetails.setBounds(0,0,300,50);
     addPersonalDetails.setBackground(new Color(0,0,102));
     addPersonalDetails.setForeground(Color.white);
     addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
     addPersonalDetails.setMargin(new Insets(0,0,0,60));
      addPersonalDetails.addActionListener(this);
    p2. add(addPersonalDetails);
    
     updatePersonalDetails = new JButton("Update Personal Details");
     updatePersonalDetails.setBounds(0,42,300,50);
     updatePersonalDetails.setBackground(new Color(0,0,102));
     updatePersonalDetails.setForeground(Color.white);
     updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
   updatePersonalDetails.setMargin(new Insets(0,0,0,30));
         updatePersonalDetails.addActionListener(this);
    p2. add(updatePersonalDetails);
    
     viewPersonalDetails = new JButton("View Details");
     viewPersonalDetails.setBounds(0,84,300,50);
     viewPersonalDetails.setBackground(new Color(0,0,102));
     viewPersonalDetails.setForeground(Color.white);
     viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
   viewPersonalDetails.setMargin(new Insets(0,0,0,130));
    viewPersonalDetails.addActionListener(this);
    p2. add(viewPersonalDetails);
    
     deletePersonalDetails = new JButton("Delete Personal Details");
     deletePersonalDetails.setBounds(0,126,300,50);
     deletePersonalDetails.setBackground(new Color(0,0,102));
     deletePersonalDetails.setForeground(Color.white);
     deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
   deletePersonalDetails.setMargin(new Insets(0,0,0,40));
   deletePersonalDetails.addActionListener(this);
    p2. add(deletePersonalDetails);
    
    checkpackges = new JButton("Check Package");
     checkpackges.setBounds(0,168,300,50);
     checkpackges.setBackground(new Color(0,0,102));
     checkpackges.setForeground(Color.white);
     checkpackges.setFont(new Font("Tahoma",Font.PLAIN,20));
   checkpackges.setMargin(new Insets(0,0,0,110));
   checkpackges.addActionListener(this);
    p2. add(checkpackges);
    
      bookpackage = new JButton("Book Package");
      bookpackage.setBounds(0,210,300,50);
      bookpackage.setBackground(new Color(0,0,102));
      bookpackage.setForeground(Color.white);
      bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
    bookpackage.setMargin(new Insets(0,0,0,120));
       bookpackage.addActionListener(this);
    p2. add( bookpackage);
    
    viewpackages = new JButton("View Package");
      viewpackages.setBounds(0,252,300,50);
      viewpackages.setBackground(new Color(0,0,102));
    viewpackages.setForeground(Color.white);
      viewpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewpackages.setMargin(new Insets(0,0,0,120));
   viewpackages .addActionListener(this);
    p2. add( viewpackages);
    
    
    viewhotels = new JButton("View Hotels");
      viewhotels.setBounds(0,294,300,50);
      viewhotels.setBackground(new Color(0,0,102));
    viewhotels.setForeground(Color.white);
      viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewhotels.setMargin(new Insets(0,0,0,130));
       viewhotels .addActionListener(this);
    p2. add( viewhotels);
    
      bookhotel = new JButton("Book Hotel");
      bookhotel.setBounds(0,336,300,50);
      bookhotel.setBackground(new Color(0,0,102));
    bookhotel.setForeground(Color.white);
      bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
    bookhotel.setMargin(new Insets(0,0,0,140));
   bookhotel .addActionListener(this);
     
   
    p2. add(bookhotel);
     
     
      viewbookedhotel = new JButton("View Booked Hotel");
      viewbookedhotel.setBounds(0,378,300,50);
      viewbookedhotel.setBackground(new Color(0,0,102));
    viewbookedhotel.setForeground(Color.white);
      viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewbookedhotel.setMargin(new Insets(0,0,0,70));
      viewbookedhotel .addActionListener(this);
    p2. add(viewbookedhotel);
     
      destinations = new JButton("Destinations");
      destinations.setBounds(0,420,300,50);
      destinations.setBackground(new Color(0,0,102));
    destinations.setForeground(Color.white);
      destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
    destinations.setMargin(new Insets(0,0,0,125));
    destinations .addActionListener(this);
    p2. add(destinations);
     
     payments = new JButton("Payments");
      payments.setBounds(0,462,300,50);
      payments.setBackground(new Color(0,0,102));
    payments.setForeground(Color.white);
     payments.setFont(new Font("Tahoma",Font.PLAIN,20));
    payments.setMargin(new Insets(0,0,0,140));
     payments.addActionListener(this);
    p2. add(payments);
    
    
       calculators = new JButton("Calculator");
      calculators.setBounds(0,504,300,50);
      calculators.setBackground(new Color(0,0,102));
    calculators.setForeground(Color.white);
    calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
    calculators.setMargin(new Insets(0,0,0,145));
    calculators.addActionListener(this);
    p2. add(calculators);
     
     notepad = new JButton("Notepad");
    notepad.setBounds(0,546,300,50);
    notepad.setBackground(new Color(0,0,102));
    notepad.setForeground(Color.white);
    notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
    notepad.setMargin(new Insets(0,0,0,155));
    notepad.addActionListener(this);
    p2. add(notepad);
      
     about = new JButton("About");
      about.setBounds(0,588,300,50);
      about.setBackground(new Color(0,0,102));
    about.setForeground(Color.white);
     about.setFont(new Font("Tahoma",Font.PLAIN,20));
   about.setMargin(new Insets(0,0,0,170));
   about.addActionListener(this);
    p2. add(about);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel image = new JLabel(i6);
    image.setBounds(0,0,1650,1000);
     add(image);
     
     JLabel text = new JLabel("Travel and Tourism Management system");
     text.setBounds(400,70,1000,70);
     text.setForeground(Color.white);
     text.setFont(new Font("Raleway",Font.PLAIN,45));
    image. add(text);
     
     
      setVisible(true);
      
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if(ae.getSource()==  viewPersonalDetails){
            new ViewCustomer(username);
        } else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        } else if (ae.getSource()==     checkpackges){
            new checkPackage();
        } else if(ae.getSource() ==       bookpackage){
            new BookPackage(username);
        } else if(ae.getSource()== viewpackages){
            new ViewPackage(username);
        } else if (ae.getSource()== viewhotels){
            new CheckHotels();
        } else if (ae.getSource()==     destinations){
            new     Destinations();
        } else if (ae.getSource()== bookhotel){
            new BookHotel(username);
        } else if (ae.getSource()== viewbookedhotel){
            new ViewBookedHotel(username);
        } else if (ae.getSource()==  payments){
            new Payment();
        } else if (ae.getSource()== calculators){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e){
                e.printStackTrace();
            } 
        } else if(ae.getSource()== notepad){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            } catch(Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()== about){
            new About();
        } else if(ae.getSource()== deletePersonalDetails){
            new DeleteDetails(username);
        }
    }
   public static void main(String[] args) {
       new Dashboard("");
   }
}
