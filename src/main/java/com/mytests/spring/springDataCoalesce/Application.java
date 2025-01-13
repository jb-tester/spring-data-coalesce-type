package com.mytests.spring.springDataCoalesce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(SomeEntityService someEntityService ) {
        return args -> {
            System.out.println("--------------------------------------");
            someEntityService.populateDB();
            someEntityService.testConstructors();
            System.out.println("--------------------------------------");
           // someEntityService.testMetestOneArgCoalesce();
        };
    }
}
