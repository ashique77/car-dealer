import java.sql.*;
import javax.swing.JOptionPane;
public class AddNewUser
{
  public static void main(String arg[]) throws Exception
  {
      Class.forName("com.mysql.jdbc.Driver");  

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HPDatabase","root","password");
    char ch=JOptionPane.showInputDialog("Enter choice..\n a) Monitor\n b) Admin ").charAt(0);
    if(ch=='a')
    {
      PreparedStatement pst = con.prepareStatement(
                                 "insert into User  values(?,?,'Monitor',?,?,?,?,?)");
 
   String userId = JOptionPane.showInputDialog("Enter UserID: ");

   String password = JOptionPane.showInputDialog("Enter Password:");
   //String role = JOptionPane.showInputDialog("Enter Role:");
   String status = JOptionPane.showInputDialog("Enter Status:");
   String userFullName = JOptionPane.showInputDialog("Enter User Full Name:");
   String userPhone = JOptionPane.showInputDialog("Enter User Phone:");
   String userEmail = JOptionPane.showInputDialog("Enter User Email:");
   String userAddress = JOptionPane.showInputDialog("Enter User Address:");

     pst.setString(1, userId  );
     pst.setString(2, password );
     //pst.setString(3, 'Monitor'  );
     pst.setString(3, status  );
     pst.setString(4, userFullName  );
     pst.setString(5, userPhone  );
     pst.setString(6, userEmail  );
     pst.setString(7, userAddress  );

	int stat =pst.executeUpdate();
     if(stat > 0)
	{
 System.out.println("\n\t------------------------  \n");	
System.out.println("\n\tData saved successfully.  \n");
 System.out.println("\n\t------------------------  \n");
	}
	else {
     System.out.println("\n\tData not saved successfully.  \n");
	}
     con.close();


    }
    else if(ch=='b')
     {
     PreparedStatement pst = con.prepareStatement(
                                 "insert into User  values(?,?,'Admin',?,?,?,?,?)");
 
   String userId = JOptionPane.showInputDialog("Enter UserID: ");

   String password = JOptionPane.showInputDialog("Enter Password:");
   //String role = JOptionPane.showInputDialog("Enter Role:");
   String status = JOptionPane.showInputDialog("Enter Status:");
   String userFullName = JOptionPane.showInputDialog("Enter User Full Name:");
   String userPhone = JOptionPane.showInputDialog("Enter User Phone:");
   String userEmail = JOptionPane.showInputDialog("Enter User Email:");
   String userAddress = JOptionPane.showInputDialog("Enter User Address:");

     pst.setString(1, userId  );
     pst.setString(2, password );
     //pst.setString(3, 'Admin'  );
     pst.setString(3, status  );
     pst.setString(4, userFullName  );
     pst.setString(5, userPhone  );
     pst.setString(6, userEmail  );
     pst.setString(7, userAddress  );

  int stat =pst.executeUpdate();
     if(stat > 0)
	{
 System.out.println("\n\t------------------------  \n");	
System.out.println("\n\tData saved successfully.  \n");
 System.out.println("\n\t------------------------  \n");
	}
	else{
     System.out.println("\n\tData not saved successfully.  \n");
	}
     con.close();
    }
else
System.out.println("Invalid choice..");

  }//end of main

}//end of class
