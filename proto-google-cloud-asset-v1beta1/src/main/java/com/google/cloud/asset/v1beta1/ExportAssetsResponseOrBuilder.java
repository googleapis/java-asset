/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/asset/v1beta1/asset_service.proto

package com.google.cloud.asset.v1beta1;

public interface ExportAssetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1beta1.ExportAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.OutputConfig output_config = 2;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.OutputConfig output_config = 2;</code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.asset.v1beta1.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.asset.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}
