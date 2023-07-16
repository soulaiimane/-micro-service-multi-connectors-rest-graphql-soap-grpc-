package org.sid.customersataservice.web;

import lombok.AllArgsConstructor;
import org.sid.customersataservice.entities.Customer;
import org.sid.customersataservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable("id") Long id){
        return customerRepository.findById(id).orElseThrow();
    }
    @PostMapping ("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
