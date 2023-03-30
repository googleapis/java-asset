// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface VersionedResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.VersionedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * API version of the resource.
   * Example:
   * If the resource is an instance provided by Compute Engine v1 API as defined
   * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
   * version will be "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * API version of the resource.
   * Example:
   * If the resource is an instance provided by Compute Engine v1 API as defined
   * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
   * version will be "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   * @return The resource.
   */
  com.google.protobuf.Struct getResource();
  /**
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getResourceOrBuilder();
}