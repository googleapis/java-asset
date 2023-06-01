// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface DeleteSavedQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.DeleteSavedQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the saved query to delete. It must be in the format
   * of:
   *
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the saved query to delete. It must be in the format
   * of:
   *
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
