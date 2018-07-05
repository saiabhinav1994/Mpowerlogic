import java.sql.*;
import java.sql.Connection;
public class JdbcEmployeeSsn {   
	   
	   public static void main(String[] args) {
	   
	   try{
	      //STEP 2: Register JDBC driver
		   Class.forName("com.mysql.jdbc.Driver");

	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcsample?SSL=false","root","root");
			Statement stmnt=con.createStatement();
			
	      
	      String sql = "CREATE TABLE SSN(emp_id INT NOT NULL,SSN VARCHAR(255),FOREIGN KEY (emp_id) REFERENCES employee(emp_id))";
	                    

	      stmnt.executeUpdate(sql);
	      System.out.println("Created table in given database...");
	      con.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }
	      
	      
	 
	   
	}
	}
