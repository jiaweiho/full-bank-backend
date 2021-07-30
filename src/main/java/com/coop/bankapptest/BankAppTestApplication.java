package com.coop.bankapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAppTestApplication {

	public static final String API_VERSION_1 = "/api/v1";

	public static void main(String[] args) {
		SpringApplication.run(BankAppTestApplication.class, args);


	}

}
