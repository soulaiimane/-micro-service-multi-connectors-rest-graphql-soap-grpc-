package org.sid.customersataservice.web;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.customersataservice.entities.Customer;
import org.sid.customersataservice.meper.CustomerMapper;
import org.sid.customersataservice.repository.CustomerRepository;
import org.sid.customersataservice.stub.CustomerServic;
import org.sid.customersataservice.stub.CustomerServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class CustomerGrpcController extends CustomerServiceGrpc.CustomerServiceImplBase {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public void findAllCustomers(CustomerServic.GetAllCustomersRequest request, StreamObserver<CustomerServic.GetAllCustomersResponse> responseObserver) {
        List<Customer> customerList = customerRepository.findAll();
        List<CustomerServic.Customer> grpcCustomers =
                customerList.stream()
                        .map(customer -> customerMapper.fromCustomerToCustomerGrpc(customer)).collect(Collectors.toList());
        CustomerServic.GetAllCustomersResponse customersResponse=
                CustomerServic.GetAllCustomersResponse.newBuilder()
                        .addAllCustomers(grpcCustomers)
                        .build();
        responseObserver.onNext(customersResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void findCustomerById(CustomerServic.findCustomerByIdRequest request, StreamObserver<CustomerServic.findCustomerByIdResponse> responseObserver) {
        Customer customerEntity=customerRepository.findById(request.getId()).get();
        CustomerServic.findCustomerByIdResponse response=
                CustomerServic.findCustomerByIdResponse.newBuilder()
                        .setCustomer(customerMapper.fromCustomerToCustomerGrpc(customerEntity))
                        .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveCustomer(CustomerServic.saveCustomerRequest request, StreamObserver<CustomerServic.saveCustomerResponse> responseObserver) {
           Customer customer= customerMapper.fromCustomerGrpcToCustomer(request.getCustomer());
        Customer savedCustomer = customerRepository.save(customer);
        CustomerServic.saveCustomerResponse response=
                CustomerServic.saveCustomerResponse.newBuilder()
                        .setCustomer(customerMapper.fromCustomerToCustomerGrpc(savedCustomer))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();




    }

}
