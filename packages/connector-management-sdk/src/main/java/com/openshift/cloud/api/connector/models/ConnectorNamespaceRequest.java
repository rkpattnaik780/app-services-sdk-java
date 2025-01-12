/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestAllOf;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceRequestMeta;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceTenantKind;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A connector namespace create request
 */
@ApiModel(description = "A connector namespace create request")
@JsonPropertyOrder({
  ConnectorNamespaceRequest.JSON_PROPERTY_NAME,
  ConnectorNamespaceRequest.JSON_PROPERTY_ANNOTATIONS,
  ConnectorNamespaceRequest.JSON_PROPERTY_CLUSTER_ID,
  ConnectorNamespaceRequest.JSON_PROPERTY_KIND
})
@JsonTypeName("ConnectorNamespaceRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespaceRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private Map<String, String> annotations = null;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_KIND = "kind";
  private ConnectorNamespaceTenantKind kind;

  public ConnectorNamespaceRequest() { 
  }

  public ConnectorNamespaceRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Namespace name must match pattern &#x60;^(([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9])?$&#x60;, or it may be empty to be auto-generated.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace name must match pattern `^(([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9])?$`, or it may be empty to be auto-generated.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorNamespaceRequest annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public ConnectorNamespaceRequest putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public ConnectorNamespaceRequest clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public ConnectorNamespaceRequest kind(ConnectorNamespaceTenantKind kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorNamespaceTenantKind getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKind(ConnectorNamespaceTenantKind kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespaceRequest connectorNamespaceRequest = (ConnectorNamespaceRequest) o;
    return Objects.equals(this.name, connectorNamespaceRequest.name) &&
        Objects.equals(this.annotations, connectorNamespaceRequest.annotations) &&
        Objects.equals(this.clusterId, connectorNamespaceRequest.clusterId) &&
        Objects.equals(this.kind, connectorNamespaceRequest.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, annotations, clusterId, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespaceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

