package com.simple.user.application.simpleuserapplication;

import com.simple.user.application.simpleuserapplication.Repository.UserRepository;
import com.simple.user.application.simpleuserapplication.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SimpleuserapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleuserapplicationApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository){
		return args -> {
			Stream.of("Jonh", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
