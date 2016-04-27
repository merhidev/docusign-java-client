package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SamlAssertionAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-27T11:06:30.816-07:00")
public class RecipientSAMLAuthentication   {
  
  private java.util.List<SamlAssertionAttribute> samlAssertionAttributes = new java.util.ArrayList<SamlAssertionAttribute>();

  
  /**
   * 
   **/
  public RecipientSAMLAuthentication samlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("samlAssertionAttributes")
  public java.util.List<SamlAssertionAttribute> getSamlAssertionAttributes() {
    return samlAssertionAttributes;
  }
  public void setSamlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSAMLAuthentication recipientSAMLAuthentication = (RecipientSAMLAuthentication) o;
    return Objects.equals(this.samlAssertionAttributes, recipientSAMLAuthentication.samlAssertionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlAssertionAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSAMLAuthentication {\n");
    
    sb.append("    samlAssertionAttributes: ").append(toIndentedString(samlAssertionAttributes)).append("\n");
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
