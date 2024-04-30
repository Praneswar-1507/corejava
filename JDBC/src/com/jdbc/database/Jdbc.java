package com.jdbc.database;

import java.sql.*;

public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Connection connection = getConnection();
	        System.out.println(connection);
	      
	        delete();
	        insert();
	        //alter();
	        update();
	    }
	    
	        public static Connection getConnection() throws ClassNotFoundException, SQLException{
	            
	            Class .forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodBank","root","Eswar#07");
	            
	            return connection;
	        }
	        public static void update()throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="update Bank set donor_name='vasanth' where donor_id=4";
	          PreparedStatement p= connection.prepareStatement(query);
	          System.out.println("Updated Successfully");
	          p.execute();
	          connection.close();
	         }
	        public static void delete()throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="delete from Bank where donor_id=4";
	          PreparedStatement p= connection.prepareStatement(query);
	          System.out.println("Deleted Successfully");
	          p.execute();
	          connection.close();
	         }
	        public static void insert()throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="insert into Bank(donor_id,donor_name,blood_type,quantity,donatedBefore)values(4,'dube','AB+',2,true)";
	          PreparedStatement p= connection.prepareStatement(query);
	          System.out.println("Inserted Successfully");
	          p.execute();
	          connection.close();
	         }
	        public static void alter()throws ClassNotFoundException,SQLException
	         {
	          Connection connection = getConnection();
	          String query="alter table Bank add Noofday int(20)";
	          PreparedStatement p= connection.prepareStatement(query);
	          System.out.println("altered Successfully");
	          p.execute();
	          connection.close();
	         }


	}


