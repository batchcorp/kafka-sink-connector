// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-collector.proto

package sh.batch.services;

/**
 * Protobuf type {@code services.GenericRecordResponse}
 */
public  final class GenericRecordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.GenericRecordResponse)
    GenericRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenericRecordResponse.newBuilder() to construct.
  private GenericRecordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenericRecordResponse() {
    numRecordsProcessed_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenericRecordResponse(
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
          case 8: {

            numRecordsProcessed_ = input.readInt64();
            break;
          }
          case 18: {
            sh.batch.events.ResponseStatus.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(sh.batch.events.ResponseStatus.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sh.batch.services.GrpcCollector.internal_static_services_GenericRecordResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sh.batch.services.GrpcCollector.internal_static_services_GenericRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sh.batch.services.GenericRecordResponse.class, sh.batch.services.GenericRecordResponse.Builder.class);
  }

  public static final int NUM_RECORDS_PROCESSED_FIELD_NUMBER = 1;
  private long numRecordsProcessed_;
  /**
   * <code>int64 num_records_processed = 1;</code>
   */
  public long getNumRecordsProcessed() {
    return numRecordsProcessed_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private sh.batch.events.ResponseStatus.Status status_;
  /**
   * <code>.events.Status status = 2;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.events.Status status = 2;</code>
   */
  public sh.batch.events.ResponseStatus.Status getStatus() {
    return status_ == null ? sh.batch.events.ResponseStatus.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.events.Status status = 2;</code>
   */
  public sh.batch.events.ResponseStatus.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (numRecordsProcessed_ != 0L) {
      output.writeInt64(1, numRecordsProcessed_);
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numRecordsProcessed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numRecordsProcessed_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof sh.batch.services.GenericRecordResponse)) {
      return super.equals(obj);
    }
    sh.batch.services.GenericRecordResponse other = (sh.batch.services.GenericRecordResponse) obj;

    boolean result = true;
    result = result && (getNumRecordsProcessed()
        == other.getNumRecordsProcessed());
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
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
    hash = (37 * hash) + NUM_RECORDS_PROCESSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumRecordsProcessed());
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sh.batch.services.GenericRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sh.batch.services.GenericRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sh.batch.services.GenericRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sh.batch.services.GenericRecordResponse parseFrom(
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
  public static Builder newBuilder(sh.batch.services.GenericRecordResponse prototype) {
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
   * Protobuf type {@code services.GenericRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.GenericRecordResponse)
      sh.batch.services.GenericRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sh.batch.services.GrpcCollector.internal_static_services_GenericRecordResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sh.batch.services.GrpcCollector.internal_static_services_GenericRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sh.batch.services.GenericRecordResponse.class, sh.batch.services.GenericRecordResponse.Builder.class);
    }

    // Construct using sh.batch.services.GenericRecordResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      numRecordsProcessed_ = 0L;

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sh.batch.services.GrpcCollector.internal_static_services_GenericRecordResponse_descriptor;
    }

    public sh.batch.services.GenericRecordResponse getDefaultInstanceForType() {
      return sh.batch.services.GenericRecordResponse.getDefaultInstance();
    }

    public sh.batch.services.GenericRecordResponse build() {
      sh.batch.services.GenericRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sh.batch.services.GenericRecordResponse buildPartial() {
      sh.batch.services.GenericRecordResponse result = new sh.batch.services.GenericRecordResponse(this);
      result.numRecordsProcessed_ = numRecordsProcessed_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof sh.batch.services.GenericRecordResponse) {
        return mergeFrom((sh.batch.services.GenericRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sh.batch.services.GenericRecordResponse other) {
      if (other == sh.batch.services.GenericRecordResponse.getDefaultInstance()) return this;
      if (other.getNumRecordsProcessed() != 0L) {
        setNumRecordsProcessed(other.getNumRecordsProcessed());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      sh.batch.services.GenericRecordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sh.batch.services.GenericRecordResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long numRecordsProcessed_ ;
    /**
     * <code>int64 num_records_processed = 1;</code>
     */
    public long getNumRecordsProcessed() {
      return numRecordsProcessed_;
    }
    /**
     * <code>int64 num_records_processed = 1;</code>
     */
    public Builder setNumRecordsProcessed(long value) {
      
      numRecordsProcessed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_records_processed = 1;</code>
     */
    public Builder clearNumRecordsProcessed() {
      
      numRecordsProcessed_ = 0L;
      onChanged();
      return this;
    }

    private sh.batch.events.ResponseStatus.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        sh.batch.events.ResponseStatus.Status, sh.batch.events.ResponseStatus.Status.Builder, sh.batch.events.ResponseStatus.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.events.Status status = 2;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public sh.batch.events.ResponseStatus.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? sh.batch.events.ResponseStatus.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public Builder setStatus(sh.batch.events.ResponseStatus.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public Builder setStatus(
        sh.batch.events.ResponseStatus.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public Builder mergeStatus(sh.batch.events.ResponseStatus.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            sh.batch.events.ResponseStatus.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public sh.batch.events.ResponseStatus.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    public sh.batch.events.ResponseStatus.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            sh.batch.events.ResponseStatus.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.events.Status status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sh.batch.events.ResponseStatus.Status, sh.batch.events.ResponseStatus.Status.Builder, sh.batch.events.ResponseStatus.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sh.batch.events.ResponseStatus.Status, sh.batch.events.ResponseStatus.Status.Builder, sh.batch.events.ResponseStatus.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.GenericRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:services.GenericRecordResponse)
  private static final sh.batch.services.GenericRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sh.batch.services.GenericRecordResponse();
  }

  public static sh.batch.services.GenericRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenericRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenericRecordResponse>() {
    public GenericRecordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenericRecordResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenericRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenericRecordResponse> getParserForType() {
    return PARSER;
  }

  public sh.batch.services.GenericRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

