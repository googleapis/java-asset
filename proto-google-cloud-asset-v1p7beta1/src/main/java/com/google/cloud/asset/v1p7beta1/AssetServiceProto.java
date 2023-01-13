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
// source: google/cloud/asset/v1p7beta1/asset_service.proto

package com.google.cloud.asset.v1p7beta1;

public final class AssetServiceProto {
  private AssetServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_ExportAssetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_ExportAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_ExportAssetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_ExportAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_OutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_OutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_GcsOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_GcsOutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p7beta1_PartitionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_PartitionSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/asset/v1p7beta1/asset_ser"
          + "vice.proto\022\034google.cloud.asset.v1p7beta1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032#goo"
          + "gle/longrunning/operations.proto\032\037google"
          + "/protobuf/timestamp.proto\"\267\002\n\023ExportAsse"
          + "tsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037cloud"
          + "asset.googleapis.com/Asset\022-\n\tread_time\030"
          + "\002 \001(\0132\032.google.protobuf.Timestamp\022\023\n\013ass"
          + "et_types\030\003 \003(\t\022?\n\014content_type\030\004 \001(\0162).g"
          + "oogle.cloud.asset.v1p7beta1.ContentType\022"
          + "F\n\routput_config\030\005 \001(\0132*.google.cloud.as"
          + "set.v1p7beta1.OutputConfigB\003\340A\002\022\032\n\022relat"
          + "ionship_types\030\006 \003(\t\"\313\001\n\024ExportAssetsResp"
          + "onse\022-\n\tread_time\030\001 \001(\0132\032.google.protobu"
          + "f.Timestamp\022A\n\routput_config\030\002 \001(\0132*.goo"
          + "gle.cloud.asset.v1p7beta1.OutputConfig\022A"
          + "\n\routput_result\030\003 \001(\0132*.google.cloud.ass"
          + "et.v1p7beta1.OutputResult\"\271\001\n\014OutputConf"
          + "ig\022G\n\017gcs_destination\030\001 \001(\0132,.google.clo"
          + "ud.asset.v1p7beta1.GcsDestinationH\000\022Q\n\024b"
          + "igquery_destination\030\002 \001(\01321.google.cloud"
          + ".asset.v1p7beta1.BigQueryDestinationH\000B\r"
          + "\n\013destination\"]\n\014OutputResult\022C\n\ngcs_res"
          + "ult\030\001 \001(\0132-.google.cloud.asset.v1p7beta1"
          + ".GcsOutputResultH\000B\010\n\006result\"\037\n\017GcsOutpu"
          + "tResult\022\014\n\004uris\030\001 \003(\t\"C\n\016GcsDestination\022"
          + "\r\n\003uri\030\001 \001(\tH\000\022\024\n\nuri_prefix\030\002 \001(\tH\000B\014\n\n"
          + "object_uri\"\273\001\n\023BigQueryDestination\022\024\n\007da"
          + "taset\030\001 \001(\tB\003\340A\002\022\022\n\005table\030\002 \001(\tB\003\340A\002\022\r\n\005"
          + "force\030\003 \001(\010\022C\n\016partition_spec\030\004 \001(\0132+.go"
          + "ogle.cloud.asset.v1p7beta1.PartitionSpec"
          + "\022&\n\036separate_tables_per_asset_type\030\005 \001(\010"
          + "\"\260\001\n\rPartitionSpec\022O\n\rpartition_key\030\001 \001("
          + "\01628.google.cloud.asset.v1p7beta1.Partiti"
          + "onSpec.PartitionKey\"N\n\014PartitionKey\022\035\n\031P"
          + "ARTITION_KEY_UNSPECIFIED\020\000\022\r\n\tREAD_TIME\020"
          + "\001\022\020\n\014REQUEST_TIME\020\002*~\n\013ContentType\022\034\n\030CO"
          + "NTENT_TYPE_UNSPECIFIED\020\000\022\014\n\010RESOURCE\020\001\022\016"
          + "\n\nIAM_POLICY\020\002\022\016\n\nORG_POLICY\020\004\022\021\n\rACCESS"
          + "_POLICY\020\005\022\020\n\014RELATIONSHIP\020\0072\332\002\n\014AssetSer"
          + "vice\022\372\001\n\014ExportAssets\0221.google.cloud.ass"
          + "et.v1p7beta1.ExportAssetsRequest\032\035.googl"
          + "e.longrunning.Operation\"\227\001\202\323\344\223\002)\"$/v1p7b"
          + "eta1/{parent=*/*}:exportAssets:\001*\312Ae\n1go"
          + "ogle.cloud.asset.v1p7beta1.ExportAssetsR"
          + "esponse\0220google.cloud.asset.v1p7beta1.Ex"
          + "portAssetsRequest\032M\312A\031cloudasset.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\270\001\n com.google.cloud.as"
          + "set.v1p7beta1B\021AssetServiceProtoP\001ZAgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "asset/v1p7beta1;asset\252\002\034Google.Cloud.Ass"
          + "et.V1P7Beta1\312\002\034Google\\Cloud\\Asset\\V1p7be"
          + "ta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1p7beta1_ExportAssetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p7beta1_ExportAssetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_ExportAssetsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "ReadTime",
              "AssetTypes",
              "ContentType",
              "OutputConfig",
              "RelationshipTypes",
            });
    internal_static_google_cloud_asset_v1p7beta1_ExportAssetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p7beta1_ExportAssetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_ExportAssetsResponse_descriptor,
            new java.lang.String[] {
              "ReadTime", "OutputConfig", "OutputResult",
            });
    internal_static_google_cloud_asset_v1p7beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p7beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_asset_v1p7beta1_OutputResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p7beta1_OutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_OutputResult_descriptor,
            new java.lang.String[] {
              "GcsResult", "Result",
            });
    internal_static_google_cloud_asset_v1p7beta1_GcsOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1p7beta1_GcsOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_GcsOutputResult_descriptor,
            new java.lang.String[] {
              "Uris",
            });
    internal_static_google_cloud_asset_v1p7beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_asset_v1p7beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri", "UriPrefix", "ObjectUri",
            });
    internal_static_google_cloud_asset_v1p7beta1_BigQueryDestination_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_asset_v1p7beta1_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "Dataset", "Table", "Force", "PartitionSpec", "SeparateTablesPerAssetType",
            });
    internal_static_google_cloud_asset_v1p7beta1_PartitionSpec_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_asset_v1p7beta1_PartitionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p7beta1_PartitionSpec_descriptor,
            new java.lang.String[] {
              "PartitionKey",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
