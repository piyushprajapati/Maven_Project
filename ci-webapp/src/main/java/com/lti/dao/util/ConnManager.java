package com.lti.dao.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnManager {
	
	public static Connection connect() {
		try {
			Properties dbProps=new Properties();
			
			//how to remove this hardcoded filename-- we need to pass the filename as env variable
			//one option is to pass VM arguments using  -D option
			
			//dbProps.load(new FileReader("dev-db.properties"));
			dbProps.load(ConnManager.class.getClassLoader().getResourceAsStream("dev-db.properties"));
			Class.forName(dbProps.getProperty("driverName"));
			return DriverManager.getConnection(dbProps.getProperty("url"), dbProps.getProperty("user"), dbProps.getProperty("pass"));
		}
		catch(ClassNotFoundException | IOException| SQLException e) {
			e.printStackTrace(); //we should rather throw an user defined exception
			return null; //very bad should throw an exception indicating some problem which trying to fetch data
		}
		
	}
	
	
	
	
/*	public static Connection connect() {
		try {
			//Step1. Loading the JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "123");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace(); //we should rather throw an user defined exception
			return null; //very bad should throw an exception indicating some problem which trying to fetch data
		}
		
	}*/

}
