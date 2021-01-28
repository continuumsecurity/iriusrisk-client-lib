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
import com.iriusrisk.api.client.model.RiskCount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RiskSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")



public class RiskSummary {
  @JsonProperty("riskCount")
  private RiskCount riskCount = null;

  @JsonProperty("inherentRisk")
  private Integer inherentRisk = null;

  @JsonProperty("projectedRisk")
  private Integer projectedRisk = null;

  @JsonProperty("residualRisk")
  private Integer residualRisk = null;

  public RiskSummary riskCount(RiskCount riskCount) {
    this.riskCount = riskCount;
    return this;
  }

   /**
   * Get riskCount
   * @return riskCount
  **/
  @ApiModelProperty(value = "")
  public RiskCount getRiskCount() {
    return riskCount;
  }

  public void setRiskCount(RiskCount riskCount) {
    this.riskCount = riskCount;
  }

  public RiskSummary inherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
    return this;
  }

   /**
   * Get inherentRisk
   * @return inherentRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getInherentRisk() {
    return inherentRisk;
  }

  public void setInherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
  }

  public RiskSummary projectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
    return this;
  }

   /**
   * Get projectedRisk
   * @return projectedRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectedRisk() {
    return projectedRisk;
  }

  public void setProjectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
  }

  public RiskSummary residualRisk(Integer residualRisk) {
    this.residualRisk = residualRisk;
    return this;
  }

   /**
   * Get residualRisk
   * @return residualRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getResidualRisk() {
    return residualRisk;
  }

  public void setResidualRisk(Integer residualRisk) {
    this.residualRisk = residualRisk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskSummary riskSummary = (RiskSummary) o;
    return Objects.equals(this.riskCount, riskSummary.riskCount) &&
        Objects.equals(this.inherentRisk, riskSummary.inherentRisk) &&
        Objects.equals(this.projectedRisk, riskSummary.projectedRisk) &&
        Objects.equals(this.residualRisk, riskSummary.residualRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCount, inherentRisk, projectedRisk, residualRisk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskSummary {\n");
    
    sb.append("    riskCount: ").append(toIndentedString(riskCount)).append("\n");
    sb.append("    inherentRisk: ").append(toIndentedString(inherentRisk)).append("\n");
    sb.append("    projectedRisk: ").append(toIndentedString(projectedRisk)).append("\n");
    sb.append("    residualRisk: ").append(toIndentedString(residualRisk)).append("\n");
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
