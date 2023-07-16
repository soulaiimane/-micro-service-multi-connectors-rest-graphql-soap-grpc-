package org.sid.customersataservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: customerServic.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CustomerServic.GetAllCustomersRequest,
      CustomerServic.GetAllCustomersResponse> getFindAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllCustomers",
      requestType = CustomerServic.GetAllCustomersRequest.class,
      responseType = CustomerServic.GetAllCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CustomerServic.GetAllCustomersRequest,
      CustomerServic.GetAllCustomersResponse> getFindAllCustomersMethod() {
    io.grpc.MethodDescriptor<CustomerServic.GetAllCustomersRequest, CustomerServic.GetAllCustomersResponse> getFindAllCustomersMethod;
    if ((getFindAllCustomersMethod = CustomerServiceGrpc.getFindAllCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getFindAllCustomersMethod = CustomerServiceGrpc.getFindAllCustomersMethod) == null) {
          CustomerServiceGrpc.getFindAllCustomersMethod = getFindAllCustomersMethod = 
              io.grpc.MethodDescriptor.<CustomerServic.GetAllCustomersRequest, CustomerServic.GetAllCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "findAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.GetAllCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.GetAllCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("findAllCustomers"))
                  .build();
          }
        }
     }
     return getFindAllCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CustomerServic.findCustomerByIdRequest,
      CustomerServic.findCustomerByIdResponse> getFindCustomerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findCustomerById",
      requestType = CustomerServic.findCustomerByIdRequest.class,
      responseType = CustomerServic.findCustomerByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CustomerServic.findCustomerByIdRequest,
      CustomerServic.findCustomerByIdResponse> getFindCustomerByIdMethod() {
    io.grpc.MethodDescriptor<CustomerServic.findCustomerByIdRequest, CustomerServic.findCustomerByIdResponse> getFindCustomerByIdMethod;
    if ((getFindCustomerByIdMethod = CustomerServiceGrpc.getFindCustomerByIdMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getFindCustomerByIdMethod = CustomerServiceGrpc.getFindCustomerByIdMethod) == null) {
          CustomerServiceGrpc.getFindCustomerByIdMethod = getFindCustomerByIdMethod = 
              io.grpc.MethodDescriptor.<CustomerServic.findCustomerByIdRequest, CustomerServic.findCustomerByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "findCustomerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.findCustomerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.findCustomerByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("findCustomerById"))
                  .build();
          }
        }
     }
     return getFindCustomerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CustomerServic.saveCustomerRequest,
      CustomerServic.saveCustomerResponse> getSaveCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCustomer",
      requestType = CustomerServic.saveCustomerRequest.class,
      responseType = CustomerServic.saveCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CustomerServic.saveCustomerRequest,
      CustomerServic.saveCustomerResponse> getSaveCustomerMethod() {
    io.grpc.MethodDescriptor<CustomerServic.saveCustomerRequest, CustomerServic.saveCustomerResponse> getSaveCustomerMethod;
    if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
          CustomerServiceGrpc.getSaveCustomerMethod = getSaveCustomerMethod = 
              io.grpc.MethodDescriptor.<CustomerServic.saveCustomerRequest, CustomerServic.saveCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "saveCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.saveCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CustomerServic.saveCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("saveCustomer"))
                  .build();
          }
        }
     }
     return getSaveCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllCustomers(CustomerServic.GetAllCustomersRequest request,
                                 io.grpc.stub.StreamObserver<CustomerServic.GetAllCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllCustomersMethod(), responseObserver);
    }

    /**
     */
    public void findCustomerById(CustomerServic.findCustomerByIdRequest request,
                                 io.grpc.stub.StreamObserver<CustomerServic.findCustomerByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCustomerByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveCustomer(CustomerServic.saveCustomerRequest request,
                             io.grpc.stub.StreamObserver<CustomerServic.saveCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CustomerServic.GetAllCustomersRequest,
                CustomerServic.GetAllCustomersResponse>(
                  this, METHODID_FIND_ALL_CUSTOMERS)))
          .addMethod(
            getFindCustomerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CustomerServic.findCustomerByIdRequest,
                CustomerServic.findCustomerByIdResponse>(
                  this, METHODID_FIND_CUSTOMER_BY_ID)))
          .addMethod(
            getSaveCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CustomerServic.saveCustomerRequest,
                CustomerServic.saveCustomerResponse>(
                  this, METHODID_SAVE_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAllCustomers(CustomerServic.GetAllCustomersRequest request,
                                 io.grpc.stub.StreamObserver<CustomerServic.GetAllCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCustomerById(CustomerServic.findCustomerByIdRequest request,
                                 io.grpc.stub.StreamObserver<CustomerServic.findCustomerByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCustomerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCustomer(CustomerServic.saveCustomerRequest request,
                             io.grpc.stub.StreamObserver<CustomerServic.saveCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CustomerServic.GetAllCustomersResponse findAllCustomers(CustomerServic.GetAllCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public CustomerServic.findCustomerByIdResponse findCustomerById(CustomerServic.findCustomerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindCustomerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public CustomerServic.saveCustomerResponse saveCustomer(CustomerServic.saveCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CustomerServic.GetAllCustomersResponse> findAllCustomers(
        CustomerServic.GetAllCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CustomerServic.findCustomerByIdResponse> findCustomerById(
        CustomerServic.findCustomerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCustomerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CustomerServic.saveCustomerResponse> saveCustomer(
        CustomerServic.saveCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_CUSTOMERS = 0;
  private static final int METHODID_FIND_CUSTOMER_BY_ID = 1;
  private static final int METHODID_SAVE_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_CUSTOMERS:
          serviceImpl.findAllCustomers((CustomerServic.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<CustomerServic.GetAllCustomersResponse>) responseObserver);
          break;
        case METHODID_FIND_CUSTOMER_BY_ID:
          serviceImpl.findCustomerById((CustomerServic.findCustomerByIdRequest) request,
              (io.grpc.stub.StreamObserver<CustomerServic.findCustomerByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CUSTOMER:
          serviceImpl.saveCustomer((CustomerServic.saveCustomerRequest) request,
              (io.grpc.stub.StreamObserver<CustomerServic.saveCustomerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CustomerServic.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getFindAllCustomersMethod())
              .addMethod(getFindCustomerByIdMethod())
              .addMethod(getSaveCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
