import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateColor
{
  public static void main(String args[]) throws Exception
  {
     Class.forName("com.mysql.jdbc.Driver");  
     Connection con =DriverManager.getConnection  ("jdbc:mysql://localhost:3306/HPDatabase", "root" , "password");
     
    PreparedStatement pst = con.prepareStatement(
                    "update Prospect set interested_color=? where prospect_name=?");
    
   String n  = JOptionPane.showInputDialog(null, "Enter Name");
   String p = JOptionPane.showInputDialog(null, "Enter Color");

  
     pst.setString(1, p );
     pst.setString(2, n );

     int status =pst.executeUpdate();
     if(status > 0)
     {
  System.out.println("\n\t------------------------  \n");
  System.out.println("\n\tRecord updated successfully.\n");
  System.out.println("\n\t------------------------\n");
      }
      else{
   System.out.println("\n\t------------------------\n");
      System.out.println("\n\tRecord not updated successfully.  \n");
   System.out.println("\n\t------------------------\n");
        }
      con.close();
  }//end of main()
}//end of class
