


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
 * CreateUserRequestBody
 */
public class CreateUserRequestBody {
  @SerializedName("username")
  private String username = null;

  /**
   * Authentication type
   */
  @JsonAdapter(AuthEnum.Adapter.class)
  public enum AuthEnum {
    LDAP("ldap"),
    
    SAML("saml");

    private String value;

    AuthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthEnum fromValue(String text) {
      for (AuthEnum b : AuthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("auth")
  private AuthEnum auth = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("roleGroups")
  private List<String> roleGroups = new ArrayList<String>();

  public CreateUserRequestBody username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the user
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username of the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateUserRequestBody auth(AuthEnum auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Authentication type
   * @return auth
  **/
  @ApiModelProperty(required = true, value = "Authentication type")
  public AuthEnum getAuth() {
    return auth;
  }

  public void setAuth(AuthEnum auth) {
    this.auth = auth;
  }

  public CreateUserRequestBody email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the user
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserRequestBody firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateUserRequestBody lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateUserRequestBody roleGroups(List<String> roleGroups) {
    this.roleGroups = roleGroups;
    return this;
  }

  public CreateUserRequestBody addRoleGroupsItem(String roleGroupsItem) {
    this.roleGroups.add(roleGroupsItem);
    return this;
  }

   /**
   * List of roles&#39; refs to assign to the user. Can be an empty list.
   * @return roleGroups
  **/
  @ApiModelProperty(required = true, value = "List of roles' refs to assign to the user. Can be an empty list.")
  public List<String> getRoleGroups() {
    return roleGroups;
  }

  public void setRoleGroups(List<String> roleGroups) {
    this.roleGroups = roleGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequestBody createUserRequestBody = (CreateUserRequestBody) o;
    return Objects.equals(this.username, createUserRequestBody.username) &&
        Objects.equals(this.auth, createUserRequestBody.auth) &&
        Objects.equals(this.email, createUserRequestBody.email) &&
        Objects.equals(this.firstName, createUserRequestBody.firstName) &&
        Objects.equals(this.lastName, createUserRequestBody.lastName) &&
        Objects.equals(this.roleGroups, createUserRequestBody.roleGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, auth, email, firstName, lastName, roleGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequestBody {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roleGroups: ").append(toIndentedString(roleGroups)).append("\n");
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

