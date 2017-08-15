import java.sql.*;
public class ViewUser 
{
public static void main(String  []args) throws Exception
{
  Class.forName("com.mysql.jdbc.Driver");

  Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/HPDatabase","root","password");   
    
  Statement stmt = con.createStatement();  
   
  ResultSet rs=stmt.executeQuery("SELECT * FROM User");

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("user_id")+"\t"+ rs.getString("password")+"\t"+ rs.getString("role")+"\t"+ rs.getString("status")+"\t"+ rs.getString("user_full_name")+"\t"+ rs.getString("user_phone")+"\t"+ rs.getString("user_email")+"\t"+ rs.getString("user_address"));
     }         
    con.close();
  }//end of main()

}//end of class



