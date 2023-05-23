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

public interface BatchGetEffectiveIamPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The effective policies for a batch of resources. Note that the results
   * order is the same as the order of
   * [BatchGetEffectiveIamPoliciesRequest.names][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.names]. When a resource does not
   * have any effective IAM policies, its corresponding policy_result will
   * contain empty [EffectiveIamPolicy.policies][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy.policies].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy policy_results = 2;
   * </code>
   */
  java.util.List<com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy>
      getPolicyResultsList();
  /**
   *
   *
   * <pre>
   * The effective policies for a batch of resources. Note that the results
   * order is the same as the order of
   * [BatchGetEffectiveIamPoliciesRequest.names][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.names]. When a resource does not
   * have any effective IAM policies, its corresponding policy_result will
   * contain empty [EffectiveIamPolicy.policies][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy.policies].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy policy_results = 2;
   * </code>
   */
  com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy
      getPolicyResults(int index);
  /**
   *
   *
   * <pre>
   * The effective policies for a batch of resources. Note that the results
   * order is the same as the order of
   * [BatchGetEffectiveIamPoliciesRequest.names][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.names]. When a resource does not
   * have any effective IAM policies, its corresponding policy_result will
   * contain empty [EffectiveIamPolicy.policies][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy.policies].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy policy_results = 2;
   * </code>
   */
  int getPolicyResultsCount();
  /**
   *
   *
   * <pre>
   * The effective policies for a batch of resources. Note that the results
   * order is the same as the order of
   * [BatchGetEffectiveIamPoliciesRequest.names][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.names]. When a resource does not
   * have any effective IAM policies, its corresponding policy_result will
   * contain empty [EffectiveIamPolicy.policies][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy.policies].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy policy_results = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse
                  .EffectiveIamPolicyOrBuilder>
      getPolicyResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The effective policies for a batch of resources. Note that the results
   * order is the same as the order of
   * [BatchGetEffectiveIamPoliciesRequest.names][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.names]. When a resource does not
   * have any effective IAM policies, its corresponding policy_result will
   * contain empty [EffectiveIamPolicy.policies][google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy.policies].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicy policy_results = 2;
   * </code>
   */
  com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesResponse.EffectiveIamPolicyOrBuilder
      getPolicyResultsOrBuilder(int index);
}