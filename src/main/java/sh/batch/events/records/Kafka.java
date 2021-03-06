// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: records/kafka.proto

package sh.batch.events.records;

public final class Kafka {
  private Kafka() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KafkaSinkRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:records.KafkaSinkRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string topic = 1;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>string topic = 1;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    /**
     * <code>bytes key = 2;</code>
     */
    com.google.protobuf.ByteString getKey();

    /**
     * <code>bytes value = 3;</code>
     */
    com.google.protobuf.ByteString getValue();

    /**
     * <code>int64 timestamp = 4;</code>
     */
    long getTimestamp();

    /**
     * <code>int64 offset = 5;</code>
     */
    long getOffset();

    /**
     * <code>int32 partition = 6;</code>
     */
    int getPartition();
  }
  /**
   * Protobuf type {@code records.KafkaSinkRecord}
   */
  public  static final class KafkaSinkRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:records.KafkaSinkRecord)
      KafkaSinkRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KafkaSinkRecord.newBuilder() to construct.
    private KafkaSinkRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KafkaSinkRecord() {
      topic_ = "";
      key_ = com.google.protobuf.ByteString.EMPTY;
      value_ = com.google.protobuf.ByteString.EMPTY;
      timestamp_ = 0L;
      offset_ = 0L;
      partition_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KafkaSinkRecord(
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
              java.lang.String s = input.readStringRequireUtf8();

              topic_ = s;
              break;
            }
            case 18: {

              key_ = input.readBytes();
              break;
            }
            case 26: {

              value_ = input.readBytes();
              break;
            }
            case 32: {

              timestamp_ = input.readInt64();
              break;
            }
            case 40: {

              offset_ = input.readInt64();
              break;
            }
            case 48: {

              partition_ = input.readInt32();
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
      return sh.batch.events.records.Kafka.internal_static_records_KafkaSinkRecord_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sh.batch.events.records.Kafka.internal_static_records_KafkaSinkRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sh.batch.events.records.Kafka.KafkaSinkRecord.class, sh.batch.events.records.Kafka.KafkaSinkRecord.Builder.class);
    }

    public static final int TOPIC_FIELD_NUMBER = 1;
    private volatile java.lang.Object topic_;
    /**
     * <code>string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      }
    }
    /**
     * <code>string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString key_;
    /**
     * <code>bytes key = 2;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }

    public static final int VALUE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString value_;
    /**
     * <code>bytes value = 3;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 4;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int OFFSET_FIELD_NUMBER = 5;
    private long offset_;
    /**
     * <code>int64 offset = 5;</code>
     */
    public long getOffset() {
      return offset_;
    }

    public static final int PARTITION_FIELD_NUMBER = 6;
    private int partition_;
    /**
     * <code>int32 partition = 6;</code>
     */
    public int getPartition() {
      return partition_;
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
      if (!getTopicBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
      }
      if (!key_.isEmpty()) {
        output.writeBytes(2, key_);
      }
      if (!value_.isEmpty()) {
        output.writeBytes(3, value_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(4, timestamp_);
      }
      if (offset_ != 0L) {
        output.writeInt64(5, offset_);
      }
      if (partition_ != 0) {
        output.writeInt32(6, partition_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTopicBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
      }
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, key_);
      }
      if (!value_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, value_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, timestamp_);
      }
      if (offset_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, offset_);
      }
      if (partition_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, partition_);
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
      if (!(obj instanceof sh.batch.events.records.Kafka.KafkaSinkRecord)) {
        return super.equals(obj);
      }
      sh.batch.events.records.Kafka.KafkaSinkRecord other = (sh.batch.events.records.Kafka.KafkaSinkRecord) obj;

      boolean result = true;
      result = result && getTopic()
          .equals(other.getTopic());
      result = result && getKey()
          .equals(other.getKey());
      result = result && getValue()
          .equals(other.getValue());
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && (getOffset()
          == other.getOffset());
      result = result && (getPartition()
          == other.getPartition());
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
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOffset());
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sh.batch.events.records.Kafka.KafkaSinkRecord parseFrom(
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
    public static Builder newBuilder(sh.batch.events.records.Kafka.KafkaSinkRecord prototype) {
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
     * Protobuf type {@code records.KafkaSinkRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:records.KafkaSinkRecord)
        sh.batch.events.records.Kafka.KafkaSinkRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sh.batch.events.records.Kafka.internal_static_records_KafkaSinkRecord_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sh.batch.events.records.Kafka.internal_static_records_KafkaSinkRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sh.batch.events.records.Kafka.KafkaSinkRecord.class, sh.batch.events.records.Kafka.KafkaSinkRecord.Builder.class);
      }

      // Construct using sh.batch.events.records.Kafka.KafkaSinkRecord.newBuilder()
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
        topic_ = "";

        key_ = com.google.protobuf.ByteString.EMPTY;

        value_ = com.google.protobuf.ByteString.EMPTY;

        timestamp_ = 0L;

        offset_ = 0L;

        partition_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sh.batch.events.records.Kafka.internal_static_records_KafkaSinkRecord_descriptor;
      }

      public sh.batch.events.records.Kafka.KafkaSinkRecord getDefaultInstanceForType() {
        return sh.batch.events.records.Kafka.KafkaSinkRecord.getDefaultInstance();
      }

      public sh.batch.events.records.Kafka.KafkaSinkRecord build() {
        sh.batch.events.records.Kafka.KafkaSinkRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public sh.batch.events.records.Kafka.KafkaSinkRecord buildPartial() {
        sh.batch.events.records.Kafka.KafkaSinkRecord result = new sh.batch.events.records.Kafka.KafkaSinkRecord(this);
        result.topic_ = topic_;
        result.key_ = key_;
        result.value_ = value_;
        result.timestamp_ = timestamp_;
        result.offset_ = offset_;
        result.partition_ = partition_;
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
        if (other instanceof sh.batch.events.records.Kafka.KafkaSinkRecord) {
          return mergeFrom((sh.batch.events.records.Kafka.KafkaSinkRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sh.batch.events.records.Kafka.KafkaSinkRecord other) {
        if (other == sh.batch.events.records.Kafka.KafkaSinkRecord.getDefaultInstance()) return this;
        if (!other.getTopic().isEmpty()) {
          topic_ = other.topic_;
          onChanged();
        }
        if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
          setKey(other.getKey());
        }
        if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
          setValue(other.getValue());
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getOffset() != 0L) {
          setOffset(other.getOffset());
        }
        if (other.getPartition() != 0) {
          setPartition(other.getPartition());
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
        sh.batch.events.records.Kafka.KafkaSinkRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sh.batch.events.records.Kafka.KafkaSinkRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object topic_ = "";
      /**
       * <code>string topic = 1;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string topic = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder clearTopic() {
        
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        topic_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key = 2;</code>
       */
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>bytes key = 2;</code>
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key = 2;</code>
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes value = 3;</code>
       */
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>bytes value = 3;</code>
       */
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes value = 3;</code>
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 4;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 4;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 4;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private long offset_ ;
      /**
       * <code>int64 offset = 5;</code>
       */
      public long getOffset() {
        return offset_;
      }
      /**
       * <code>int64 offset = 5;</code>
       */
      public Builder setOffset(long value) {
        
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 offset = 5;</code>
       */
      public Builder clearOffset() {
        
        offset_ = 0L;
        onChanged();
        return this;
      }

      private int partition_ ;
      /**
       * <code>int32 partition = 6;</code>
       */
      public int getPartition() {
        return partition_;
      }
      /**
       * <code>int32 partition = 6;</code>
       */
      public Builder setPartition(int value) {
        
        partition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 partition = 6;</code>
       */
      public Builder clearPartition() {
        
        partition_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:records.KafkaSinkRecord)
    }

    // @@protoc_insertion_point(class_scope:records.KafkaSinkRecord)
    private static final sh.batch.events.records.Kafka.KafkaSinkRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sh.batch.events.records.Kafka.KafkaSinkRecord();
    }

    public static sh.batch.events.records.Kafka.KafkaSinkRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KafkaSinkRecord>
        PARSER = new com.google.protobuf.AbstractParser<KafkaSinkRecord>() {
      public KafkaSinkRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new KafkaSinkRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KafkaSinkRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KafkaSinkRecord> getParserForType() {
      return PARSER;
    }

    public sh.batch.events.records.Kafka.KafkaSinkRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_records_KafkaSinkRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_records_KafkaSinkRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023records/kafka.proto\022\007records\"r\n\017KafkaS" +
      "inkRecord\022\r\n\005topic\030\001 \001(\t\022\013\n\003key\030\002 \001(\014\022\r\n" +
      "\005value\030\003 \001(\014\022\021\n\ttimestamp\030\004 \001(\003\022\016\n\006offse" +
      "t\030\005 \001(\003\022\021\n\tpartition\030\006 \001(\005BO\n\027sh.batch.e" +
      "vents.recordsZ4github.com/batchcorp/sche" +
      "mas/build/go/events/recordsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_records_KafkaSinkRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_records_KafkaSinkRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_records_KafkaSinkRecord_descriptor,
        new java.lang.String[] { "Topic", "Key", "Value", "Timestamp", "Offset", "Partition", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
