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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface BigQueryDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BigQueryDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The table.
   */
  java.lang.String getTable();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString getTableBytes();

  /**
   *
   *
   * <pre>
   * If the destination table already exists and this flag is `TRUE`, the
   * table will be overwritten by the contents of assets snapshot. If the flag
   * is `FALSE` or unset and the destination table already exists, the export
   * call returns an INVALID_ARGUMEMT error.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
