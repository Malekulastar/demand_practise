package ajava;

import java.sql.*;
public class Sol {

  public static void main(String[] args) throws ClassNotFoundException {

    
    Connection dbConnection = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
      String url = "jdbc:mysql://localhost:3306/mkd";
      
      dbConnection = DriverManager.getConnection(url,"root","180180107008");

      if (dbConnection != null) {
        System.out.println("Successfully connected to MySQL database test");
      }

    } catch (SQLException ex) {
      System.out.println("An error occurred while connecting MySQL databse");
      ex.printStackTrace();
    }

  }

}