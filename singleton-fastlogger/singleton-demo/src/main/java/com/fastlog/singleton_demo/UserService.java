package com.fastlog.singleton_demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final LoggerService loggerService;

    public UserService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void createUser(String username) {
        loggerService.log("O seguinte usuário foi criado: " + username);
    }
}