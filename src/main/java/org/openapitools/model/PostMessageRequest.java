package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostMessageRequest
 */

@JsonTypeName("postMessage_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-12T10:17:15.320226972+02:00[Europe/Amsterdam]")
public class PostMessageRequest {

  private Long recvId;

  private String propId;

  private String message;

  public PostMessageRequest recvId(Long recvId) {
    this.recvId = recvId;
    return this;
  }

  /**
   * Get recvId
   * @return recvId
  */
  
  @Schema(name = "recv_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recv_id")
  public Long getRecvId() {
    return recvId;
  }

  public void setRecvId(Long recvId) {
    this.recvId = recvId;
  }

  public PostMessageRequest propId(String propId) {
    this.propId = propId;
    return this;
  }

  /**
   * Get propId
   * @return propId
  */
  
  @Schema(name = "prop_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prop_id")
  public String getPropId() {
    return propId;
  }

  public void setPropId(String propId) {
    this.propId = propId;
  }

  public PostMessageRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessageRequest postMessageRequest = (PostMessageRequest) o;
    return Objects.equals(this.recvId, postMessageRequest.recvId) &&
        Objects.equals(this.propId, postMessageRequest.propId) &&
        Objects.equals(this.message, postMessageRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recvId, propId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessageRequest {\n");
    sb.append("    recvId: ").append(toIndentedString(recvId)).append("\n");
    sb.append("    propId: ").append(toIndentedString(propId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

