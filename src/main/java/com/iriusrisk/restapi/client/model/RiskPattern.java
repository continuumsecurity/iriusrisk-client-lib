


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
import com.iriusrisk.restapi.client.model.LibraryControl;
import com.iriusrisk.restapi.client.model.LibraryUseCase;
import com.iriusrisk.restapi.client.model.LibraryWeakness;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RiskPattern
 */
public class RiskPattern {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("weaknesses")
  private List<LibraryWeakness> weaknesses = null;

  @SerializedName("countermeasures")
  private List<LibraryControl> countermeasures = null;

  @SerializedName("usecases")
  private List<LibraryUseCase> usecases = null;

  public RiskPattern ref(String ref) {
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

  public RiskPattern name(String name) {
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

  public RiskPattern desc(String desc) {
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

  public RiskPattern tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RiskPattern addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags
   * @return tags
  **/
  @ApiModelProperty(value = "List of tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RiskPattern weaknesses(List<LibraryWeakness> weaknesses) {
    this.weaknesses = weaknesses;
    return this;
  }

  public RiskPattern addWeaknessesItem(LibraryWeakness weaknessesItem) {
    if (this.weaknesses == null) {
      this.weaknesses = new ArrayList<LibraryWeakness>();
    }
    this.weaknesses.add(weaknessesItem);
    return this;
  }

   /**
   * Get weaknesses
   * @return weaknesses
  **/
  @ApiModelProperty(value = "")
  public List<LibraryWeakness> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(List<LibraryWeakness> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public RiskPattern countermeasures(List<LibraryControl> countermeasures) {
    this.countermeasures = countermeasures;
    return this;
  }

  public RiskPattern addCountermeasuresItem(LibraryControl countermeasuresItem) {
    if (this.countermeasures == null) {
      this.countermeasures = new ArrayList<LibraryControl>();
    }
    this.countermeasures.add(countermeasuresItem);
    return this;
  }

   /**
   * Get countermeasures
   * @return countermeasures
  **/
  @ApiModelProperty(value = "")
  public List<LibraryControl> getCountermeasures() {
    return countermeasures;
  }

  public void setCountermeasures(List<LibraryControl> countermeasures) {
    this.countermeasures = countermeasures;
  }

  public RiskPattern usecases(List<LibraryUseCase> usecases) {
    this.usecases = usecases;
    return this;
  }

  public RiskPattern addUsecasesItem(LibraryUseCase usecasesItem) {
    if (this.usecases == null) {
      this.usecases = new ArrayList<LibraryUseCase>();
    }
    this.usecases.add(usecasesItem);
    return this;
  }

   /**
   * Get usecases
   * @return usecases
  **/
  @ApiModelProperty(value = "")
  public List<LibraryUseCase> getUsecases() {
    return usecases;
  }

  public void setUsecases(List<LibraryUseCase> usecases) {
    this.usecases = usecases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskPattern riskPattern = (RiskPattern) o;
    return Objects.equals(this.ref, riskPattern.ref) &&
        Objects.equals(this.name, riskPattern.name) &&
        Objects.equals(this.desc, riskPattern.desc) &&
        Objects.equals(this.tags, riskPattern.tags) &&
        Objects.equals(this.weaknesses, riskPattern.weaknesses) &&
        Objects.equals(this.countermeasures, riskPattern.countermeasures) &&
        Objects.equals(this.usecases, riskPattern.usecases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, tags, weaknesses, countermeasures, usecases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskPattern {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    weaknesses: ").append(toIndentedString(weaknesses)).append("\n");
    sb.append("    countermeasures: ").append(toIndentedString(countermeasures)).append("\n");
    sb.append("    usecases: ").append(toIndentedString(usecases)).append("\n");
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
