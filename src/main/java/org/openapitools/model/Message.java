package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MessageFrom;
import org.openapitools.model.MessageProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Message
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-12T10:17:15.320226972+02:00[Europe/Amsterdam]")
public class Message {

  private MessageFrom from;

  private MessageFrom to;

  private String content;

  private MessageProperty property;

  public Message from(MessageFrom from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @Valid 
  @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public MessageFrom getFrom() {
    return from;
  }

  public void setFrom(MessageFrom from) {
    this.from = from;
  }

  public Message to(MessageFrom to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @Valid 
  @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public MessageFrom getTo() {
    return to;
  }

  public void setTo(MessageFrom to) {
    this.to = to;
  }

  public Message content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message property(MessageProperty property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  @Valid 
  @Schema(name = "property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public MessageProperty getProperty() {
    return property;
  }

  public void setProperty(MessageProperty property) {
    this.property = property;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.from, message.from) &&
        Objects.equals(this.to, message.to) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.property, message.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, content, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

