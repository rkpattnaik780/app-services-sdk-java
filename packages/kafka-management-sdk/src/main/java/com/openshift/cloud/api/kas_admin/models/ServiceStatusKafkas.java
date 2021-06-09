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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Kakfa resource api status
 */
@ApiModel(description = "The Kakfa resource api status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-08T16:30:41.494320497-04:00[America/New_York]")
public class ServiceStatusKafkas {
  public static final String SERIALIZED_NAME_MAX_CAPACITY_REACHED = "max_capacity_reached";
  @SerializedName(SERIALIZED_NAME_MAX_CAPACITY_REACHED)
  private Boolean maxCapacityReached;


  public ServiceStatusKafkas maxCapacityReached(Boolean maxCapacityReached) {
    
    this.maxCapacityReached = maxCapacityReached;
    return this;
  }

   /**
   * Indicates whether we have reached Kakfa maximum capacity
   * @return maxCapacityReached
  **/
  @ApiModelProperty(required = true, value = "Indicates whether we have reached Kakfa maximum capacity")

  public Boolean getMaxCapacityReached() {
    return maxCapacityReached;
  }


  public void setMaxCapacityReached(Boolean maxCapacityReached) {
    this.maxCapacityReached = maxCapacityReached;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatusKafkas serviceStatusKafkas = (ServiceStatusKafkas) o;
    return Objects.equals(this.maxCapacityReached, serviceStatusKafkas.maxCapacityReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCapacityReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatusKafkas {\n");
    sb.append("    maxCapacityReached: ").append(toIndentedString(maxCapacityReached)).append("\n");
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
