package by.itacademi.hotel.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.itacademi.hotel.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost/users?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

	private static final String SQL_SELECT_RIGHTS = "SELECT rights FROM user WHERE login = ? AND password = ?";
	private static final String SQL_SELECT_NAME = "SELECT name FROM user WHERE login = ? AND password = ?";
	
	Connection con;
	Statement st;
	PreparedStatement ps;

	@Override
	public String readRights(String login, String pass) {
		String rights = null;
		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_SELECT_RIGHTS);
			ps.setString(1, login);
			ps.setString(2, pass);
		
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() != false) {
				rights = rs.getString("rights");
			}
				
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rights;
	}

	@Override
	public String readName(String login, String pass) {
		String name = null;
		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			ps = con.prepareStatement(SQL_SELECT_NAME);
			ps.setString(1, login);
			ps.setString(2, pass);
		
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() != false) {
				name = rs.getString("name");
			}
				
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;
	}
	
	
}
