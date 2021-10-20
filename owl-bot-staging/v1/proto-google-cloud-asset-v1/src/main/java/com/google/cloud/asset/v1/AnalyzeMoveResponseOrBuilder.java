// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface AnalyzeMoveResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeMoveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1.MoveAnalysis> 
      getMoveAnalysisList();
  /**
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  com.google.cloud.asset.v1.MoveAnalysis getMoveAnalysis(int index);
  /**
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  int getMoveAnalysisCount();
  /**
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.MoveAnalysisOrBuilder> 
      getMoveAnalysisOrBuilderList();
  /**
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  com.google.cloud.asset.v1.MoveAnalysisOrBuilder getMoveAnalysisOrBuilder(
      int index);
}