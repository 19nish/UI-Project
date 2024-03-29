/**
 * 
 */
package com.ibm.jdbc;
//JDBC code 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author 003OQT744
 *
 */
public class demojdbc {

	/**
	 * @param args
	 */

	// Step 1
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/demo";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 2 
				// Declare the Coneection or prepaidstatement variable here 
				   Connection conn = null;
				   PreparedStatement stmt = null;
				   
				   try{
					   
					   // Step 3 Regiater Driver here and create connection 
					   
					   Class.forName("com.mysql.jdbc.Driver");

					   // Step 4 make/open  a connection 
					   
					      System.out.println("Connecting to database...");
					      conn = DriverManager.getConnection(DB_URL,USER,PASS);
					   
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      String sql="insert into course_registration  values ( ? , ?, ? )";
					      //String sql = "UPDATE Employees set age=? WHERE id=?";
					     // String sql1="delete from employee where id=?";
					     // stmt.setInt(1, 101);
					      stmt = conn.prepareStatement(sql);
					      int Student_Id=201;
					      int Course_Id= 101;
					      int Id=1;
					      stmt.setInt(1, Id);
					      stmt.setInt(2, Student_Id);
							stmt.setInt(3, Course_Id);

							stmt.executeUpdate();
					   
					      // Hard coded data 
					      
							/*
							 * int id=628; String name="Vabhav"; String address="Delhi"; String
							 * location="india"; //Bind values into the parameters. stmt.setInt(1, id); //
							 * This would set age stmt.setString(2,name); stmt.setString(3, address);
							 * stmt.setString(4, location); stmt.executeUpdate();
							 */
					    /*  
					   // Let us select all the records and display them.
					      sql = "SELECT id, name ,address, location FROM employeefc";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //STEP 5: Extract data from result set
					      while(rs.next()){
						         //Retrieve by column name
						         int eid  = rs.getInt("id");
						         String name1 = rs.getString("name");
						         String address1 = rs.getString("address");
						         String location1 = rs.getString("location");

						         //Display values
						         System.out.print("ID: " + eid);
						         System.out.print(", Age: " + name1);
						         System.out.print(", First: " + address1);
						         System.out.println(", Last: " + location1);
					      }
					           
					   
					   /*
					   
					   // Let us update age of the record with ID = 102;
					      int rows = stmt.executeUpdate();
					      System.out.println("Rows impacted : " + rows );

					      // Let us select all the records and display them.
					      sql = "SELECT id, name ,address, location FROM employee";
					      ResultSet rs = stmt.executeQuery(sql);

					      //STEP 5: Extract data from result set
					      while(rs.next()){
					         //Retrieve by column name
					         int eid  = rs.getInt("id");
					         String name1 = rs.getString("name");
					         String address1 = rs.getString("address");
					         String location1 = rs.getString("location");

					         //Display values
					         System.out.print("ID: " + eid);
					         System.out.print(", Age: " + name1);
					         System.out.print(", First: " + address1);
					         System.out.println(", Last: " + location1);
					      }*/
					      //STEP 6: Clean-up environment
					     // rs.close();
					      stmt.close();
					      conn.close();
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            stmt.close();
					      }catch(SQLException se2){
					      }// nothing we can do
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					   System.out.println("Goodbye!");
					}//end main

	}


