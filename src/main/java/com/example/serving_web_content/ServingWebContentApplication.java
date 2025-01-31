package com.example.serving_web_content;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ServingWebContentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}
}