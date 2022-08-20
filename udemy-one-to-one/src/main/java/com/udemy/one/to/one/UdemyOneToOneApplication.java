package com.udemy.one.to.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class UdemyOneToOneApplication {

	public static void main(String[] args) {
//		SpringApplication.run(UdemyOneToOneApplication.class, args);

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user = "root";
		String pass = "Monye.ngene19";

		try{
			System.out.println("Connecting to database :"+jdbcUrl);

			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println(myConn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {

		}
	}

}
