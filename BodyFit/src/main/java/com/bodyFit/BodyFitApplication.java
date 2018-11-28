package com.bodyFit;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BodyFitApplication {

//	@Autowired
//	private DataSource datasource;
	
//	public BodyFitApplication() {
//		// TODO Auto-generated constructor stub
//	
//		try {
//			PreparedStatement prepareStatement = datasource.getConnection().prepareStatement("sql");
//			prepareStatement
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(BodyFitApplication.class, args);
	}
}
