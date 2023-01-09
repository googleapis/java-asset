// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface DeleteFeedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.DeleteFeedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the feed and it must be in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the feed and it must be in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
