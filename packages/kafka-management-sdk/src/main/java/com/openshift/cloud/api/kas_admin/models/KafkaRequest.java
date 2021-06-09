/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kakfa instances and connectors.
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas_admin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.openshift.cloud.api.kas_admin.models.KafkaRequestAllOf;
import com.openshift.cloud.api.kas_admin.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * KafkaRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-08T16:30:41.494320497-04:00[America/New_York]")
public class KafkaRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloud_provider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private String cloudProvider;

  public static final String SERIALIZED_NAME_MULTI_AZ = "multi_az";
  @SerializedName(SERIALIZED_NAME_MULTI_AZ)
  private Boolean multiAz;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BOOTSTRAP_SERVER_HOST = "bootstrap_server_host";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP_SERVER_HOST)
  private String bootstrapServerHost;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_FAILED_REASON = "failed_reason";
  @SerializedName(SERIALIZED_NAME_FAILED_REASON)
  private String failedReason;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public KafkaRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public KafkaRequest kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public KafkaRequest href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public KafkaRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public KafkaRequest cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloudProvider() {
    return cloudProvider;
  }


  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public KafkaRequest multiAz(Boolean multiAz) {
    
    this.multiAz = multiAz;
    return this;
  }

   /**
   * Get multiAz
   * @return multiAz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMultiAz() {
    return multiAz;
  }


  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }


  public KafkaRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public KafkaRequest owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public KafkaRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KafkaRequest bootstrapServerHost(String bootstrapServerHost) {
    
    this.bootstrapServerHost = bootstrapServerHost;
    return this;
  }

   /**
   * Get bootstrapServerHost
   * @return bootstrapServerHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBootstrapServerHost() {
    return bootstrapServerHost;
  }


  public void setBootstrapServerHost(String bootstrapServerHost) {
    this.bootstrapServerHost = bootstrapServerHost;
  }


  public KafkaRequest createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public KafkaRequest updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public KafkaRequest failedReason(String failedReason) {
    
    this.failedReason = failedReason;
    return this;
  }

   /**
   * Get failedReason
   * @return failedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailedReason() {
    return failedReason;
  }


  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public KafkaRequest version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaRequest kafkaRequest = (KafkaRequest) o;
    return Objects.equals(this.id, kafkaRequest.id) &&
        Objects.equals(this.kind, kafkaRequest.kind) &&
        Objects.equals(this.href, kafkaRequest.href) &&
        Objects.equals(this.status, kafkaRequest.status) &&
        Objects.equals(this.cloudProvider, kafkaRequest.cloudProvider) &&
        Objects.equals(this.multiAz, kafkaRequest.multiAz) &&
        Objects.equals(this.region, kafkaRequest.region) &&
        Objects.equals(this.owner, kafkaRequest.owner) &&
        Objects.equals(this.name, kafkaRequest.name) &&
        Objects.equals(this.bootstrapServerHost, kafkaRequest.bootstrapServerHost) &&
        Objects.equals(this.createdAt, kafkaRequest.createdAt) &&
        Objects.equals(this.updatedAt, kafkaRequest.updatedAt) &&
        Objects.equals(this.failedReason, kafkaRequest.failedReason) &&
        Objects.equals(this.version, kafkaRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, status, cloudProvider, multiAz, region, owner, name, bootstrapServerHost, createdAt, updatedAt, failedReason, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bootstrapServerHost: ").append(toIndentedString(bootstrapServerHost)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
