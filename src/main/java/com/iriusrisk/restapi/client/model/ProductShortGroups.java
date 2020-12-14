


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
import com.iriusrisk.restapi.client.model.Udt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductShortGroups
 */
public class ProductShortGroups {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revision")
  private Integer revision = 1;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("priority")
  private Integer priority = 0;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("workflowState")
  private String workflowState = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  @SerializedName("groups")
  private List<String> groups = null;

  public ProductShortGroups ref(String ref) {
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

  public ProductShortGroups name(String name) {
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

  public ProductShortGroups revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public ProductShortGroups type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductShortGroups status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProductShortGroups priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProductShortGroups tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public ProductShortGroups workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Get workflowState
   * @return workflowState
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowState() {
    return workflowState;
  }

  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }

  public ProductShortGroups udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public ProductShortGroups addUdtsItem(Udt udtsItem) {
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

  public ProductShortGroups groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ProductShortGroups addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductShortGroups productShortGroups = (ProductShortGroups) o;
    return Objects.equals(this.ref, productShortGroups.ref) &&
        Objects.equals(this.name, productShortGroups.name) &&
        Objects.equals(this.revision, productShortGroups.revision) &&
        Objects.equals(this.type, productShortGroups.type) &&
        Objects.equals(this.status, productShortGroups.status) &&
        Objects.equals(this.priority, productShortGroups.priority) &&
        Objects.equals(this.tags, productShortGroups.tags) &&
        Objects.equals(this.workflowState, productShortGroups.workflowState) &&
        Objects.equals(this.udts, productShortGroups.udts) &&
        Objects.equals(this.groups, productShortGroups.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, revision, type, status, priority, tags, workflowState, udts, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductShortGroups {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    udts: ").append(toIndentedString(udts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

