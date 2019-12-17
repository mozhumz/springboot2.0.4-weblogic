package com.mdm.dataimport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

//Tell Spring to automatically inject any dependencies that are marked in
//our classes with @Autowired
//@EnableAutoConfiguration
//// Tell Spring that this object represents a Configuration for the
//// application
//@Configuration
//// SpringBootWebLogicLegacyApplication is a SpringBootServletInitializer subclass and override its configure method.
@MapperScan("com.mdm.dataimport.mapper")
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {

	// Tell Spring to launch our app!
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

}
