/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.asset.v1p1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Asset service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/asset/v1p1beta1/asset_service.proto")
public final class AssetServiceGrpc {

  private AssetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.asset.v1p1beta1.AssetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchAllResourcesMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
      METHOD_SEARCH_ALL_RESOURCES = getSearchAllResourcesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
      getSearchAllResourcesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
      getSearchAllResourcesMethod() {
    return getSearchAllResourcesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
      getSearchAllResourcesMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
            com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
        getSearchAllResourcesMethod;
    if ((getSearchAllResourcesMethod = AssetServiceGrpc.getSearchAllResourcesMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getSearchAllResourcesMethod = AssetServiceGrpc.getSearchAllResourcesMethod) == null) {
          AssetServiceGrpc.getSearchAllResourcesMethod =
              getSearchAllResourcesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
                          com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.asset.v1p1beta1.AssetService", "SearchAllResources"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AssetServiceMethodDescriptorSupplier("SearchAllResources"))
                      .build();
        }
      }
    }
    return getSearchAllResourcesMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchAllIamPoliciesMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
      METHOD_SEARCH_ALL_IAM_POLICIES = getSearchAllIamPoliciesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
      getSearchAllIamPoliciesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
      getSearchAllIamPoliciesMethod() {
    return getSearchAllIamPoliciesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
      getSearchAllIamPoliciesMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
            com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
        getSearchAllIamPoliciesMethod;
    if ((getSearchAllIamPoliciesMethod = AssetServiceGrpc.getSearchAllIamPoliciesMethod) == null) {
      synchronized (AssetServiceGrpc.class) {
        if ((getSearchAllIamPoliciesMethod = AssetServiceGrpc.getSearchAllIamPoliciesMethod)
            == null) {
          AssetServiceGrpc.getSearchAllIamPoliciesMethod =
              getSearchAllIamPoliciesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
                          com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.asset.v1p1beta1.AssetService", "SearchAllIamPolicies"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AssetServiceMethodDescriptorSupplier("SearchAllIamPolicies"))
                      .build();
        }
      }
    }
    return getSearchAllIamPoliciesMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AssetServiceStub newStub(io.grpc.Channel channel) {
    return new AssetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new AssetServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AssetServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new AssetServiceFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Asset service definition.
   * </pre>
   */
  public abstract static class AssetServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Searches all the resources under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the resources under a scope,
     * even if they don't have .get permission of all the resources. Callers
     * should have cloud.assets.SearchAllResources permission on the requested
     * scope, otherwise it will be rejected.
     * </pre>
     */
    public void searchAllResources(
        com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAllResourcesMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches all the IAM policies under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the IAM policies under a scope,
     * even if they don't have .getIamPolicy permission of all the IAM policies.
     * Callers should have cloud.assets.SearchAllIamPolicies permission on the
     * requested scope, otherwise it will be rejected.
     * </pre>
     */
    public void searchAllIamPolicies(
        com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAllIamPoliciesMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getSearchAllResourcesMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest,
                      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>(
                      this, METHODID_SEARCH_ALL_RESOURCES)))
          .addMethod(
              getSearchAllIamPoliciesMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest,
                      com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>(
                      this, METHODID_SEARCH_ALL_IAM_POLICIES)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Asset service definition.
   * </pre>
   */
  public static final class AssetServiceStub extends io.grpc.stub.AbstractStub<AssetServiceStub> {
    private AssetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Searches all the resources under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the resources under a scope,
     * even if they don't have .get permission of all the resources. Callers
     * should have cloud.assets.SearchAllResources permission on the requested
     * scope, otherwise it will be rejected.
     * </pre>
     */
    public void searchAllResources(
        com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAllResourcesMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches all the IAM policies under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the IAM policies under a scope,
     * even if they don't have .getIamPolicy permission of all the IAM policies.
     * Callers should have cloud.assets.SearchAllIamPolicies permission on the
     * requested scope, otherwise it will be rejected.
     * </pre>
     */
    public void searchAllIamPolicies(
        com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAllIamPoliciesMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Asset service definition.
   * </pre>
   */
  public static final class AssetServiceBlockingStub
      extends io.grpc.stub.AbstractStub<AssetServiceBlockingStub> {
    private AssetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Searches all the resources under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the resources under a scope,
     * even if they don't have .get permission of all the resources. Callers
     * should have cloud.assets.SearchAllResources permission on the requested
     * scope, otherwise it will be rejected.
     * </pre>
     */
    public com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse searchAllResources(
        com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchAllResourcesMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Searches all the IAM policies under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the IAM policies under a scope,
     * even if they don't have .getIamPolicy permission of all the IAM policies.
     * Callers should have cloud.assets.SearchAllIamPolicies permission on the
     * requested scope, otherwise it will be rejected.
     * </pre>
     */
    public com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse searchAllIamPolicies(
        com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchAllIamPoliciesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Asset service definition.
   * </pre>
   */
  public static final class AssetServiceFutureStub
      extends io.grpc.stub.AbstractStub<AssetServiceFutureStub> {
    private AssetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AssetServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Searches all the resources under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the resources under a scope,
     * even if they don't have .get permission of all the resources. Callers
     * should have cloud.assets.SearchAllResources permission on the requested
     * scope, otherwise it will be rejected.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>
        searchAllResources(com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAllResourcesMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Searches all the IAM policies under a given accessible CRM scope
     * (project/folder/organization). This RPC gives callers
     * especially admins the ability to search all the IAM policies under a scope,
     * even if they don't have .getIamPolicy permission of all the IAM policies.
     * Callers should have cloud.assets.SearchAllIamPolicies permission on the
     * requested scope, otherwise it will be rejected.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>
        searchAllIamPolicies(com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAllIamPoliciesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_ALL_RESOURCES = 0;
  private static final int METHODID_SEARCH_ALL_IAM_POLICIES = 1;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_ALL_RESOURCES:
          serviceImpl.searchAllResources(
              (com.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse>)
                  responseObserver);
          break;
        case METHODID_SEARCH_ALL_IAM_POLICIES:
          serviceImpl.searchAllIamPolicies(
              (com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse>)
                  responseObserver);
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

  private abstract static class AssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.asset.v1p1beta1.AssetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssetService");
    }
  }

  private static final class AssetServiceFileDescriptorSupplier
      extends AssetServiceBaseDescriptorSupplier {
    AssetServiceFileDescriptorSupplier() {}
  }

  private static final class AssetServiceMethodDescriptorSupplier
      extends AssetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AssetServiceFileDescriptorSupplier())
                      .addMethod(getSearchAllResourcesMethodHelper())
                      .addMethod(getSearchAllIamPoliciesMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
