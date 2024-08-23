package com.examplejpaproject.jpaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaprojectApplication.class, args); // This is the context that we created 
		UserRepository userRepository = context.getBean (UserRepository.class); // This is the repository that we created for the user class that we created in the jpaproject package in the src/main/java folder 
		user u = new user(); // This is the user object that we created
		u.setName("Kapil Raisinghani"); // This is the name of the user object that we created
		u.setCity("Mumbai"); // This is the city of the user object that we created
		user u1 =  userRepository.save(u); // This is the save method that we created in the UserRepository interface 
		System.out.println(u1); // This is the print statement that we created
	}

}
