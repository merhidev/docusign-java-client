package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ReportInProductListItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReportInProductList
 */

public class ReportInProductList {
  @JsonProperty("reports")
  private java.util.List<ReportInProductListItem> reports = null;

  public ReportInProductList reports(java.util.List<ReportInProductListItem> reports) {
    this.reports = reports;
    return this;
  }

  public ReportInProductList addReportsItem(ReportInProductListItem reportsItem) {
    if (this.reports == null) {
      this.reports = new java.util.ArrayList<ReportInProductListItem>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * 
   * @return reports
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ReportInProductListItem> getReports() {
    return reports;
  }

  public void setReports(java.util.List<ReportInProductListItem> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInProductList reportInProductList = (ReportInProductList) o;
    return Objects.equals(this.reports, reportInProductList.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductList {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

