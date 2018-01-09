package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(
//		exclude = {HibernateJpaAutoConfiguration.class},
//		scanBasePackages = { "com.example" }
)
@EnableScheduling
public class Mars2MultitenantApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mars2MultitenantApplication.class, args);
	}
}
