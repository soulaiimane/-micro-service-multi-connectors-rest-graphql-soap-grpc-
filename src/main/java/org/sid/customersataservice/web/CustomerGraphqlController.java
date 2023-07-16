package org.sid.customersataservice.web;

import lombok.AllArgsConstructor;
import org.sid.customersataservice.dto.CustomerRequest;
import org.sid.customersataservice.entities.Customer;
import org.sid.customersataservice.meper.CustomerMapper;
import org.sid.customersataservice.repository.CustomerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerGraphqlController {
    CustomerRepository customerRepository;
    CustomerMapper customerMapper;
    @QueryMapping
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
    @QueryMapping
    public Customer findCustomerById(@Argument Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer==null) throw new RuntimeException(String.format("Customer %d Not Found!!",id));
            return customer;
    }
    @MutationMapping
    public Customer saveCustomer(@Argument CustomerRequest customerRequest){
        Customer customer = customerMapper.fromCustomerRequest(customerRequest);
        return customerRepository.save(customer);
    }
}
