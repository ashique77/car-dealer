import java.sql.*;
import javax.swing.JOptionPane;
public class SearchUser
{
  public static void main(String arg[]) throws Exception
  {
      Class.forName("com.mysql.jdbc.Driver");  

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HPDatabase","root","password");
    char ch=JOptionPane.showInputDialog("Enter choice..\n a) By Type\n b) By Name ").charAt(0);
    if(ch=='a')
    {
      PreparedStatement pst = con.prepareStatement(
                                 "Select * from User where role=?");
 
   String role = JOptionPane.showInputDialog("Enter Role:");
   
     pst.setString(1, role  );
      ResultSet rs=pst.executeQuery();

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("user_id")+"\t"+ rs.getString("password")+"\t"+ rs.getString("role")+"\t"+ rs.getString("status")+"\t"+ rs.getString("user_full_name")+"\t"+ rs.getString("user_phone")+"\t"+ rs.getString("user_email")+"\t"+ rs.getString("user_address"));
     }         

     con.close();
    }
else if(ch=='b')
{
      PreparedStatement pst = con.prepareStatement(
                                 "Select * from User where user_full_name=?");
 
   String name = JOptionPane.showInputDialog("Enter User Name:");
   
     pst.setString(1, name  );
      ResultSet rs=pst.executeQuery();

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("user_id")+"\t"+ rs.getString("password")+"\t"+ rs.getString("role")+"\t"+ rs.getString("status")+"\t"+ rs.getString("user_full_name")+"\t"+ rs.getString("user_phone")+"\t"+ rs.getString("user_email")+"\t"+ rs.getString("user_address"));
     }         

     con.close();
}
else
System.out.println("Invalid choice.. ");
  }//end of main

}//end of class
