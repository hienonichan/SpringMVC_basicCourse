package com.example.SellerWeb;

import javax.swing.Spring;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SellerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerWebApplication.class, args);
		System.out.println("server is running at http:://localhost:8080");
	}
}
