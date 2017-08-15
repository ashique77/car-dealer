import java.sql.*;
import javax.swing.JOptionPane;
public class DelProspect
{
  public static void main(String arg[]) throws Exception
  {
      Class.forName("com.mysql.jdbc.Driver");  
     Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/HPDatabase", "root","password");

 PreparedStatement pst = con.prepareStatement
      ("delete from Prospect where prospect_name=?" );
    
  String name  = JOptionPane.showInputDialog(null, "Enter Prospect Name");

     pst.setString(1, name );
     
int status =pst.executeUpdate();
     if(status >0)
     {
 System.out.println("\n\t------------------------  \n");
 System.out.println("\n\tData deleted successfully.\n");
 System.out.println("\n\t------------------------  \n");
	}
	else
        {
 System.out.println("\n\t------------------------  \n");
 System.out.println("\n\tData not deleted successfully.  \n");
 System.out.println("\n\t------------------------  \n");
	}
      con.close();
  }//end of main()
}//end of class