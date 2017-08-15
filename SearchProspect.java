import java.sql.*;
import javax.swing.JOptionPane;
public class SearchProspect
{
  public static void main(String arg[]) throws Exception
  {
      Class.forName("com.mysql.jdbc.Driver");  

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HPDatabase","root","password");
    char ch=JOptionPane.showInputDialog("Enter choice..\n a) By Status\n b) By Name ").charAt(0);
    if(ch=='a')
    {
      PreparedStatement pst = con.prepareStatement(
                                 "Select * from Prospect where status=?");
 
   String status = JOptionPane.showInputDialog("Enter Status:");
   
     pst.setString(1, status  );
      ResultSet rs=pst.executeQuery();

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("prospect_id")+"\t"+ rs.getString("prospect_name")+"\t"+ rs.getString("prospect_phone")+"\t"+ rs.getString("prospect_email")+"\t"+ rs.getString("prospect_address")+"\t"+ rs.getString("interested_model")+"\t"+ rs.getString("interested_color")+"\t"+ rs.getString("date_of_visit")+"\t"+ rs.getString("status"));
     }         

     con.close();
    }
else if(ch=='b')
{
      PreparedStatement pst = con.prepareStatement(
                                 "Select * from Prospect where prospect_name=?");
 
   String name = JOptionPane.showInputDialog("Enter Name:");
   
     pst.setString(1, name  );
      ResultSet rs=pst.executeQuery();

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("prospect_id")+"\t"+ rs.getString("prospect_name")+"\t"+ rs.getString("prospect_phone")+"\t"+ rs.getString("prospect_email")+"\t"+ rs.getString("prospect_address")+"\t"+ rs.getString("interested_model")+"\t"+ rs.getString("interested_color")+"\t"+ rs.getString("date_of_visit")+"\t"+ rs.getString("status"));
     }         

     con.close();
}
else
System.out.println("Invalid choice.. ");
  }//end of main

}//end of class
