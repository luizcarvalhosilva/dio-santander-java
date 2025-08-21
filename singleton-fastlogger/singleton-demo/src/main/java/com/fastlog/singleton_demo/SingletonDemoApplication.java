package com.fastlog.singleton_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDemoApplication implements CommandLineRunner {

    private final UserService userService;

    public SingletonDemoApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SingletonDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userService.createUser("João");
        userService.createUser("Maria");
    }
}
