


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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
@ApiModel(description = "User")
public class User {
  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("userGroups")
  private List<String> userGroups = null;

  @SerializedName("userRoles")
  private List<String> userRoles = null;

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the User
   * @return username
  **/
  @ApiModelProperty(value = "Username of the User")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name of the User
   * @return firstName
  **/
  @ApiModelProperty(value = "First Name of the User")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name of the User
   * @return lastName
  **/
  @ApiModelProperty(value = "Last Name of the User")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the User
   * @return email
  **/
  @ApiModelProperty(value = "Email of the User")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User userGroups(List<String> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public User addUserGroupsItem(String userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<String>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }

  public User userRoles(List<String> userRoles) {
    this.userRoles = userRoles;
    return this;
  }

  public User addUserRolesItem(String userRolesItem) {
    if (this.userRoles == null) {
      this.userRoles = new ArrayList<String>();
    }
    this.userRoles.add(userRolesItem);
    return this;
  }

   /**
   * Get userRoles
   * @return userRoles
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<String> userRoles) {
    this.userRoles = userRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.userGroups, user.userGroups) &&
        Objects.equals(this.userRoles, user.userRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, email, userGroups, userRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    userRoles: ").append(toIndentedString(userRoles)).append("\n");
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

