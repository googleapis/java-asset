// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p1beta1/assets.proto

package com.google.cloud.asset.v1p1beta1;

/**
 * <pre>
 * IAM permissions
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p1beta1.Permissions}
 */
public final class Permissions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p1beta1.Permissions)
    PermissionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Permissions.newBuilder() to construct.
  private Permissions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Permissions() {
    permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Permissions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Permissions(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              permissions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            permissions_.add(s);
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
        permissions_ = permissions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1p1beta1.AssetProto.internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p1beta1.AssetProto.internal_static_google_cloud_asset_v1p1beta1_Permissions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p1beta1.Permissions.class, com.google.cloud.asset.v1p1beta1.Permissions.Builder.class);
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList permissions_;
  /**
   * <pre>
   * A list of permissions. A sample permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   * @return A list containing the permissions.
   */
  public com.google.protobuf.ProtocolStringList
      getPermissionsList() {
    return permissions_;
  }
  /**
   * <pre>
   * A list of permissions. A sample permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   * @return The count of permissions.
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <pre>
   * A list of permissions. A sample permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  public java.lang.String getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <pre>
   * A list of permissions. A sample permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  public com.google.protobuf.ByteString
      getPermissionsBytes(int index) {
    return permissions_.getByteString(index);
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
    for (int i = 0; i < permissions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, permissions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += computeStringSizeNoTag(permissions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPermissionsList().size();
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
    if (!(obj instanceof com.google.cloud.asset.v1p1beta1.Permissions)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p1beta1.Permissions other = (com.google.cloud.asset.v1p1beta1.Permissions) obj;

    if (!getPermissionsList()
        .equals(other.getPermissionsList())) return false;
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
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1p1beta1.Permissions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1p1beta1.Permissions prototype) {
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
   * IAM permissions
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p1beta1.Permissions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p1beta1.Permissions)
      com.google.cloud.asset.v1p1beta1.PermissionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1p1beta1.AssetProto.internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p1beta1.AssetProto.internal_static_google_cloud_asset_v1p1beta1_Permissions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p1beta1.Permissions.class, com.google.cloud.asset.v1p1beta1.Permissions.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p1beta1.Permissions.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1p1beta1.AssetProto.internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.Permissions getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p1beta1.Permissions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.Permissions build() {
      com.google.cloud.asset.v1p1beta1.Permissions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.Permissions buildPartial() {
      com.google.cloud.asset.v1p1beta1.Permissions result = new com.google.cloud.asset.v1p1beta1.Permissions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.permissions_ = permissions_;
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
      if (other instanceof com.google.cloud.asset.v1p1beta1.Permissions) {
        return mergeFrom((com.google.cloud.asset.v1p1beta1.Permissions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p1beta1.Permissions other) {
      if (other == com.google.cloud.asset.v1p1beta1.Permissions.getDefaultInstance()) return this;
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
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
      com.google.cloud.asset.v1p1beta1.Permissions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1p1beta1.Permissions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        permissions_ = new com.google.protobuf.LazyStringArrayList(permissions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @return A list containing the permissions.
     */
    public com.google.protobuf.ProtocolStringList
        getPermissionsList() {
      return permissions_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @return The count of permissions.
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param index The index of the element to return.
     * @return The permissions at the given index.
     */
    public java.lang.String getPermissions(int index) {
      return permissions_.get(index);
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the permissions at the given index.
     */
    public com.google.protobuf.ByteString
        getPermissionsBytes(int index) {
      return permissions_.getByteString(index);
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param index The index to set the value at.
     * @param value The permissions to set.
     * @return This builder for chaining.
     */
    public Builder setPermissions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param value The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param values The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPermissions(
        java.lang.Iterable<java.lang.String> values) {
      ensurePermissionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, permissions_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissions() {
      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of permissions. A sample permission string: "compute.disk.get".
     * </pre>
     *
     * <code>repeated string permissions = 1;</code>
     * @param value The bytes of the permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p1beta1.Permissions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p1beta1.Permissions)
  private static final com.google.cloud.asset.v1p1beta1.Permissions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p1beta1.Permissions();
  }

  public static com.google.cloud.asset.v1p1beta1.Permissions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Permissions>
      PARSER = new com.google.protobuf.AbstractParser<Permissions>() {
    @java.lang.Override
    public Permissions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Permissions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Permissions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Permissions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p1beta1.Permissions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
