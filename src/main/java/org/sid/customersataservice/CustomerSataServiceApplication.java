package org.sid.customersataservice;

import org.sid.customersataservice.entities.Customer;
import org.sid.customersataservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerSataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerSataServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Simo","Simo@Gmail.com"));
            customerRepository.save(new Customer(null,"Salim","Salim@Gmail.com"));
            customerRepository.save(new Customer(null,"SAid","SAid@Gmail.com"));
            customerRepository.save(new Customer(null,"Salah","Salah@Gmail.com"));
            customerRepository.save(new Customer(null,"Soulaimane","Soulaimane@Gmail.com"));
            customerRepository.save(new Customer(null,"Saad","Saad@Gmail.com"));
            customerRepository.save(new Customer(null,"Samir","Samir@Gmail.com"));
        };
    }

}
