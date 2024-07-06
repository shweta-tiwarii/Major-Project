
package travel.management.system;
import javax.swing.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener {
  
    Paytm(){
        setBounds(300,170,1000,520);
        //setLayout(null);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try{
            pane.setPage("https://paytm.com/rent-payment");
            
        } catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
           
        }
        
        JScrollPane sp = new    JScrollPane( pane);
        getContentPane().add(sp);
        
            
       JButton back = new JButton("Back") ;
       back.setBounds(610,20,80,40);
       back.addActionListener(this);
      pane. add(back);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    public static void main(String [] args){
       new Paytm();
    }
}
