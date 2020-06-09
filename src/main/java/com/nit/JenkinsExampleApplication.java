package com.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===================================================");
		System.out.println("*********   welcome to jenkins     **************");
		System.out.println("===================================================");
		
		System.out.println("===================================================");
		System.out.println("*********   my name is altap     **************");
		System.out.println("===================================================");
	}

}
