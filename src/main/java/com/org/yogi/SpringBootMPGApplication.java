package com.org.yogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMPGApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMPGApplication.class, args);
	}

}
