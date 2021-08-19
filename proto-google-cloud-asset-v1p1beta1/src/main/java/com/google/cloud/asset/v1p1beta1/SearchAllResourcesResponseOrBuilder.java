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

public interface SearchAllResourcesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata> getResultsList();
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  com.google.cloud.asset.v1p1beta1.StandardResourceMetadata getResults(int index);
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there are more results than those appearing in this response, then
   * `next_page_token` is included.  To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there are more results than those appearing in this response, then
   * `next_page_token` is included.  To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}