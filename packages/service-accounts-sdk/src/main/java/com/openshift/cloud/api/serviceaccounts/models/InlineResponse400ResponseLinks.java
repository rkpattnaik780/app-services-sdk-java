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
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InlineResponse400ResponseLinks
 */
@JsonPropertyOrder({
  InlineResponse400ResponseLinks.JSON_PROPERTY_URI_BUILDER,
  InlineResponse400ResponseLinks.JSON_PROPERTY_PARAMS,
  InlineResponse400ResponseLinks.JSON_PROPERTY_TITLE,
  InlineResponse400ResponseLinks.JSON_PROPERTY_URI,
  InlineResponse400ResponseLinks.JSON_PROPERTY_REL,
  InlineResponse400ResponseLinks.JSON_PROPERTY_RELS,
  InlineResponse400ResponseLinks.JSON_PROPERTY_TYPE
})
@JsonTypeName("inline_response_400_response_links")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse400ResponseLinks {
  public static final String JSON_PROPERTY_URI_BUILDER = "uriBuilder";
  private Object uriBuilder;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private Map<String, String> params = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URI = "uri";
  private URI uri;

  public static final String JSON_PROPERTY_REL = "rel";
  private String rel;

  public static final String JSON_PROPERTY_RELS = "rels";
  private List<String> rels = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public InlineResponse400ResponseLinks() { 
  }

  public InlineResponse400ResponseLinks uriBuilder(Object uriBuilder) {
    
    this.uriBuilder = uriBuilder;
    return this;
  }

   /**
   * Get uriBuilder
   * @return uriBuilder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getUriBuilder() {
    return uriBuilder;
  }


  @JsonProperty(JSON_PROPERTY_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriBuilder(Object uriBuilder) {
    this.uriBuilder = uriBuilder;
  }


  public InlineResponse400ResponseLinks params(Map<String, String> params) {
    
    this.params = params;
    return this;
  }

  public InlineResponse400ResponseLinks putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParams(Map<String, String> params) {
    this.params = params;
  }


  public InlineResponse400ResponseLinks title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public InlineResponse400ResponseLinks uri(URI uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(URI uri) {
    this.uri = uri;
  }


  public InlineResponse400ResponseLinks rel(String rel) {
    
    this.rel = rel;
    return this;
  }

   /**
   * Get rel
   * @return rel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRel() {
    return rel;
  }


  @JsonProperty(JSON_PROPERTY_REL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRel(String rel) {
    this.rel = rel;
  }


  public InlineResponse400ResponseLinks rels(List<String> rels) {
    
    this.rels = rels;
    return this;
  }

  public InlineResponse400ResponseLinks addRelsItem(String relsItem) {
    if (this.rels == null) {
      this.rels = new ArrayList<>();
    }
    this.rels.add(relsItem);
    return this;
  }

   /**
   * Get rels
   * @return rels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRels() {
    return rels;
  }


  @JsonProperty(JSON_PROPERTY_RELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRels(List<String> rels) {
    this.rels = rels;
  }


  public InlineResponse400ResponseLinks type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400ResponseLinks inlineResponse400ResponseLinks = (InlineResponse400ResponseLinks) o;
    return Objects.equals(this.uriBuilder, inlineResponse400ResponseLinks.uriBuilder) &&
        Objects.equals(this.params, inlineResponse400ResponseLinks.params) &&
        Objects.equals(this.title, inlineResponse400ResponseLinks.title) &&
        Objects.equals(this.uri, inlineResponse400ResponseLinks.uri) &&
        Objects.equals(this.rel, inlineResponse400ResponseLinks.rel) &&
        Objects.equals(this.rels, inlineResponse400ResponseLinks.rels) &&
        Objects.equals(this.type, inlineResponse400ResponseLinks.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriBuilder, params, title, uri, rel, rels, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400ResponseLinks {\n");
    sb.append("    uriBuilder: ").append(toIndentedString(uriBuilder)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    rels: ").append(toIndentedString(rels)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

