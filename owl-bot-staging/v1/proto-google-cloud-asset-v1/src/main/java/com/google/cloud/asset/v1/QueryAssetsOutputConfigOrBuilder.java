// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface QueryAssetsOutputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.QueryAssetsOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * {{bigquery_name}} destination where the query results will be saved.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig.BigQueryDestination bigquery_destination = 1;</code>
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   * <pre>
   * {{bigquery_name}} destination where the query results will be saved.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig.BigQueryDestination bigquery_destination = 1;</code>
   * @return The bigqueryDestination.
   */
  com.google.cloud.asset.v1.QueryAssetsOutputConfig.BigQueryDestination getBigqueryDestination();
  /**
   * <pre>
   * {{bigquery_name}} destination where the query results will be saved.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig.BigQueryDestination bigquery_destination = 1;</code>
   */
  com.google.cloud.asset.v1.QueryAssetsOutputConfig.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();
}
