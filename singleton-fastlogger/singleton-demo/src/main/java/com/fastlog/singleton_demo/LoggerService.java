package com.fastlog.singleton_demo;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}