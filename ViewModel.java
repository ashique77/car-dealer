import java.sql.*;
public class ViewModel 
{
public static void main(String  []args) throws Exception
{
  Class.forName("com.mysql.jdbc.Driver");

  Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/HPDatabase","root","password");   
    
  Statement stmt = con.createStatement();  
   
  ResultSet rs=stmt.executeQuery("SELECT * FROM Model");

     while(rs.next())
     {
      System.out.println("\t"+rs.getString("model_name") + "\t" 
                                          + rs.getString("description"));
     }         
    con.close();
  }//end of main()

}//end of class



