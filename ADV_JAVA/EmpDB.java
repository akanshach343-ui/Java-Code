

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDB {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String driver_name="com.mysql.cj.jdbc.Driver";
       String host="jdbc:mysql://localhost:3306/empdb";
       String username="root";
       String password="sherni";
       String create_table="""
               CREATE TABLE IF NOT EXISTS employee(
               id INT PRIMARY KEY AUTO_INCREMENT,
               name VARCHAR(50) NOT NULL,
               dept VARCHAR(50),
               Salary DECIMAL(10,2)
               )
               """;
       try{
         Class.forName(driver_name);
         System.out.println("Driver is ready");
         Connection con=DriverManager.getConnection(host,username,password);
         System.out.println("Host is ready");
         //Statement smt=con.createStatement();
         Statement smt=con.createStatement(
           //ResultSet.TYPE_FORWARD_ONLY,
           ResultSet.TYPE_SCROLL_INSENSITIVE,
           ResultSet.CONCUR_READ_ONLY);
         smt.execute(create_table);
         System.out.println("Table is ready");
         ResultSet rs=smt.executeQuery("select * from employee");
         System.out.println("ID|Name|Dept|Salary");
           while(rs.next()){
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String dept=rs.getString("dept");
             long salary=rs.getLong("salary");
             System.out.println(String.format("%d\t%s\t%s\t\t%d",
                                              id,name,dept,salary));
           };
	       int rowAffected=smt.executeUpdate("""
	    	                         insert into employee
	    	                          (name, dept, salary) values('Emp1','Account', 40000),
	    	                                          ('Emp2','Account', 45500),
	    	                                          ('Emp3', 'IT',60000),
	    	                                          ('Emp4', 'Accountant', 36000)
	    	                                          
	    	                         """);
	       if(rowAffected>0){
	    	   System.out.println("Data inserted");
	       }else{
	    	   System.out.println("Data not inserted");
	       }
       }catch (ClassNotFoundException | SQLException e){
         e.printStackTrace();
       }

  }

}
