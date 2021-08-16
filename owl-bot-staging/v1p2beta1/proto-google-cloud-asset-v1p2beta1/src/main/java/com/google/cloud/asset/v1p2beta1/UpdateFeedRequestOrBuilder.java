// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface UpdateFeedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.UpdateFeedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The feed.
   */
  com.google.cloud.asset.v1p2beta1.Feed getFeed();
  /**
   * <pre>
   * Required. The new values of feed details. It must match an existing feed and the
   * field `name` must be in the format of:
   * projects/project_number/feeds/feed_id or
   * folders/folder_number/feeds/feed_id or
   * organizations/organization_number/feeds/feed_id.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Feed feed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.asset.v1p2beta1.FeedOrBuilder getFeedOrBuilder();

  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Only updates the `feed` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}