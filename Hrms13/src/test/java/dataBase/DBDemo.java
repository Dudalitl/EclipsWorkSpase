package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DBDemo {
	
	String dbUsername= "syntax_hrm";
	String dbPasword= "syntaxhrm123";
	String dbURL = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void abc() throws SQLException {
		Connection conn= DriverManager.getConnection(dbURL, dbUsername, dbPasword);
		System.out.println("DB connection is successful");
		Statement st= conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		rs.next();
		String firstName = rs.getString("emp_firstname");
		System.out.println(firstName);
		
		
	}
	
	

}
