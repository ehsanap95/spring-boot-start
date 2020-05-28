package com.melody1music.project;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.WebApplicationInitializer;

import com.melody1music.project.music.controller.PersonController;

@SpringBootApplication
public class Melody1musicApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Melody1musicApplication.class, args);
	}

}
