package com.fortifydata.CodingExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import javax.sql.DataSource;

@SpringBootApplication
public class CodingExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingExerciseApplication.class, args);
	}

//	@Bean
//	@DependsOn("bean_name")
//	public DataSource dataSource1(DataSourceProperties ds1Properties) {
//		return He
//	}
//
//	@Bean
//	@DependsOn("bean_name")
//	public DataSource dataSource2(DataSourceProperties ds2Properties) {
//		return null;
//	}
//
//	@Bean
//	public DataSourceProperties ds1Properties() {
//		return null;
//	}
}
