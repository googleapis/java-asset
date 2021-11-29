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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p1beta1/asset_service.proto

package com.google.cloud.asset.v1p1beta1;

public final class AssetServiceProto {
  private AssetServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "0google/cloud/asset/v1p1beta1/asset_service.proto\022\034google.cloud.asset.v1p1beta1"
          + "\032\034google/api/annotations.proto\032\027google/api/client.proto\032\037google/api/field_behavior.proto\032)google/cloud/asset/v1p1beta1/assets.proto\"\245\001\n"
          + "\031SearchAllResourcesRequest\022\022\n"
          + "\005scope\030\001 \001(\tB\003\340A\002\022\022\n"
          + "\005query\030\002 \001(\tB\003\340A\001\022\030\n"
          + "\013asset_types\030\003 \003(\tB\003\340A\001\022\026\n"
          + "\tpage_size\030\004 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\005 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\n"
          + " \001(\tB\003\340A\001\"~\n"
          + "\032SearchAllResourcesResponse\022G\n"
          + "\007results\030\001"
          + " \003(\01326.google.cloud.asset.v1p1beta1.StandardResourceMetadata\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"v\n"
          + "\033SearchAllIamPoliciesRequest\022\022\n"
          + "\005scope\030\001 \001(\tB\003\340A\002\022\022\n"
          + "\005query\030\002 \001(\tB\003\340A\001\022\026\n"
          + "\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\004 \001(\tB\003\340A\001\"}\n"
          + "\034SearchAllIamPoliciesResponse\022D\n"
          + "\007results\030\001"
          + " \003(\01323.google.cloud.asset.v1p1beta1.IamPolicySearchResult\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\211\004\n"
          + "\014AssetService\022\325\001\n"
          + "\022SearchAllResources\0227.google.cloud.asset.v1p1beta1.SearchAllResou"
          + "rcesRequest\0328.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse\"L\202\323\344\223\002,\022*/v1p1beta1/{scope=*/*}/resources:searchAll\332A\027scope,query,asset_types\022\321\001\n"
          + "\024SearchAllIamPolicies\0229.google.cloud.asset.v1p1be"
          + "ta1.SearchAllIamPoliciesRequest\032:.google.cloud.asset.v1p1beta1.SearchAllIamPolic"
          + "iesResponse\"B\202\323\344\223\002.\022,/v1p1beta1/{scope=*"
          + "/*}/iamPolicies:searchAll\332A\013scope,query\032M\312A\031cloudasset.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\270\001\n"
          + " com.google.cloud.asset.v1p1beta1B\021AssetServiceProtoP\001ZAgoogle.golang.org/genp"
          + "roto/googleapis/cloud/asset/v1p1beta1;as"
          + "set\252\002\034Google.Cloud.Asset.V1P1Beta1\312\002\034Goo"
          + "gle\\Cloud\\Asset\\V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.asset.v1p1beta1.AssetProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesRequest_descriptor,
            new java.lang.String[] {
              "Scope", "Query", "AssetTypes", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor,
            new java.lang.String[] {
              "Results", "NextPageToken",
            });
    internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Scope", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_SearchAllIamPoliciesResponse_descriptor,
            new java.lang.String[] {
              "Results", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.asset.v1p1beta1.AssetProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
