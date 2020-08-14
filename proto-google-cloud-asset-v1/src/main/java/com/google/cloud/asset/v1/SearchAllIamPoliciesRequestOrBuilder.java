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

public interface SearchAllIamPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.SearchAllIamPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder, or an organization. The search is
   * limited to the IAM policies within the `scope`. The caller must be granted
   * the
   * [`cloudasset.assets.searchAllIamPolicies`](http://cloud.google.com/asset-inventory/docs/access-control#required_permissions)
   * permission on the desired scope.
   * The allowed values are:
   * * projects/{PROJECT_ID} (e.g., "projects/foo-bar")
   * * projects/{PROJECT_NUMBER} (e.g., "projects/12345678")
   * * folders/{FOLDER_NUMBER} (e.g., "folders/1234567")
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder, or an organization. The search is
   * limited to the IAM policies within the `scope`. The caller must be granted
   * the
   * [`cloudasset.assets.searchAllIamPolicies`](http://cloud.google.com/asset-inventory/docs/access-control#required_permissions)
   * permission on the desired scope.
   * The allowed values are:
   * * projects/{PROJECT_ID} (e.g., "projects/foo-bar")
   * * projects/{PROJECT_NUMBER} (e.g., "projects/12345678")
   * * folders/{FOLDER_NUMBER} (e.g., "folders/1234567")
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The query statement. See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-iam-policies#how_to_construct_a_query)
   * for more information. If not specified or empty, it will search all the
   * IAM policies within the specified `scope`.
   * Examples:
   * * `policy:amy&#64;gmail.com` to find IAM policy bindings that specify user
   *   "amy&#64;gmail.com".
   * * `policy:roles/compute.admin` to find IAM policy bindings that specify
   *   the Compute Admin role.
   * * `policy.role.permissions:storage.buckets.update` to find IAM policy
   *   bindings that specify a role containing "storage.buckets.update"
   *   permission. Note that if callers don't have `iam.roles.get` access to a
   *   role's included permissions, policy bindings that specify this role will
   *   be dropped from the search results.
   * * `resource:organizations/123456` to find IAM policy bindings
   *   that are set on "organizations/123456".
   * * `Important` to find IAM policy bindings that contain "Important" as a
   *   word in any of the searchable fields (except for the included
   *   permissions).
   * * `*por*` to find IAM policy bindings that contain "por" as a substring
   *   in any of the searchable fields (except for the included permissions).
   * * `resource:(instance1 OR instance2) policy:amy` to find
   *   IAM policy bindings that are set on resources "instance1" or
   *   "instance2" and also specify user "amy".
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query statement. See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-iam-policies#how_to_construct_a_query)
   * for more information. If not specified or empty, it will search all the
   * IAM policies within the specified `scope`.
   * Examples:
   * * `policy:amy&#64;gmail.com` to find IAM policy bindings that specify user
   *   "amy&#64;gmail.com".
   * * `policy:roles/compute.admin` to find IAM policy bindings that specify
   *   the Compute Admin role.
   * * `policy.role.permissions:storage.buckets.update` to find IAM policy
   *   bindings that specify a role containing "storage.buckets.update"
   *   permission. Note that if callers don't have `iam.roles.get` access to a
   *   role's included permissions, policy bindings that specify this role will
   *   be dropped from the search results.
   * * `resource:organizations/123456` to find IAM policy bindings
   *   that are set on "organizations/123456".
   * * `Important` to find IAM policy bindings that contain "Important" as a
   *   word in any of the searchable fields (except for the included
   *   permissions).
   * * `*por*` to find IAM policy bindings that contain "por" as a substring
   *   in any of the searchable fields (except for the included permissions).
   * * `resource:(instance1 OR instance2) policy:amy` to find
   *   IAM policy bindings that are set on resources "instance1" or
   *   "instance2" and also specify user "amy".
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. The page size for search result pagination. Page size is capped at 500 even
   * if a larger value is given. If set to zero, server will pick an appropriate
   * default. Returned results may be fewer than requested. When this happens,
   * there could be more results as long as `next_page_token` is returned.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, retrieve the next batch of results from the preceding call to
   * this method. `page_token` must be the value of `next_page_token` from the
   * previous response. The values of all other method parameters must be
   * identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, retrieve the next batch of results from the preceding call to
   * this method. `page_token` must be the value of `next_page_token` from the
   * previous response. The values of all other method parameters must be
   * identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
