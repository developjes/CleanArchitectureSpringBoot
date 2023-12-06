package com.jescompany.pizzeria.orders.webapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.jescompany.pizzeria.orders.*"} )
@EntityScan(basePackages = {"com.jescompany.pizzeria.orders.domain.entity"})
@EnableJpaRepositories(basePackages = {"com.jescompany.pizzeria.orders.application.interfaces"})
@EnableAutoConfiguration
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            /*
            System.out.println("Let's inspect the beans provided by Spring Boot:")

            String[] beanNames = ctx.getBeanDefinitionNames()
            Arrays.sort(beanNames)
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
            */
        };
    }
}