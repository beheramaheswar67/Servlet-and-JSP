package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        // Step 1: Load the MySQL JDBC Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbc"; // Replace 'jdbc' with your database name
            String user = "root";  // Your MySQL username
            String password = "mahesh@123";  // Your MySQL password
            
            try (Connection con = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection successfully established.");
                
                // Step 3: Prepare the SQL query with placeholders
				/*
				 * String query = "INSERT INTO `JDBC-tb`(name, roll, address) VALUES(?, ?, ?)";
				 */

                String query2 = "SELECT * FROM `JDBC-tb`";
                
                // Step 4: Create PreparedStatement
                try (PreparedStatement pstmt = con.prepareStatement(query2)) {
                    // Step 5: Set the values for the placeholders
					/*
					 * pstmt.setString(1, "Badal"); pstmt.setString(2, "103"); pstmt.setString(3,
					 * "India");
					 */
                    
                    ResultSet rs = pstmt.executeQuery();
                    
                    while(rs.next()) {
                    	System.out.println("Id: "+ rs.getInt(1));
                    	System.out.println("Name: "+ rs.getString(2));
                    	System.out.println("Roll: "+rs.getString(3));
                    	System.out.println("Address: "+rs.getString(4));
                    	System.out.println("............................");
                    }
                    
                    // Step 6: Execute the insert query
					/*
					 * int rowsAffected = pstmt.executeUpdate();
					 * 
					 * if (rowsAffected > 0) { System.out.println("Data successfully inserted."); }
					 * else { System.out.println("Error: Data insertion failed."); }
					 */
                } catch (SQLException e) {
                    System.out.println("Error executing the query.");
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                System.out.println("Error establishing the connection.");
                e.printStackTrace();
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}
