package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fatec.cadpro.dao.GenericDAOException;


public class ConnectionSingleton {

	private Connection con;
	private static ConnectionSingleton instancy;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "cadpro";
	boolean conectado = false; 
	
	private ConnectionSingleton() throws GenericDAOException   {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			if(!conectado){
				throw new GenericDAOException();
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			
		}
	}
	
	public static ConnectionSingleton getInstancy() {
		if (instancy == null) {
			try {
				instancy = new ConnectionSingleton();
			} catch  (Throwable e) {
				e.printStackTrace();
			}
		}
		return instancy;	
	}
	 
	public Connection getcon() {
		return this.con;
		
	}
	
}
