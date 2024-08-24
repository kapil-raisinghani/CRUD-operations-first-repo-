package com.examplejpaproject.jpaproject;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaprojectApplication.class, args); // This is the context
																								// that we created
		UserRepository userRepository = context.getBean(UserRepository.class); // This is the repository that we created
																				// for the user class that we created in
																				// the jpaproject package in the
																				// src/main/java folder
		
		 //CREATE
		 //to save the user, we can use the following code
		  //for single user, we can use the following code -
		  
		  user u = new user(); // This is the user object that we created
		  u.setName("Uttam"); // This is the name of the user object that we created
		  u.setCity("delhi"); // This is the city of the user object that we created
		  user u1 = userRepository.save(u); // This is the save method that we created in the UserRepository interface
		  System.out.println(u1); // This is the print statement that we created to print the user object that we created
		  
		  
		  //for multiple users, we can use the following code
		  user u2 = new user();
		  u2.setName("Jitendra");
		  u2.setCity("Mumbai");
		  
		  user u3 = new user();
		  u3.setName("Rahul");
		  u3.setCity("Bangalore");
		  
		  user u4 = new user();
		  u4.setName("Rohit");
		  u4.setCity("Pune");
		  
		  List<user> users = List.of(u2, u3, u4); // This is the list of users that we created
		  Iterable<user> result = userRepository.saveAll(users); // This is the saveAll method that we created in the UserRepository interface
		  result.forEach(user -> System.out.println(user)); // This is the forEach method that we created to print the user object that we created
		

		 //READ
		 //to get the user, we can use the following code
		 //example - to get the user with id 2
		 Optional<user> optional = userRepository.findById(2);
		 user userId2 = optional.get();
		 System.out.println(userId2);
		 // To read all the users, we can use the following code -
		 userRepository.findAll().forEach(user -> System.out.println(user));
		 
		 //findbyId(id) - to get the user with the specified id. returns optional containing your data.
		 //findAll() - to get all the users
		 //findAllById(ids) - to get all the users with the specified ids
		 //count() - to get the count of the users
		 //existsById(id) - to check if the user with the specified id exists
		 
	
		 
		 

		//UPDATE
		//to update the user, we can use the following code
		//example - to update the user with id 2
		//first we need to get the user with id 2
		Optional<user> optional1 = userRepository.findById(2);
		user userId = optional1.get();
		System.out.println(userId);
		//then we need to update the user with id 2
		userId.setName("Rahul Kumar");
		userId.setCity("Bangalore");
		user result2 = userRepository.save(userId);
		
		System.out.println(result2);
		
		//example - to update the user with id 102
		//first we need to get the user with id 102
		Optional<user> optional2 = userRepository.findById(102);
		user userId102 = optional2.get();
		System.out.println(userId102);
		//then we need to update the user with id 102
		userId102.setName("Hitesh Singh");
		userId102.setCity("Noida");
		user result3 = userRepository.save(userId102);
		System.out.println(result3);
		
		 
		 


         
		  
		 //DELETE
		 //to delete the user, we can use the following code
		 //delete(user entity) - to delete the specified user
		 //deleteAll() - to delete all the users
		 //deleteAll(entities) - to delete all the specified users
		 //deleteAllById(ids) - to delete all the users with the specified ids
		 //deleteById(id) - to delete the user with the specified id
         
		 //example - to delete the user with id 2(Rahul Kumar, Bangalore)
         userRepository.deleteById(2);
		 System.out.println("Deleted Successfully");

		 //example - to delete all the users
		 Iterable<user> allUsers = userRepository.findAll();
		 allUsers.forEach(user->System.out.println(user));
		 userRepository.deleteAll();  
		 //deleted all users successfully

		  

		 
		 

		 
	}

}
