import java.sql.*;
import javax.swing.JOptionPane;
public class AddModel
{
  public static void main(String arg[]) throws Exception
  {
      Class.forName("com.mysql.jdbc.Driver");  

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HPDatabase","root","password");


    PreparedStatement pst = con.prepareStatement(
                                 "insert into Model  values(?,?)");
 
    String name = JOptionPane.showInputDialog(null, "Enter Model Name");

   String description = JOptionPane.showInputDialog(null, "Enter Description");

     pst.setString(1, name  );
     pst.setString(2, description );

     int status =pst.executeUpdate();
     if(status > 0)
	{
 System.out.println("\n\t------------------------  \n");	
System.out.println("\n\tData saved successfully.  \n");
 System.out.println("\n\t------------------------  \n");
	}
	else{
     System.out.println("\n\tData not saved successfully.  \n");
	}
     con.close();
  }//end of main

}//end of class
