// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 * <pre>
 * The detailed related assets with the `relationship_type`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.RelatedAssets}
 */
public final class RelatedAssets extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.RelatedAssets)
    RelatedAssetsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelatedAssets.newBuilder() to construct.
  private RelatedAssets(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelatedAssets() {
    assets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelatedAssets();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RelatedAssets(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.asset.v1.RelationshipAttributes.Builder subBuilder = null;
            if (relationshipAttributes_ != null) {
              subBuilder = relationshipAttributes_.toBuilder();
            }
            relationshipAttributes_ = input.readMessage(com.google.cloud.asset.v1.RelationshipAttributes.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(relationshipAttributes_);
              relationshipAttributes_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              assets_ = new java.util.ArrayList<com.google.cloud.asset.v1.RelatedAsset>();
              mutable_bitField0_ |= 0x00000001;
            }
            assets_.add(
                input.readMessage(com.google.cloud.asset.v1.RelatedAsset.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        assets_ = java.util.Collections.unmodifiableList(assets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto.internal_static_google_cloud_asset_v1_RelatedAssets_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto.internal_static_google_cloud_asset_v1_RelatedAssets_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.RelatedAssets.class, com.google.cloud.asset.v1.RelatedAssets.Builder.class);
  }

  public static final int RELATIONSHIP_ATTRIBUTES_FIELD_NUMBER = 1;
  private com.google.cloud.asset.v1.RelationshipAttributes relationshipAttributes_;
  /**
   * <pre>
   * The detailed relationship attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
   * @return Whether the relationshipAttributes field is set.
   */
  @java.lang.Override
  public boolean hasRelationshipAttributes() {
    return relationshipAttributes_ != null;
  }
  /**
   * <pre>
   * The detailed relationship attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
   * @return The relationshipAttributes.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelationshipAttributes getRelationshipAttributes() {
    return relationshipAttributes_ == null ? com.google.cloud.asset.v1.RelationshipAttributes.getDefaultInstance() : relationshipAttributes_;
  }
  /**
   * <pre>
   * The detailed relationship attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelationshipAttributesOrBuilder getRelationshipAttributesOrBuilder() {
    return getRelationshipAttributes();
  }

  public static final int ASSETS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.asset.v1.RelatedAsset> assets_;
  /**
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1.RelatedAsset> getAssetsList() {
    return assets_;
  }
  /**
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.asset.v1.RelatedAssetOrBuilder> 
      getAssetsOrBuilderList() {
    return assets_;
  }
  /**
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
   */
  @java.lang.Override
  public int getAssetsCount() {
    return assets_.size();
  }
  /**
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedAsset getAssets(int index) {
    return assets_.get(index);
  }
  /**
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedAssetOrBuilder getAssetsOrBuilder(
      int index) {
    return assets_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (relationshipAttributes_ != null) {
      output.writeMessage(1, getRelationshipAttributes());
    }
    for (int i = 0; i < assets_.size(); i++) {
      output.writeMessage(2, assets_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (relationshipAttributes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRelationshipAttributes());
    }
    for (int i = 0; i < assets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, assets_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1.RelatedAssets)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.RelatedAssets other = (com.google.cloud.asset.v1.RelatedAssets) obj;

    if (hasRelationshipAttributes() != other.hasRelationshipAttributes()) return false;
    if (hasRelationshipAttributes()) {
      if (!getRelationshipAttributes()
          .equals(other.getRelationshipAttributes())) return false;
    }
    if (!getAssetsList()
        .equals(other.getAssetsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRelationshipAttributes()) {
      hash = (37 * hash) + RELATIONSHIP_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getRelationshipAttributes().hashCode();
    }
    if (getAssetsCount() > 0) {
      hash = (37 * hash) + ASSETS_FIELD_NUMBER;
      hash = (53 * hash) + getAssetsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.RelatedAssets parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.asset.v1.RelatedAssets prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The detailed related assets with the `relationship_type`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.RelatedAssets}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.RelatedAssets)
      com.google.cloud.asset.v1.RelatedAssetsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto.internal_static_google_cloud_asset_v1_RelatedAssets_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto.internal_static_google_cloud_asset_v1_RelatedAssets_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.RelatedAssets.class, com.google.cloud.asset.v1.RelatedAssets.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.RelatedAssets.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAssetsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (relationshipAttributesBuilder_ == null) {
        relationshipAttributes_ = null;
      } else {
        relationshipAttributes_ = null;
        relationshipAttributesBuilder_ = null;
      }
      if (assetsBuilder_ == null) {
        assets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        assetsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto.internal_static_google_cloud_asset_v1_RelatedAssets_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedAssets getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.RelatedAssets.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedAssets build() {
      com.google.cloud.asset.v1.RelatedAssets result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedAssets buildPartial() {
      com.google.cloud.asset.v1.RelatedAssets result = new com.google.cloud.asset.v1.RelatedAssets(this);
      int from_bitField0_ = bitField0_;
      if (relationshipAttributesBuilder_ == null) {
        result.relationshipAttributes_ = relationshipAttributes_;
      } else {
        result.relationshipAttributes_ = relationshipAttributesBuilder_.build();
      }
      if (assetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          assets_ = java.util.Collections.unmodifiableList(assets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.assets_ = assets_;
      } else {
        result.assets_ = assetsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.RelatedAssets) {
        return mergeFrom((com.google.cloud.asset.v1.RelatedAssets)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.RelatedAssets other) {
      if (other == com.google.cloud.asset.v1.RelatedAssets.getDefaultInstance()) return this;
      if (other.hasRelationshipAttributes()) {
        mergeRelationshipAttributes(other.getRelationshipAttributes());
      }
      if (assetsBuilder_ == null) {
        if (!other.assets_.isEmpty()) {
          if (assets_.isEmpty()) {
            assets_ = other.assets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAssetsIsMutable();
            assets_.addAll(other.assets_);
          }
          onChanged();
        }
      } else {
        if (!other.assets_.isEmpty()) {
          if (assetsBuilder_.isEmpty()) {
            assetsBuilder_.dispose();
            assetsBuilder_ = null;
            assets_ = other.assets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            assetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAssetsFieldBuilder() : null;
          } else {
            assetsBuilder_.addAllMessages(other.assets_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.asset.v1.RelatedAssets parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.RelatedAssets) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.cloud.asset.v1.RelationshipAttributes relationshipAttributes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.RelationshipAttributes, com.google.cloud.asset.v1.RelationshipAttributes.Builder, com.google.cloud.asset.v1.RelationshipAttributesOrBuilder> relationshipAttributesBuilder_;
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     * @return Whether the relationshipAttributes field is set.
     */
    public boolean hasRelationshipAttributes() {
      return relationshipAttributesBuilder_ != null || relationshipAttributes_ != null;
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     * @return The relationshipAttributes.
     */
    public com.google.cloud.asset.v1.RelationshipAttributes getRelationshipAttributes() {
      if (relationshipAttributesBuilder_ == null) {
        return relationshipAttributes_ == null ? com.google.cloud.asset.v1.RelationshipAttributes.getDefaultInstance() : relationshipAttributes_;
      } else {
        return relationshipAttributesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public Builder setRelationshipAttributes(com.google.cloud.asset.v1.RelationshipAttributes value) {
      if (relationshipAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relationshipAttributes_ = value;
        onChanged();
      } else {
        relationshipAttributesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public Builder setRelationshipAttributes(
        com.google.cloud.asset.v1.RelationshipAttributes.Builder builderForValue) {
      if (relationshipAttributesBuilder_ == null) {
        relationshipAttributes_ = builderForValue.build();
        onChanged();
      } else {
        relationshipAttributesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public Builder mergeRelationshipAttributes(com.google.cloud.asset.v1.RelationshipAttributes value) {
      if (relationshipAttributesBuilder_ == null) {
        if (relationshipAttributes_ != null) {
          relationshipAttributes_ =
            com.google.cloud.asset.v1.RelationshipAttributes.newBuilder(relationshipAttributes_).mergeFrom(value).buildPartial();
        } else {
          relationshipAttributes_ = value;
        }
        onChanged();
      } else {
        relationshipAttributesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public Builder clearRelationshipAttributes() {
      if (relationshipAttributesBuilder_ == null) {
        relationshipAttributes_ = null;
        onChanged();
      } else {
        relationshipAttributes_ = null;
        relationshipAttributesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public com.google.cloud.asset.v1.RelationshipAttributes.Builder getRelationshipAttributesBuilder() {
      
      onChanged();
      return getRelationshipAttributesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    public com.google.cloud.asset.v1.RelationshipAttributesOrBuilder getRelationshipAttributesOrBuilder() {
      if (relationshipAttributesBuilder_ != null) {
        return relationshipAttributesBuilder_.getMessageOrBuilder();
      } else {
        return relationshipAttributes_ == null ?
            com.google.cloud.asset.v1.RelationshipAttributes.getDefaultInstance() : relationshipAttributes_;
      }
    }
    /**
     * <pre>
     * The detailed relationship attributes.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.RelationshipAttributes relationship_attributes = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.RelationshipAttributes, com.google.cloud.asset.v1.RelationshipAttributes.Builder, com.google.cloud.asset.v1.RelationshipAttributesOrBuilder> 
        getRelationshipAttributesFieldBuilder() {
      if (relationshipAttributesBuilder_ == null) {
        relationshipAttributesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.RelationshipAttributes, com.google.cloud.asset.v1.RelationshipAttributes.Builder, com.google.cloud.asset.v1.RelationshipAttributesOrBuilder>(
                getRelationshipAttributes(),
                getParentForChildren(),
                isClean());
        relationshipAttributes_ = null;
      }
      return relationshipAttributesBuilder_;
    }

    private java.util.List<com.google.cloud.asset.v1.RelatedAsset> assets_ =
      java.util.Collections.emptyList();
    private void ensureAssetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        assets_ = new java.util.ArrayList<com.google.cloud.asset.v1.RelatedAsset>(assets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.asset.v1.RelatedAsset, com.google.cloud.asset.v1.RelatedAsset.Builder, com.google.cloud.asset.v1.RelatedAssetOrBuilder> assetsBuilder_;

    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.RelatedAsset> getAssetsList() {
      if (assetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(assets_);
      } else {
        return assetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public int getAssetsCount() {
      if (assetsBuilder_ == null) {
        return assets_.size();
      } else {
        return assetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public com.google.cloud.asset.v1.RelatedAsset getAssets(int index) {
      if (assetsBuilder_ == null) {
        return assets_.get(index);
      } else {
        return assetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder setAssets(
        int index, com.google.cloud.asset.v1.RelatedAsset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.set(index, value);
        onChanged();
      } else {
        assetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder setAssets(
        int index, com.google.cloud.asset.v1.RelatedAsset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.set(index, builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder addAssets(com.google.cloud.asset.v1.RelatedAsset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.add(value);
        onChanged();
      } else {
        assetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder addAssets(
        int index, com.google.cloud.asset.v1.RelatedAsset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.add(index, value);
        onChanged();
      } else {
        assetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder addAssets(
        com.google.cloud.asset.v1.RelatedAsset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.add(builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder addAssets(
        int index, com.google.cloud.asset.v1.RelatedAsset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.add(index, builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder addAllAssets(
        java.lang.Iterable<? extends com.google.cloud.asset.v1.RelatedAsset> values) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, assets_);
        onChanged();
      } else {
        assetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder clearAssets() {
      if (assetsBuilder_ == null) {
        assets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        assetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public Builder removeAssets(int index) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.remove(index);
        onChanged();
      } else {
        assetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public com.google.cloud.asset.v1.RelatedAsset.Builder getAssetsBuilder(
        int index) {
      return getAssetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public com.google.cloud.asset.v1.RelatedAssetOrBuilder getAssetsOrBuilder(
        int index) {
      if (assetsBuilder_ == null) {
        return assets_.get(index);  } else {
        return assetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.asset.v1.RelatedAssetOrBuilder> 
         getAssetsOrBuilderList() {
      if (assetsBuilder_ != null) {
        return assetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(assets_);
      }
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public com.google.cloud.asset.v1.RelatedAsset.Builder addAssetsBuilder() {
      return getAssetsFieldBuilder().addBuilder(
          com.google.cloud.asset.v1.RelatedAsset.getDefaultInstance());
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public com.google.cloud.asset.v1.RelatedAsset.Builder addAssetsBuilder(
        int index) {
      return getAssetsFieldBuilder().addBuilder(
          index, com.google.cloud.asset.v1.RelatedAsset.getDefaultInstance());
    }
    /**
     * <pre>
     * The peer resources of the relationship.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedAsset assets = 2;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.RelatedAsset.Builder> 
         getAssetsBuilderList() {
      return getAssetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.asset.v1.RelatedAsset, com.google.cloud.asset.v1.RelatedAsset.Builder, com.google.cloud.asset.v1.RelatedAssetOrBuilder> 
        getAssetsFieldBuilder() {
      if (assetsBuilder_ == null) {
        assetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.RelatedAsset, com.google.cloud.asset.v1.RelatedAsset.Builder, com.google.cloud.asset.v1.RelatedAssetOrBuilder>(
                assets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        assets_ = null;
      }
      return assetsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.RelatedAssets)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.RelatedAssets)
  private static final com.google.cloud.asset.v1.RelatedAssets DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.RelatedAssets();
  }

  public static com.google.cloud.asset.v1.RelatedAssets getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelatedAssets>
      PARSER = new com.google.protobuf.AbstractParser<RelatedAssets>() {
    @java.lang.Override
    public RelatedAssets parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RelatedAssets(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RelatedAssets> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelatedAssets> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedAssets getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

