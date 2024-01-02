package com.rakesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RakeshAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RakeshAppApplication.class, args);
		
ReportService reportService = context.getBean(ReportService.class);
		
		reportService.generateReport();
	}

}
