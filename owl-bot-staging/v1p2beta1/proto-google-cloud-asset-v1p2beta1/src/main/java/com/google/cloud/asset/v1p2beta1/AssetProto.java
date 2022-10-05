// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/assets.proto

package com.google.cloud.asset.v1p2beta1;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p2beta1_TimeWindow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_TimeWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p2beta1_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p2beta1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/asset/v1p2beta1/assets.pr" +
      "oto\022\034google.cloud.asset.v1p2beta1\032\032googl" +
      "e/iam/v1/policy.proto\032\034google/protobuf/s" +
      "truct.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\216\001\n\rTemporalAsset\0228\n\006window\030\001 \001(\0132(" +
      ".google.cloud.asset.v1p2beta1.TimeWindow" +
      "\022\017\n\007deleted\030\002 \001(\010\0222\n\005asset\030\003 \001(\0132#.googl" +
      "e.cloud.asset.v1p2beta1.Asset\"j\n\nTimeWin" +
      "dow\022.\n\nstart_time\030\001 \001(\0132\032.google.protobu" +
      "f.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\"\241\001\n\005Asset\022\014\n\004name\030\001 \001(" +
      "\t\022\022\n\nasset_type\030\002 \001(\t\0228\n\010resource\030\003 \001(\0132" +
      "&.google.cloud.asset.v1p2beta1.Resource\022" +
      ")\n\niam_policy\030\004 \001(\0132\025.google.iam.v1.Poli" +
      "cy\022\021\n\tancestors\030\006 \003(\t\"\240\001\n\010Resource\022\017\n\007ve" +
      "rsion\030\001 \001(\t\022\036\n\026discovery_document_uri\030\002 " +
      "\001(\t\022\026\n\016discovery_name\030\003 \001(\t\022\024\n\014resource_" +
      "url\030\004 \001(\t\022\016\n\006parent\030\005 \001(\t\022%\n\004data\030\006 \001(\0132" +
      "\027.google.protobuf.StructB\264\001\n com.google." +
      "cloud.asset.v1p2beta1B\nAssetProtoP\001ZAgoo" +
      "gle.golang.org/genproto/googleapis/cloud" +
      "/asset/v1p2beta1;asset\370\001\001\252\002\034Google.Cloud" +
      ".Asset.v1p2beta1\312\002\034Google\\Cloud\\Asset\\V1" +
      "p2beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor,
        new java.lang.String[] { "Window", "Deleted", "Asset", });
    internal_static_google_cloud_asset_v1p2beta1_TimeWindow_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p2beta1_TimeWindow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p2beta1_TimeWindow_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", });
    internal_static_google_cloud_asset_v1p2beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p2beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p2beta1_Asset_descriptor,
        new java.lang.String[] { "Name", "AssetType", "Resource", "IamPolicy", "Ancestors", });
    internal_static_google_cloud_asset_v1p2beta1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p2beta1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p2beta1_Resource_descriptor,
        new java.lang.String[] { "Version", "DiscoveryDocumentUri", "DiscoveryName", "ResourceUrl", "Parent", "Data", });
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
