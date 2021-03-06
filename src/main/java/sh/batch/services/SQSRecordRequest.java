// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-collector.proto

package sh.batch.services;

/**
 * Protobuf type {@code services.SQSRecordRequest}
 */
public  final class SQSRecordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.SQSRecordRequest)
    SQSRecordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SQSRecordRequest.newBuilder() to construct.
  private SQSRecordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SQSRecordRequest() {
    records_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SQSRecordRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              records_ = new java.util.ArrayList<sh.batch.events.records.Sqs.SQSRecord>();
              mutable_bitField0_ |= 0x00000001;
            }
            records_.add(
                input.readMessage(sh.batch.events.records.Sqs.SQSRecord.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        records_ = java.util.Collections.unmodifiableList(records_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sh.batch.services.GrpcCollector.internal_static_services_SQSRecordRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sh.batch.services.GrpcCollector.internal_static_services_SQSRecordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sh.batch.services.SQSRecordRequest.class, sh.batch.services.SQSRecordRequest.Builder.class);
  }

  public static final int RECORDS_FIELD_NUMBER = 1;
  private java.util.List<sh.batch.events.records.Sqs.SQSRecord> records_;
  /**
   * <code>repeated .records.SQSRecord records = 1;</code>
   */
  public java.util.List<sh.batch.events.records.Sqs.SQSRecord> getRecordsList() {
    return records_;
  }
  /**
   * <code>repeated .records.SQSRecord records = 1;</code>
   */
  public java.util.List<? extends sh.batch.events.records.Sqs.SQSRecordOrBuilder> 
      getRecordsOrBuilderList() {
    return records_;
  }
  /**
   * <code>repeated .records.SQSRecord records = 1;</code>
   */
  public int getRecordsCount() {
    return records_.size();
  }
  /**
   * <code>repeated .records.SQSRecord records = 1;</code>
   */
  public sh.batch.events.records.Sqs.SQSRecord getRecords(int index) {
    return records_.get(index);
  }
  /**
   * <code>repeated .records.SQSRecord records = 1;</code>
   */
  public sh.batch.events.records.Sqs.SQSRecordOrBuilder getRecordsOrBuilder(
      int index) {
    return records_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < records_.size(); i++) {
      output.writeMessage(1, records_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < records_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, records_.get(i));
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
    if (!(obj instanceof sh.batch.services.SQSRecordRequest)) {
      return super.equals(obj);
    }
    sh.batch.services.SQSRecordRequest other = (sh.batch.services.SQSRecordRequest) obj;

    boolean result = true;
    result = result && getRecordsList()
        .equals(other.getRecordsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRecordsCount() > 0) {
      hash = (37 * hash) + RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sh.batch.services.SQSRecordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sh.batch.services.SQSRecordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sh.batch.services.SQSRecordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sh.batch.services.SQSRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sh.batch.services.SQSRecordRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code services.SQSRecordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.SQSRecordRequest)
      sh.batch.services.SQSRecordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sh.batch.services.GrpcCollector.internal_static_services_SQSRecordRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sh.batch.services.GrpcCollector.internal_static_services_SQSRecordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sh.batch.services.SQSRecordRequest.class, sh.batch.services.SQSRecordRequest.Builder.class);
    }

    // Construct using sh.batch.services.SQSRecordRequest.newBuilder()
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
        getRecordsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sh.batch.services.GrpcCollector.internal_static_services_SQSRecordRequest_descriptor;
    }

    public sh.batch.services.SQSRecordRequest getDefaultInstanceForType() {
      return sh.batch.services.SQSRecordRequest.getDefaultInstance();
    }

    public sh.batch.services.SQSRecordRequest build() {
      sh.batch.services.SQSRecordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sh.batch.services.SQSRecordRequest buildPartial() {
      sh.batch.services.SQSRecordRequest result = new sh.batch.services.SQSRecordRequest(this);
      int from_bitField0_ = bitField0_;
      if (recordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          records_ = java.util.Collections.unmodifiableList(records_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.records_ = records_;
      } else {
        result.records_ = recordsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sh.batch.services.SQSRecordRequest) {
        return mergeFrom((sh.batch.services.SQSRecordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sh.batch.services.SQSRecordRequest other) {
      if (other == sh.batch.services.SQSRecordRequest.getDefaultInstance()) return this;
      if (recordsBuilder_ == null) {
        if (!other.records_.isEmpty()) {
          if (records_.isEmpty()) {
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecordsIsMutable();
            records_.addAll(other.records_);
          }
          onChanged();
        }
      } else {
        if (!other.records_.isEmpty()) {
          if (recordsBuilder_.isEmpty()) {
            recordsBuilder_.dispose();
            recordsBuilder_ = null;
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordsFieldBuilder() : null;
          } else {
            recordsBuilder_.addAllMessages(other.records_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sh.batch.services.SQSRecordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sh.batch.services.SQSRecordRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<sh.batch.events.records.Sqs.SQSRecord> records_ =
      java.util.Collections.emptyList();
    private void ensureRecordsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        records_ = new java.util.ArrayList<sh.batch.events.records.Sqs.SQSRecord>(records_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sh.batch.events.records.Sqs.SQSRecord, sh.batch.events.records.Sqs.SQSRecord.Builder, sh.batch.events.records.Sqs.SQSRecordOrBuilder> recordsBuilder_;

    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public java.util.List<sh.batch.events.records.Sqs.SQSRecord> getRecordsList() {
      if (recordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(records_);
      } else {
        return recordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public int getRecordsCount() {
      if (recordsBuilder_ == null) {
        return records_.size();
      } else {
        return recordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public sh.batch.events.records.Sqs.SQSRecord getRecords(int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);
      } else {
        return recordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder setRecords(
        int index, sh.batch.events.records.Sqs.SQSRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.set(index, value);
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder setRecords(
        int index, sh.batch.events.records.Sqs.SQSRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder addRecords(sh.batch.events.records.Sqs.SQSRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder addRecords(
        int index, sh.batch.events.records.Sqs.SQSRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(index, value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder addRecords(
        sh.batch.events.records.Sqs.SQSRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder addRecords(
        int index, sh.batch.events.records.Sqs.SQSRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder addAllRecords(
        java.lang.Iterable<? extends sh.batch.events.records.Sqs.SQSRecord> values) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, records_);
        onChanged();
      } else {
        recordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder clearRecords() {
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public Builder removeRecords(int index) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.remove(index);
        onChanged();
      } else {
        recordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public sh.batch.events.records.Sqs.SQSRecord.Builder getRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public sh.batch.events.records.Sqs.SQSRecordOrBuilder getRecordsOrBuilder(
        int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);  } else {
        return recordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public java.util.List<? extends sh.batch.events.records.Sqs.SQSRecordOrBuilder> 
         getRecordsOrBuilderList() {
      if (recordsBuilder_ != null) {
        return recordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(records_);
      }
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public sh.batch.events.records.Sqs.SQSRecord.Builder addRecordsBuilder() {
      return getRecordsFieldBuilder().addBuilder(
          sh.batch.events.records.Sqs.SQSRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public sh.batch.events.records.Sqs.SQSRecord.Builder addRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().addBuilder(
          index, sh.batch.events.records.Sqs.SQSRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .records.SQSRecord records = 1;</code>
     */
    public java.util.List<sh.batch.events.records.Sqs.SQSRecord.Builder> 
         getRecordsBuilderList() {
      return getRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sh.batch.events.records.Sqs.SQSRecord, sh.batch.events.records.Sqs.SQSRecord.Builder, sh.batch.events.records.Sqs.SQSRecordOrBuilder> 
        getRecordsFieldBuilder() {
      if (recordsBuilder_ == null) {
        recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sh.batch.events.records.Sqs.SQSRecord, sh.batch.events.records.Sqs.SQSRecord.Builder, sh.batch.events.records.Sqs.SQSRecordOrBuilder>(
                records_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        records_ = null;
      }
      return recordsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.SQSRecordRequest)
  }

  // @@protoc_insertion_point(class_scope:services.SQSRecordRequest)
  private static final sh.batch.services.SQSRecordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sh.batch.services.SQSRecordRequest();
  }

  public static sh.batch.services.SQSRecordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SQSRecordRequest>
      PARSER = new com.google.protobuf.AbstractParser<SQSRecordRequest>() {
    public SQSRecordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SQSRecordRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SQSRecordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SQSRecordRequest> getParserForType() {
    return PARSER;
  }

  public sh.batch.services.SQSRecordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

