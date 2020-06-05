package com.melody1music.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.melody1music.project.framework.property.FileStorageProperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class Melody1musicApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Melody1musicApplication.class, args);
	}

}
