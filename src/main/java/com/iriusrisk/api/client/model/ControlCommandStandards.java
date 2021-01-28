/*
 * IriusRisk API
 * Products API
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iriusrisk.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ControlCommandStandards
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")



public class ControlCommandStandards {
  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("supportedStandardRef")
  private String supportedStandardRef = null;

  public ControlCommandStandards ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Reference of the Standard
   * @return ref
  **/
  @ApiModelProperty(value = "Reference of the Standard")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ControlCommandStandards name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Supported Standard
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Supported Standard")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControlCommandStandards supportedStandardRef(String supportedStandardRef) {
    this.supportedStandardRef = supportedStandardRef;
    return this;
  }

   /**
   * Reference of the Supported Standard
   * @return supportedStandardRef
  **/
  @ApiModelProperty(value = "Reference of the Supported Standard")
  public String getSupportedStandardRef() {
    return supportedStandardRef;
  }

  public void setSupportedStandardRef(String supportedStandardRef) {
    this.supportedStandardRef = supportedStandardRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlCommandStandards controlCommandStandards = (ControlCommandStandards) o;
    return Objects.equals(this.ref, controlCommandStandards.ref) &&
        Objects.equals(this.name, controlCommandStandards.name) &&
        Objects.equals(this.supportedStandardRef, controlCommandStandards.supportedStandardRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, supportedStandardRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlCommandStandards {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedStandardRef: ").append(toIndentedString(supportedStandardRef)).append("\n");
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
