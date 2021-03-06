package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LoginAccount
 */

public class LoginAccount {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountIdGuid")
  private String accountIdGuid = null;

  @JsonProperty("baseUrl")
  private String baseUrl = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("loginAccountSettings")
  private java.util.List<NameValue> loginAccountSettings = null;

  @JsonProperty("loginUserSettings")
  private java.util.List<NameValue> loginUserSettings = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("siteDescription")
  private String siteDescription = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  public LoginAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public LoginAccount accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }

   /**
   * The GUID associated with the account ID.
   * @return accountIdGuid
  **/
  @ApiModelProperty(value = "The GUID associated with the account ID.")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }

  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  public LoginAccount baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
   * @return baseUrl
  **/
  @ApiModelProperty(value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public LoginAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address for the user.
   * @return email
  **/
  @ApiModelProperty(value = "The email address for the user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginAccount isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * This value is true if this is the default account for the user, otherwise false is returned.
   * @return isDefault
  **/
  @ApiModelProperty(value = "This value is true if this is the default account for the user, otherwise false is returned.")
  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  public LoginAccount loginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
    return this;
  }

  public LoginAccount addLoginAccountSettingsItem(NameValue loginAccountSettingsItem) {
    if (this.loginAccountSettings == null) {
      this.loginAccountSettings = new java.util.ArrayList<NameValue>();
    }
    this.loginAccountSettings.add(loginAccountSettingsItem);
    return this;
  }

   /**
   * A list of settings on the acccount that indicate what features are available.
   * @return loginAccountSettings
  **/
  @ApiModelProperty(value = "A list of settings on the acccount that indicate what features are available.")
  public java.util.List<NameValue> getLoginAccountSettings() {
    return loginAccountSettings;
  }

  public void setLoginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
    this.loginAccountSettings = loginAccountSettings;
  }

  public LoginAccount loginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
    return this;
  }

  public LoginAccount addLoginUserSettingsItem(NameValue loginUserSettingsItem) {
    if (this.loginUserSettings == null) {
      this.loginUserSettings = new java.util.ArrayList<NameValue>();
    }
    this.loginUserSettings.add(loginUserSettingsItem);
    return this;
  }

   /**
   * A list of user-level settings that indicate what user-specific features are available.
   * @return loginUserSettings
  **/
  @ApiModelProperty(value = "A list of user-level settings that indicate what user-specific features are available.")
  public java.util.List<NameValue> getLoginUserSettings() {
    return loginUserSettings;
  }

  public void setLoginUserSettings(java.util.List<NameValue> loginUserSettings) {
    this.loginUserSettings = loginUserSettings;
  }

  public LoginAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name associated with the account.
   * @return name
  **/
  @ApiModelProperty(value = "The name associated with the account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoginAccount siteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
    return this;
  }

   /**
   * An optional descirption of the site that hosts the account.
   * @return siteDescription
  **/
  @ApiModelProperty(value = "An optional descirption of the site that hosts the account.")
  public String getSiteDescription() {
    return siteDescription;
  }

  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }

  public LoginAccount userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public LoginAccount userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The name of this user as defined by the account.
   * @return userName
  **/
  @ApiModelProperty(value = "The name of this user as defined by the account.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccount loginAccount = (LoginAccount) o;
    return Objects.equals(this.accountId, loginAccount.accountId) &&
        Objects.equals(this.accountIdGuid, loginAccount.accountIdGuid) &&
        Objects.equals(this.baseUrl, loginAccount.baseUrl) &&
        Objects.equals(this.email, loginAccount.email) &&
        Objects.equals(this.isDefault, loginAccount.isDefault) &&
        Objects.equals(this.loginAccountSettings, loginAccount.loginAccountSettings) &&
        Objects.equals(this.loginUserSettings, loginAccount.loginUserSettings) &&
        Objects.equals(this.name, loginAccount.name) &&
        Objects.equals(this.siteDescription, loginAccount.siteDescription) &&
        Objects.equals(this.userId, loginAccount.userId) &&
        Objects.equals(this.userName, loginAccount.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdGuid, baseUrl, email, isDefault, loginAccountSettings, loginUserSettings, name, siteDescription, userId, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccount {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    loginAccountSettings: ").append(toIndentedString(loginAccountSettings)).append("\n");
    sb.append("    loginUserSettings: ").append(toIndentedString(loginUserSettings)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

