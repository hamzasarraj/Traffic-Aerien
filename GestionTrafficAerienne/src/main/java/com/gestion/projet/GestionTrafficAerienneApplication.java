package com.gestion.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling 
@EnableWebMvc
public class GestionTrafficAerienneApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionTrafficAerienneApplication.class, args);
	}

}
