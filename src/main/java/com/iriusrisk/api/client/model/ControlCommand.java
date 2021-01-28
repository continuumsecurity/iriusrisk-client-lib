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
import com.iriusrisk.api.client.model.ControlCommandStandards;
import com.iriusrisk.api.client.model.TestCommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ControlCommand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")



public class ControlCommand {
  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("mitigation")
  private Integer mitigation = null;

  @JsonProperty("test")
  private TestCommand test = null;

  /**
   * Countermeasure state
   */
  public enum StateEnum {
    NOT_APPLICABLE("not-applicable"),
    
    REJECTED("rejected"),
    
    RECOMMENDED("recommended"),
    
    REQUIRED("required"),
    
    IMPLEMENTED("implemented");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  /**
   * Countermeasure cost
   */
  public enum CostRatingEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    CostRatingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CostRatingEnum fromValue(String text) {
      for (CostRatingEnum b : CostRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("costRating")
  private CostRatingEnum costRating = null;

  @JsonProperty("standards")
  private List<ControlCommandStandards> standards = null;

  public ControlCommand ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Reference field value
   * @return ref
  **/
  @ApiModelProperty(value = "Reference field value")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ControlCommand name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name field value
   * @return name
  **/
  @ApiModelProperty(value = "Name field value")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControlCommand desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description field value
   * @return desc
  **/
  @ApiModelProperty(value = "Description field value")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ControlCommand mitigation(Integer mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "Mitigation")
  public Integer getMitigation() {
    return mitigation;
  }

  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }

  public ControlCommand test(TestCommand test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public TestCommand getTest() {
    return test;
  }

  public void setTest(TestCommand test) {
    this.test = test;
  }

  public ControlCommand state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Countermeasure state
   * @return state
  **/
  @ApiModelProperty(value = "Countermeasure state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ControlCommand costRating(CostRatingEnum costRating) {
    this.costRating = costRating;
    return this;
  }

   /**
   * Countermeasure cost
   * @return costRating
  **/
  @ApiModelProperty(value = "Countermeasure cost")
  public CostRatingEnum getCostRating() {
    return costRating;
  }

  public void setCostRating(CostRatingEnum costRating) {
    this.costRating = costRating;
  }

  public ControlCommand standards(List<ControlCommandStandards> standards) {
    this.standards = standards;
    return this;
  }

  public ControlCommand addStandardsItem(ControlCommandStandards standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<ControlCommandStandards>();
    }
    this.standards.add(standardsItem);
    return this;
  }

   /**
   * List of standards
   * @return standards
  **/
  @ApiModelProperty(value = "List of standards")
  public List<ControlCommandStandards> getStandards() {
    return standards;
  }

  public void setStandards(List<ControlCommandStandards> standards) {
    this.standards = standards;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlCommand controlCommand = (ControlCommand) o;
    return Objects.equals(this.ref, controlCommand.ref) &&
        Objects.equals(this.name, controlCommand.name) &&
        Objects.equals(this.desc, controlCommand.desc) &&
        Objects.equals(this.mitigation, controlCommand.mitigation) &&
        Objects.equals(this.test, controlCommand.test) &&
        Objects.equals(this.state, controlCommand.state) &&
        Objects.equals(this.costRating, controlCommand.costRating) &&
        Objects.equals(this.standards, controlCommand.standards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, mitigation, test, state, costRating, standards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlCommand {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    costRating: ").append(toIndentedString(costRating)).append("\n");
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
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
