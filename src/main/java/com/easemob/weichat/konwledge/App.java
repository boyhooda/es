package com.easemob.weichat.konwledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.easemob.weichat.konwledge")
public class App {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
