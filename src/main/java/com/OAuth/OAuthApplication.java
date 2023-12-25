package com.OAuth;

import com.OAuth.DAO.SecurityRepository;
import com.OAuth.Security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class OAuthApplication   {

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
	}

}
