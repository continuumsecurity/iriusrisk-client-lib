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
import com.iriusrisk.api.client.model.Threat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ComponentUseCase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")



public class ComponentUseCase {
  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("threats")
  private List<Threat> threats = null;

  public ComponentUseCase ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ComponentUseCase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentUseCase desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ComponentUseCase threats(List<Threat> threats) {
    this.threats = threats;
    return this;
  }

  public ComponentUseCase addThreatsItem(Threat threatsItem) {
    if (this.threats == null) {
      this.threats = new ArrayList<Threat>();
    }
    this.threats.add(threatsItem);
    return this;
  }

   /**
   * Get threats
   * @return threats
  **/
  @ApiModelProperty(value = "")
  public List<Threat> getThreats() {
    return threats;
  }

  public void setThreats(List<Threat> threats) {
    this.threats = threats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentUseCase componentUseCase = (ComponentUseCase) o;
    return Objects.equals(this.ref, componentUseCase.ref) &&
        Objects.equals(this.name, componentUseCase.name) &&
        Objects.equals(this.desc, componentUseCase.desc) &&
        Objects.equals(this.threats, componentUseCase.threats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, threats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentUseCase {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
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
