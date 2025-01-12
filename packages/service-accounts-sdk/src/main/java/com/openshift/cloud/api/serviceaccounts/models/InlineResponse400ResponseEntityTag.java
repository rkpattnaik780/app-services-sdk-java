/*
 * Service Accounts API Documentation
 * This is the API documentation for Service Accounts
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.serviceaccounts.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InlineResponse400ResponseEntityTag
 */
@JsonPropertyOrder({
  InlineResponse400ResponseEntityTag.JSON_PROPERTY_VALUE,
  InlineResponse400ResponseEntityTag.JSON_PROPERTY_WEAK
})
@JsonTypeName("inline_response_400_response_entityTag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse400ResponseEntityTag {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_WEAK = "weak";
  private Boolean weak;

  public InlineResponse400ResponseEntityTag() { 
  }

  public InlineResponse400ResponseEntityTag value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public InlineResponse400ResponseEntityTag weak(Boolean weak) {
    
    this.weak = weak;
    return this;
  }

   /**
   * Get weak
   * @return weak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWeak() {
    return weak;
  }


  @JsonProperty(JSON_PROPERTY_WEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeak(Boolean weak) {
    this.weak = weak;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400ResponseEntityTag inlineResponse400ResponseEntityTag = (InlineResponse400ResponseEntityTag) o;
    return Objects.equals(this.value, inlineResponse400ResponseEntityTag.value) &&
        Objects.equals(this.weak, inlineResponse400ResponseEntityTag.weak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, weak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400ResponseEntityTag {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    weak: ").append(toIndentedString(weak)).append("\n");
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

