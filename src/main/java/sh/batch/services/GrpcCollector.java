// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-collector.proto

package sh.batch.services;

public final class GrpcCollector {
  private GrpcCollector() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GenericRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GenericRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GenericRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GenericRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_AMQPRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_AMQPRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_AMQPRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_AMQPRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_KafkaSinkRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_KafkaSinkRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_KafkaSinkRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_KafkaSinkRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_SQSRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_SQSRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_SQSRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_SQSRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_TestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_TestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_TestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_TestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024grpc-collector.proto\022\010services\032\023events" +
      "/status.proto\032\034events/records/generic.pr" +
      "oto\032\031events/records/amqp.proto\032\032events/r" +
      "ecords/kafka.proto\032\030events/records/sqs.p" +
      "roto\"?\n\024GenericRecordRequest\022\'\n\007records\030" +
      "\001 \003(\0132\026.records.GenericRecord\"V\n\025Generic" +
      "RecordResponse\022\035\n\025num_records_processed\030" +
      "\001 \001(\003\022\036\n\006status\030\002 \001(\0132\016.events.Status\"=\n" +
      "\021AMQPRecordRequest\022(\n\007records\030\001 \003(\0132\027.re" +
      "cords.AMQPSinkRecord\"S\n\022AMQPRecordRespon",
      "se\022\035\n\025num_records_processed\030\001 \001(\003\022\036\n\006sta" +
      "tus\030\002 \001(\0132\016.events.Status\"C\n\026KafkaSinkRe" +
      "cordRequest\022)\n\007records\030\001 \003(\0132\030.records.K" +
      "afkaSinkRecord\"X\n\027KafkaSinkRecordRespons" +
      "e\022\035\n\025num_records_processed\030\001 \001(\003\022\036\n\006stat" +
      "us\030\002 \001(\0132\016.events.Status\"7\n\020SQSRecordReq" +
      "uest\022#\n\007records\030\001 \003(\0132\022.records.SQSRecor" +
      "d\"R\n\021SQSRecordResponse\022\035\n\025num_records_pr" +
      "ocessed\030\001 \001(\003\022\036\n\006status\030\002 \001(\0132\016.events.S" +
      "tatus\"\r\n\013TestRequest\".\n\014TestResponse\022\036\n\006",
      "status\030\001 \001(\0132\016.events.Status2\200\003\n\rGRPCCol" +
      "lector\022L\n\tAddRecord\022\036.services.GenericRe" +
      "cordRequest\032\037.services.GenericRecordResp" +
      "onse\022J\n\rAddAMQPRecord\022\033.services.AMQPRec" +
      "ordRequest\032\034.services.AMQPRecordResponse" +
      "\022U\n\016AddKafkaRecord\022 .services.KafkaSinkR" +
      "ecordRequest\032!.services.KafkaSinkRecordR" +
      "esponse\022G\n\014AddSQSRecord\022\032.services.SQSRe" +
      "cordRequest\032\033.services.SQSRecordResponse" +
      "\0225\n\004Test\022\025.services.TestRequest\032\026.servic",
      "es.TestResponseBE\n\021sh.batch.servicesP\001Z." +
      "github.com/batchcorp/schemas/build/go/se" +
      "rvicesb\006proto3"
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
          sh.batch.events.ResponseStatus.getDescriptor(),
          sh.batch.events.records.Generic.getDescriptor(),
          sh.batch.events.records.Amqp.getDescriptor(),
          sh.batch.events.records.Kafka.getDescriptor(),
          sh.batch.events.records.Sqs.getDescriptor(),
        }, assigner);
    internal_static_services_GenericRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_GenericRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GenericRecordRequest_descriptor,
        new java.lang.String[] { "Records", });
    internal_static_services_GenericRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_GenericRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GenericRecordResponse_descriptor,
        new java.lang.String[] { "NumRecordsProcessed", "Status", });
    internal_static_services_AMQPRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_AMQPRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_AMQPRecordRequest_descriptor,
        new java.lang.String[] { "Records", });
    internal_static_services_AMQPRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_AMQPRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_AMQPRecordResponse_descriptor,
        new java.lang.String[] { "NumRecordsProcessed", "Status", });
    internal_static_services_KafkaSinkRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_KafkaSinkRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_KafkaSinkRecordRequest_descriptor,
        new java.lang.String[] { "Records", });
    internal_static_services_KafkaSinkRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_services_KafkaSinkRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_KafkaSinkRecordResponse_descriptor,
        new java.lang.String[] { "NumRecordsProcessed", "Status", });
    internal_static_services_SQSRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_services_SQSRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_SQSRecordRequest_descriptor,
        new java.lang.String[] { "Records", });
    internal_static_services_SQSRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_services_SQSRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_SQSRecordResponse_descriptor,
        new java.lang.String[] { "NumRecordsProcessed", "Status", });
    internal_static_services_TestRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_services_TestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_TestRequest_descriptor,
        new java.lang.String[] { });
    internal_static_services_TestResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_services_TestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_TestResponse_descriptor,
        new java.lang.String[] { "Status", });
    sh.batch.events.ResponseStatus.getDescriptor();
    sh.batch.events.records.Generic.getDescriptor();
    sh.batch.events.records.Amqp.getDescriptor();
    sh.batch.events.records.Kafka.getDescriptor();
    sh.batch.events.records.Sqs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
