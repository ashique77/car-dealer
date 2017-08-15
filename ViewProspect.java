import java.sql.*;
public class ViewProspect 
{
public static void main(String  []args) throws Exception
{
  Class.forName("com.mysql.jdbc.Driver");

  Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/HPDatabase","root","password");   
    
  Statement stmt = con.createStatement();  
   
  ResultSet rs=stmt.executeQuery("SELECT * FROM Prospect");

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("prospect_id")+"\t"+ rs.getString("prospect_name")+"\t"+ rs.getString("prospect_phone")+"\t"+ rs.getString("prospect_email")+"\t"+ rs.getString("prospect_address")+"\t"+ rs.getString("interested_model")+"\t"+ rs.getString("interested_color")+"\t"+ rs.getString("date_of_visit")+"\t"+ rs.getString("status"));
     }         
    con.close();
  }//end of main()

}//end of class



