package org.sid.customersataservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.sid.customersataservice.dto.CustomerRequest;
import org.sid.customersataservice.entities.Customer;
import org.sid.customersataservice.meper.CustomerMapper;
import org.sid.customersataservice.repository.CustomerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSoapController {
    CustomerRepository customerRepository;
    CustomerMapper customerMapper;
    @WebMethod
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
    @WebMethod
    public Customer findCustomerById(@WebParam(name = "id") Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer==null) throw new RuntimeException(String.format("Customer %d Not Found!!",id));
        return customer;
    }
    @WebMethod
    public Customer saveCustomer(@WebParam(name = "Customer") CustomerRequest customerRequest){
        Customer customer = customerMapper.fromCustomerRequest(customerRequest);
        return customerRepository.save(customer);
    }
    }

