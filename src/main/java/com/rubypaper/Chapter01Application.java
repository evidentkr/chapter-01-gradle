package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.rubypaper"})
public class Chapter01Application {
//
	public static void main(String[] args) {
		/*
		 * SpringApplication application = new SpringApplication(Chapter01Application.class);
		 * application.setWebApplicationType(WebApplicationType.NONE); //SERVLET
		 * application.run(args);
		 */
		SpringApplication.run(Chapter01Application.class, args);
	}
}