/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContractActionParameter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ContractAction
 */

public class ContractAction {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("provisioningStatus")
  private Integer provisioningStatus = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("parameters")
  private List<ContractActionParameter> parameters = null;

  @SerializedName("workflowFunctionId")
  private Integer workflowFunctionId = null;

  @SerializedName("transactionId")
  private Integer transactionId = null;

  public ContractAction id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContractAction userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public ContractAction provisioningStatus(Integer provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

   /**
   * Get provisioningStatus
   * @return provisioningStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getProvisioningStatus() {
    return provisioningStatus;
  }

  public void setProvisioningStatus(Integer provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
  }

  public ContractAction timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ContractAction parameters(List<ContractActionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ContractAction addParametersItem(ContractActionParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ContractActionParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public List<ContractActionParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ContractActionParameter> parameters) {
    this.parameters = parameters;
  }

  public ContractAction workflowFunctionId(Integer workflowFunctionId) {
    this.workflowFunctionId = workflowFunctionId;
    return this;
  }

   /**
   * Get workflowFunctionId
   * @return workflowFunctionId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkflowFunctionId() {
    return workflowFunctionId;
  }

  public void setWorkflowFunctionId(Integer workflowFunctionId) {
    this.workflowFunctionId = workflowFunctionId;
  }

  public ContractAction transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractAction contractAction = (ContractAction) o;
    return Objects.equals(this.id, contractAction.id) &&
        Objects.equals(this.userId, contractAction.userId) &&
        Objects.equals(this.provisioningStatus, contractAction.provisioningStatus) &&
        Objects.equals(this.timestamp, contractAction.timestamp) &&
        Objects.equals(this.parameters, contractAction.parameters) &&
        Objects.equals(this.workflowFunctionId, contractAction.workflowFunctionId) &&
        Objects.equals(this.transactionId, contractAction.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, provisioningStatus, timestamp, parameters, workflowFunctionId, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    workflowFunctionId: ").append(toIndentedString(workflowFunctionId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
