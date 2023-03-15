// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p7beta1/assets.proto

package com.google.cloud.asset.v1p7beta1;

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
    internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/asset/v1p7beta1/assets.pr" +
      "oto\022\034google.cloud.asset.v1p7beta1\032\031googl" +
      "e/api/resource.proto\032)google/cloud/orgpo" +
      "licy/v1/orgpolicy.proto\032\032google/iam/v1/p" +
      "olicy.proto\032:google/identity/accessconte" +
      "xtmanager/v1/access_level.proto\032;google/" +
      "identity/accesscontextmanager/v1/access_" +
      "policy.proto\032?google/identity/accesscont" +
      "extmanager/v1/service_perimeter.proto\032\034g" +
      "oogle/protobuf/struct.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\206\005\n\005Asset\022/\n\013update" +
      "_time\030\013 \001(\0132\032.google.protobuf.Timestamp\022" +
      "\014\n\004name\030\001 \001(\t\022\022\n\nasset_type\030\002 \001(\t\0228\n\010res" +
      "ource\030\003 \001(\0132&.google.cloud.asset.v1p7bet" +
      "a1.Resource\022)\n\niam_policy\030\004 \001(\0132\025.google" +
      ".iam.v1.Policy\0225\n\norg_policy\030\006 \003(\0132!.goo" +
      "gle.cloud.orgpolicy.v1.Policy\022N\n\raccess_" +
      "policy\030\007 \001(\01325.google.identity.accesscon" +
      "textmanager.v1.AccessPolicyH\000\022L\n\014access_" +
      "level\030\010 \001(\01324.google.identity.accesscont" +
      "extmanager.v1.AccessLevelH\000\022V\n\021service_p" +
      "erimeter\030\t \001(\01329.google.identity.accessc" +
      "ontextmanager.v1.ServicePerimeterH\000\022C\n\016r" +
      "elated_assets\030\r \001(\0132+.google.cloud.asset" +
      ".v1p7beta1.RelatedAssets\022\021\n\tancestors\030\n " +
      "\003(\t:\'\352A$\n\037cloudasset.googleapis.com/Asse" +
      "t\022\001*B\027\n\025access_context_policy\"\262\001\n\010Resour" +
      "ce\022\017\n\007version\030\001 \001(\t\022\036\n\026discovery_documen" +
      "t_uri\030\002 \001(\t\022\026\n\016discovery_name\030\003 \001(\t\022\024\n\014r" +
      "esource_url\030\004 \001(\t\022\016\n\006parent\030\005 \001(\t\022%\n\004dat" +
      "a\030\006 \001(\0132\027.google.protobuf.Struct\022\020\n\010loca" +
      "tion\030\010 \001(\t\"\242\001\n\rRelatedAssets\022U\n\027relation" +
      "ship_attributes\030\001 \001(\01324.google.cloud.ass" +
      "et.v1p7beta1.RelationshipAttributes\022:\n\006a" +
      "ssets\030\002 \003(\0132*.google.cloud.asset.v1p7bet" +
      "a1.RelatedAsset\"r\n\026RelationshipAttribute" +
      "s\022\014\n\004type\030\004 \001(\t\022\034\n\024source_resource_type\030" +
      "\001 \001(\t\022\034\n\024target_resource_type\030\002 \001(\t\022\016\n\006a" +
      "ction\030\003 \001(\t\"j\n\014RelatedAsset\0223\n\005asset\030\001 \001" +
      "(\tB$\372A!\n\037cloudasset.googleapis.com/Asset" +
      "\022\022\n\nasset_type\030\002 \001(\t\022\021\n\tancestors\030\003 \003(\tB" +
      "\251\001\n com.google.cloud.asset.v1p7beta1B\nAs" +
      "setProtoP\001Z6cloud.google.com/go/asset/ap" +
      "iv1p7beta1/assetpb;assetpb\370\001\001\252\002\034Google.C" +
      "loud.Asset.V1P7Beta1\312\002\034Google\\Cloud\\Asse" +
      "t\\V1p7beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p7beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor,
        new java.lang.String[] { "UpdateTime", "Name", "AssetType", "Resource", "IamPolicy", "OrgPolicy", "AccessPolicy", "AccessLevel", "ServicePerimeter", "RelatedAssets", "Ancestors", "AccessContextPolicy", });
    internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p7beta1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor,
        new java.lang.String[] { "Version", "DiscoveryDocumentUri", "DiscoveryName", "ResourceUrl", "Parent", "Data", "Location", });
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor,
        new java.lang.String[] { "RelationshipAttributes", "Assets", });
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor,
        new java.lang.String[] { "Type", "SourceResourceType", "TargetResourceType", "Action", });
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor,
        new java.lang.String[] { "Asset", "AssetType", "Ancestors", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
