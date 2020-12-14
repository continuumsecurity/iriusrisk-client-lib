


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
import com.iriusrisk.restapi.client.model.ComponentAsset;
import com.iriusrisk.restapi.client.model.ComponentControl;
import com.iriusrisk.restapi.client.model.ComponentTrustZone;
import com.iriusrisk.restapi.client.model.ComponentUseCase;
import com.iriusrisk.restapi.client.model.ComponentWeakness;
import com.iriusrisk.restapi.client.model.Question;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Component
 */
public class Component {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("questions")
  private List<Question> questions = null;

  @SerializedName("trustZones")
  private List<ComponentTrustZone> trustZones = null;

  @SerializedName("assets")
  private List<ComponentAsset> assets = null;

  @SerializedName("weaknesses")
  private List<ComponentWeakness> weaknesses = null;

  @SerializedName("controls")
  private List<ComponentControl> controls = null;

  @SerializedName("usecases")
  private List<ComponentUseCase> usecases = null;

  public Component ref(String ref) {
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

  public Component name(String name) {
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

  public Component desc(String desc) {
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

  public Component groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * This field always returns null. All group names have been transformed into tags.
   * @return groupName
  **/
  @ApiModelProperty(value = "This field always returns null. All group names have been transformed into tags.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Component tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Component addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of all tags
   * @return tags
  **/
  @ApiModelProperty(value = "List of all tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Component position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Component questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public Component addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public Component trustZones(List<ComponentTrustZone> trustZones) {
    this.trustZones = trustZones;
    return this;
  }

  public Component addTrustZonesItem(ComponentTrustZone trustZonesItem) {
    if (this.trustZones == null) {
      this.trustZones = new ArrayList<ComponentTrustZone>();
    }
    this.trustZones.add(trustZonesItem);
    return this;
  }

   /**
   * Get trustZones
   * @return trustZones
  **/
  @ApiModelProperty(value = "")
  public List<ComponentTrustZone> getTrustZones() {
    return trustZones;
  }

  public void setTrustZones(List<ComponentTrustZone> trustZones) {
    this.trustZones = trustZones;
  }

  public Component assets(List<ComponentAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Component addAssetsItem(ComponentAsset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<ComponentAsset>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(value = "")
  public List<ComponentAsset> getAssets() {
    return assets;
  }

  public void setAssets(List<ComponentAsset> assets) {
    this.assets = assets;
  }

  public Component weaknesses(List<ComponentWeakness> weaknesses) {
    this.weaknesses = weaknesses;
    return this;
  }

  public Component addWeaknessesItem(ComponentWeakness weaknessesItem) {
    if (this.weaknesses == null) {
      this.weaknesses = new ArrayList<ComponentWeakness>();
    }
    this.weaknesses.add(weaknessesItem);
    return this;
  }

   /**
   * Get weaknesses
   * @return weaknesses
  **/
  @ApiModelProperty(value = "")
  public List<ComponentWeakness> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(List<ComponentWeakness> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public Component controls(List<ComponentControl> controls) {
    this.controls = controls;
    return this;
  }

  public Component addControlsItem(ComponentControl controlsItem) {
    if (this.controls == null) {
      this.controls = new ArrayList<ComponentControl>();
    }
    this.controls.add(controlsItem);
    return this;
  }

   /**
   * Get controls
   * @return controls
  **/
  @ApiModelProperty(value = "")
  public List<ComponentControl> getControls() {
    return controls;
  }

  public void setControls(List<ComponentControl> controls) {
    this.controls = controls;
  }

  public Component usecases(List<ComponentUseCase> usecases) {
    this.usecases = usecases;
    return this;
  }

  public Component addUsecasesItem(ComponentUseCase usecasesItem) {
    if (this.usecases == null) {
      this.usecases = new ArrayList<ComponentUseCase>();
    }
    this.usecases.add(usecasesItem);
    return this;
  }

   /**
   * Get usecases
   * @return usecases
  **/
  @ApiModelProperty(value = "")
  public List<ComponentUseCase> getUsecases() {
    return usecases;
  }

  public void setUsecases(List<ComponentUseCase> usecases) {
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
    Component component = (Component) o;
    return Objects.equals(this.ref, component.ref) &&
        Objects.equals(this.name, component.name) &&
        Objects.equals(this.desc, component.desc) &&
        Objects.equals(this.groupName, component.groupName) &&
        Objects.equals(this.tags, component.tags) &&
        Objects.equals(this.position, component.position) &&
        Objects.equals(this.questions, component.questions) &&
        Objects.equals(this.trustZones, component.trustZones) &&
        Objects.equals(this.assets, component.assets) &&
        Objects.equals(this.weaknesses, component.weaknesses) &&
        Objects.equals(this.controls, component.controls) &&
        Objects.equals(this.usecases, component.usecases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, groupName, tags, position, questions, trustZones, assets, weaknesses, controls, usecases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Component {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    trustZones: ").append(toIndentedString(trustZones)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    weaknesses: ").append(toIndentedString(weaknesses)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
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

