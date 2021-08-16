// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p4beta1/asset_service.proto

package com.google.cloud.asset.v1p4beta1;

public interface ExportIamPolicyAnalysisResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p4beta1.ExportIamPolicyAnalysisResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p4beta1.IamPolicyAnalysisOutputConfig output_config = 1;</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p4beta1.IamPolicyAnalysisOutputConfig output_config = 1;</code>
   * @return The outputConfig.
   */
  com.google.cloud.asset.v1p4beta1.IamPolicyAnalysisOutputConfig getOutputConfig();
  /**
   * <pre>
   * Output configuration indicating where the results were output to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p4beta1.IamPolicyAnalysisOutputConfig output_config = 1;</code>
   */
  com.google.cloud.asset.v1p4beta1.IamPolicyAnalysisOutputConfigOrBuilder getOutputConfigOrBuilder();
}