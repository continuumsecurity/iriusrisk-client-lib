


package com.iriusrisk.restapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.iriusrisk.restapi.client.model.Implementation;
import com.iriusrisk.restapi.client.model.Reference;
import com.iriusrisk.restapi.client.model.Standard;
import com.iriusrisk.restapi.client.model.Test;
import com.iriusrisk.restapi.client.model.Udt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryControl
 */
public class LibraryControl {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("cost")
  private Integer cost = null;

  @SerializedName("risk")
  private Integer risk = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("mitigation")
  private Integer mitigation = null;

  @SerializedName("implementations")
  private List<Implementation> implementations = null;

  @SerializedName("references")
  private List<Reference> references = null;

  @SerializedName("standards")
  private List<Standard> standards = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  @SerializedName("test")
  private Test test = null;

  public LibraryControl ref(String ref) {
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

  public LibraryControl name(String name) {
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

  public LibraryControl desc(String desc) {
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

  public LibraryControl platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public LibraryControl cost(Integer cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public LibraryControl risk(Integer risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")
  public Integer getRisk() {
    return risk;
  }

  public void setRisk(Integer risk) {
    this.risk = risk;
  }

  public LibraryControl state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LibraryControl mitigation(Integer mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Get mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "")
  public Integer getMitigation() {
    return mitigation;
  }

  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }

  public LibraryControl implementations(List<Implementation> implementations) {
    this.implementations = implementations;
    return this;
  }

  public LibraryControl addImplementationsItem(Implementation implementationsItem) {
    if (this.implementations == null) {
      this.implementations = new ArrayList<Implementation>();
    }
    this.implementations.add(implementationsItem);
    return this;
  }

   /**
   * Get implementations
   * @return implementations
  **/
  @ApiModelProperty(value = "")
  public List<Implementation> getImplementations() {
    return implementations;
  }

  public void setImplementations(List<Implementation> implementations) {
    this.implementations = implementations;
  }

  public LibraryControl references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public LibraryControl addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<Reference>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @ApiModelProperty(value = "")
  public List<Reference> getReferences() {
    return references;
  }

  public void setReferences(List<Reference> references) {
    this.references = references;
  }

  public LibraryControl standards(List<Standard> standards) {
    this.standards = standards;
    return this;
  }

  public LibraryControl addStandardsItem(Standard standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<Standard>();
    }
    this.standards.add(standardsItem);
    return this;
  }

   /**
   * Get standards
   * @return standards
  **/
  @ApiModelProperty(value = "")
  public List<Standard> getStandards() {
    return standards;
  }

  public void setStandards(List<Standard> standards) {
    this.standards = standards;
  }

  public LibraryControl udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public LibraryControl addUdtsItem(Udt udtsItem) {
    if (this.udts == null) {
      this.udts = new ArrayList<Udt>();
    }
    this.udts.add(udtsItem);
    return this;
  }

   /**
   * Get udts
   * @return udts
  **/
  @ApiModelProperty(value = "")
  public List<Udt> getUdts() {
    return udts;
  }

  public void setUdts(List<Udt> udts) {
    this.udts = udts;
  }

  public LibraryControl test(Test test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public Test getTest() {
    return test;
  }

  public void setTest(Test test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryControl libraryControl = (LibraryControl) o;
    return Objects.equals(this.ref, libraryControl.ref) &&
        Objects.equals(this.name, libraryControl.name) &&
        Objects.equals(this.desc, libraryControl.desc) &&
        Objects.equals(this.platform, libraryControl.platform) &&
        Objects.equals(this.cost, libraryControl.cost) &&
        Objects.equals(this.risk, libraryControl.risk) &&
        Objects.equals(this.state, libraryControl.state) &&
        Objects.equals(this.mitigation, libraryControl.mitigation) &&
        Objects.equals(this.implementations, libraryControl.implementations) &&
        Objects.equals(this.references, libraryControl.references) &&
        Objects.equals(this.standards, libraryControl.standards) &&
        Objects.equals(this.udts, libraryControl.udts) &&
        Objects.equals(this.test, libraryControl.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, platform, cost, risk, state, mitigation, implementations, references, standards, udts, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryControl {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    implementations: ").append(toIndentedString(implementations)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
    sb.append("    udts: ").append(toIndentedString(udts)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

