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
import com.iriusrisk.api.client.model.ComponentDefinitionRiskPatterns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Component Definition
 */
@ApiModel(description = "Component Definition")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")



public class ComponentDefinition {
  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("categoryRef")
  private String categoryRef = null;

  @JsonProperty("riskPatterns")
  private List<ComponentDefinitionRiskPatterns> riskPatterns = null;

  public ComponentDefinition ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Unique identifier of the Component Definition
   * @return ref
  **/
  @ApiModelProperty(value = "Unique identifier of the Component Definition")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ComponentDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Component Definition
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Component Definition")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentDefinition desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description of the Component Definition
   * @return desc
  **/
  @ApiModelProperty(value = "Description of the Component Definition")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ComponentDefinition categoryRef(String categoryRef) {
    this.categoryRef = categoryRef;
    return this;
  }

   /**
   * Reference of the category of the component
   * @return categoryRef
  **/
  @ApiModelProperty(value = "Reference of the category of the component")
  public String getCategoryRef() {
    return categoryRef;
  }

  public void setCategoryRef(String categoryRef) {
    this.categoryRef = categoryRef;
  }

  public ComponentDefinition riskPatterns(List<ComponentDefinitionRiskPatterns> riskPatterns) {
    this.riskPatterns = riskPatterns;
    return this;
  }

  public ComponentDefinition addRiskPatternsItem(ComponentDefinitionRiskPatterns riskPatternsItem) {
    if (this.riskPatterns == null) {
      this.riskPatterns = new ArrayList<ComponentDefinitionRiskPatterns>();
    }
    this.riskPatterns.add(riskPatternsItem);
    return this;
  }

   /**
   * Get riskPatterns
   * @return riskPatterns
  **/
  @ApiModelProperty(value = "")
  public List<ComponentDefinitionRiskPatterns> getRiskPatterns() {
    return riskPatterns;
  }

  public void setRiskPatterns(List<ComponentDefinitionRiskPatterns> riskPatterns) {
    this.riskPatterns = riskPatterns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDefinition componentDefinition = (ComponentDefinition) o;
    return Objects.equals(this.ref, componentDefinition.ref) &&
        Objects.equals(this.name, componentDefinition.name) &&
        Objects.equals(this.desc, componentDefinition.desc) &&
        Objects.equals(this.categoryRef, componentDefinition.categoryRef) &&
        Objects.equals(this.riskPatterns, componentDefinition.riskPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, categoryRef, riskPatterns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDefinition {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    categoryRef: ").append(toIndentedString(categoryRef)).append("\n");
    sb.append("    riskPatterns: ").append(toIndentedString(riskPatterns)).append("\n");
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
