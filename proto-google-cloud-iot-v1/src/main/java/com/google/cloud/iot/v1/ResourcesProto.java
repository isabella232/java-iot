/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_Device_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_GatewayConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_HttpConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_RegistryCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/iot/v1/resources.proto\022\023g"
          + "oogle.cloud.iot.v1\032\031google/api/resource."
          + "proto\032\037google/protobuf/timestamp.proto\032\027"
          + "google/rpc/status.proto\"\260\007\n\006Device\022\n\n\002id"
          + "\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006num_id\030\003 \001(\004\022:\n\013"
          + "credentials\030\014 \003(\0132%.google.cloud.iot.v1."
          + "DeviceCredential\0227\n\023last_heartbeat_time\030"
          + "\007 \001(\0132\032.google.protobuf.Timestamp\0223\n\017las"
          + "t_event_time\030\010 \001(\0132\032.google.protobuf.Tim"
          + "estamp\0223\n\017last_state_time\030\024 \001(\0132\032.google"
          + ".protobuf.Timestamp\0228\n\024last_config_ack_t"
          + "ime\030\016 \001(\0132\032.google.protobuf.Timestamp\0229\n"
          + "\025last_config_send_time\030\022 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\022\017\n\007blocked\030\023 \001(\010\0223\n\017las"
          + "t_error_time\030\n \001(\0132\032.google.protobuf.Tim"
          + "estamp\022-\n\021last_error_status\030\013 \001(\0132\022.goog"
          + "le.rpc.Status\0221\n\006config\030\r \001(\0132!.google.c"
          + "loud.iot.v1.DeviceConfig\022/\n\005state\030\020 \001(\0132"
          + " .google.cloud.iot.v1.DeviceState\0220\n\tlog"
          + "_level\030\025 \001(\0162\035.google.cloud.iot.v1.LogLe"
          + "vel\022;\n\010metadata\030\021 \003(\0132).google.cloud.iot"
          + ".v1.Device.MetadataEntry\022:\n\016gateway_conf"
          + "ig\030\030 \001(\0132\".google.cloud.iot.v1.GatewayCo"
          + "nfig\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001:s\352Ap\n\036cloudiot.googleapis."
          + "com/Device\022Nprojects/{project}/locations"
          + "/{location}/registries/{registry}/device"
          + "s/{device}\"\356\001\n\rGatewayConfig\0226\n\014gateway_"
          + "type\030\001 \001(\0162 .google.cloud.iot.v1.Gateway"
          + "Type\022C\n\023gateway_auth_method\030\002 \001(\0162&.goog"
          + "le.cloud.iot.v1.GatewayAuthMethod\022 \n\030las"
          + "t_accessed_gateway_id\030\003 \001(\t\022>\n\032last_acce"
          + "ssed_gateway_time\030\004 \001(\0132\032.google.protobu"
          + "f.Timestamp\"\217\004\n\016DeviceRegistry\022\n\n\002id\030\001 \001"
          + "(\t\022\014\n\004name\030\002 \001(\t\022P\n\032event_notification_c"
          + "onfigs\030\n \003(\0132,.google.cloud.iot.v1.Event"
          + "NotificationConfig\022O\n\031state_notification"
          + "_config\030\007 \001(\0132,.google.cloud.iot.v1.Stat"
          + "eNotificationConfig\0224\n\013mqtt_config\030\004 \001(\013"
          + "2\037.google.cloud.iot.v1.MqttConfig\0224\n\013htt"
          + "p_config\030\t \001(\0132\037.google.cloud.iot.v1.Htt"
          + "pConfig\0220\n\tlog_level\030\013 \001(\0162\035.google.clou"
          + "d.iot.v1.LogLevel\022<\n\013credentials\030\010 \003(\0132\'"
          + ".google.cloud.iot.v1.RegistryCredential:"
          + "d\352Aa\n cloudiot.googleapis.com/Registry\022="
          + "projects/{project}/locations/{location}/"
          + "registries/{registry}\"H\n\nMqttConfig\022:\n\022m"
          + "qtt_enabled_state\030\001 \001(\0162\036.google.cloud.i"
          + "ot.v1.MqttState\"H\n\nHttpConfig\022:\n\022http_en"
          + "abled_state\030\001 \001(\0162\036.google.cloud.iot.v1."
          + "HttpState\"O\n\027EventNotificationConfig\022\031\n\021"
          + "subfolder_matches\030\002 \001(\t\022\031\n\021pubsub_topic_"
          + "name\030\001 \001(\t\"4\n\027StateNotificationConfig\022\031\n"
          + "\021pubsub_topic_name\030\001 \001(\t\"o\n\022RegistryCred"
          + "ential\022K\n\026public_key_certificate\030\001 \001(\0132)"
          + ".google.cloud.iot.v1.PublicKeyCertificat"
          + "eH\000B\014\n\ncredential\"\320\001\n\026X509CertificateDet"
          + "ails\022\016\n\006issuer\030\001 \001(\t\022\017\n\007subject\030\002 \001(\t\022.\n"
          + "\nstart_time\030\003 \001(\0132\032.google.protobuf.Time"
          + "stamp\022/\n\013expiry_time\030\004 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022\033\n\023signature_algorithm\030\005 "
          + "\001(\t\022\027\n\017public_key_type\030\006 \001(\t\"\257\001\n\024PublicK"
          + "eyCertificate\022?\n\006format\030\001 \001(\0162/.google.c"
          + "loud.iot.v1.PublicKeyCertificateFormat\022\023"
          + "\n\013certificate\030\002 \001(\t\022A\n\014x509_details\030\003 \001("
          + "\0132+.google.cloud.iot.v1.X509CertificateD"
          + "etails\"\225\001\n\020DeviceCredential\022>\n\npublic_ke"
          + "y\030\002 \001(\0132(.google.cloud.iot.v1.PublicKeyC"
          + "redentialH\000\0223\n\017expiration_time\030\006 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\014\n\ncredential\"X"
          + "\n\023PublicKeyCredential\0224\n\006format\030\001 \001(\0162$."
          + "google.cloud.iot.v1.PublicKeyFormat\022\013\n\003k"
          + "ey\030\002 \001(\t\"\240\001\n\014DeviceConfig\022\017\n\007version\030\001 \001"
          + "(\003\0225\n\021cloud_update_time\030\002 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\0223\n\017device_ack_time\030\003 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\023\n\013binary"
          + "_data\030\004 \001(\014\"S\n\013DeviceState\022/\n\013update_tim"
          + "e\030\001 \001(\0132\032.google.protobuf.Timestamp\022\023\n\013b"
          + "inary_data\030\002 \001(\014*L\n\tMqttState\022\032\n\026MQTT_ST"
          + "ATE_UNSPECIFIED\020\000\022\020\n\014MQTT_ENABLED\020\001\022\021\n\rM"
          + "QTT_DISABLED\020\002*L\n\tHttpState\022\032\n\026HTTP_STAT"
          + "E_UNSPECIFIED\020\000\022\020\n\014HTTP_ENABLED\020\001\022\021\n\rHTT"
          + "P_DISABLED\020\002*O\n\010LogLevel\022\031\n\025LOG_LEVEL_UN"
          + "SPECIFIED\020\000\022\010\n\004NONE\020\n\022\t\n\005ERROR\020\024\022\010\n\004INFO"
          + "\020\036\022\t\n\005DEBUG\020(*I\n\013GatewayType\022\034\n\030GATEWAY_"
          + "TYPE_UNSPECIFIED\020\000\022\013\n\007GATEWAY\020\001\022\017\n\013NON_G"
          + "ATEWAY\020\002*\221\001\n\021GatewayAuthMethod\022#\n\037GATEWA"
          + "Y_AUTH_METHOD_UNSPECIFIED\020\000\022\024\n\020ASSOCIATI"
          + "ON_ONLY\020\001\022\032\n\026DEVICE_AUTH_TOKEN_ONLY\020\002\022%\n"
          + "!ASSOCIATION_AND_DEVICE_AUTH_TOKEN\020\003*e\n\032"
          + "PublicKeyCertificateFormat\022-\n)UNSPECIFIE"
          + "D_PUBLIC_KEY_CERTIFICATE_FORMAT\020\000\022\030\n\024X50"
          + "9_CERTIFICATE_PEM\020\001*v\n\017PublicKeyFormat\022!"
          + "\n\035UNSPECIFIED_PUBLIC_KEY_FORMAT\020\000\022\013\n\007RSA"
          + "_PEM\020\003\022\020\n\014RSA_X509_PEM\020\001\022\r\n\tES256_PEM\020\002\022"
          + "\022\n\016ES256_X509_PEM\020\004Bf\n\027com.google.cloud."
          + "iot.v1B\016ResourcesProtoP\001Z6google.golang."
          + "org/genproto/googleapis/cloud/iot/v1;iot"
          + "\370\001\001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_iot_v1_Device_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_Device_descriptor,
            new java.lang.String[] {
              "Id",
              "Name",
              "NumId",
              "Credentials",
              "LastHeartbeatTime",
              "LastEventTime",
              "LastStateTime",
              "LastConfigAckTime",
              "LastConfigSendTime",
              "Blocked",
              "LastErrorTime",
              "LastErrorStatus",
              "Config",
              "State",
              "LogLevel",
              "Metadata",
              "GatewayConfig",
            });
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor =
        internal_static_google_cloud_iot_v1_Device_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_iot_v1_GatewayConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_GatewayConfig_descriptor,
            new java.lang.String[] {
              "GatewayType",
              "GatewayAuthMethod",
              "LastAccessedGatewayId",
              "LastAccessedGatewayTime",
            });
    internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor,
            new java.lang.String[] {
              "Id",
              "Name",
              "EventNotificationConfigs",
              "StateNotificationConfig",
              "MqttConfig",
              "HttpConfig",
              "LogLevel",
              "Credentials",
            });
    internal_static_google_cloud_iot_v1_MqttConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_MqttConfig_descriptor,
            new java.lang.String[] {
              "MqttEnabledState",
            });
    internal_static_google_cloud_iot_v1_HttpConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_HttpConfig_descriptor,
            new java.lang.String[] {
              "HttpEnabledState",
            });
    internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor,
            new java.lang.String[] {
              "SubfolderMatches", "PubsubTopicName",
            });
    internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor,
            new java.lang.String[] {
              "PubsubTopicName",
            });
    internal_static_google_cloud_iot_v1_RegistryCredential_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_RegistryCredential_descriptor,
            new java.lang.String[] {
              "PublicKeyCertificate", "Credential",
            });
    internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor,
            new java.lang.String[] {
              "Issuer", "Subject", "StartTime", "ExpiryTime", "SignatureAlgorithm", "PublicKeyType",
            });
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor,
            new java.lang.String[] {
              "Format", "Certificate", "X509Details",
            });
    internal_static_google_cloud_iot_v1_DeviceCredential_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceCredential_descriptor,
            new java.lang.String[] {
              "PublicKey", "ExpirationTime", "Credential",
            });
    internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor,
            new java.lang.String[] {
              "Format", "Key",
            });
    internal_static_google_cloud_iot_v1_DeviceConfig_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceConfig_descriptor,
            new java.lang.String[] {
              "Version", "CloudUpdateTime", "DeviceAckTime", "BinaryData",
            });
    internal_static_google_cloud_iot_v1_DeviceState_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceState_descriptor,
            new java.lang.String[] {
              "UpdateTime", "BinaryData",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
