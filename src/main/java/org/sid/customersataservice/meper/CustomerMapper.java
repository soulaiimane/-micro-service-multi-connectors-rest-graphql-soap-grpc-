package org.sid.customersataservice.meper;

import org.modelmapper.ModelMapper;
import org.sid.customersataservice.stub.CustomerServic;
import org.sid.customersataservice.dto.CustomerRequest;
import org.sid.customersataservice.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private  ModelMapper modelMapper=new ModelMapper();
    public Customer fromCustomerRequest(CustomerRequest customerRequest){
        Customer customer=new Customer();
        //customer.setName(customerRequest.name());
        // customer.setEmail(customerRequest.email());
        modelMapper.map(customerRequest,customer);
        return customer;

    }
    public CustomerServic.Customer fromCustomerToCustomerGrpc(Customer customer){
        return modelMapper.map(customer, CustomerServic.Customer.Builder.class).build();

    }
    public  Customer fromCustomerGrpcToCustomer(CustomerServic.CustomerRequest customerRequest){
        return modelMapper.map(customerRequest, Customer.class);

    }


}
