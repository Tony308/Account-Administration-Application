package com.qa.backend;

import com.qa.backend.data.entity.Account;
import com.qa.backend.data.webservice.AccountsController;
import com.qa.backend.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private AccountsService accountService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountService.addAccount("Tony", "Huang", "1");
		accountService.addAccount("John", "Gordon","2");
		accountService.addAccount("James", "Wong", "3");
		accountService.addAccount("John", "Smith", "4");
		accountService.addAccount("Hulk", "Hogan", "5");
		accountService.addAccount("Mohammed", "Ali", "6");
		accountService.addAccount("Elvis", "Presly", "7");

		accountService.lookUp().forEach(Account -> System.out.println(Account));
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/").allowedOrigins("http://localhost:8081");
			registry.addMapping("/get").allowedOrigins("http://localhost:8081");
			registry.addMapping("/post").allowedOrigins("http://localhost:8081");
			registry.addMapping("/{id}").allowedOrigins("http://localhost:8081");
			}
		};
	}

}

