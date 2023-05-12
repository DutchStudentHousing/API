package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Property
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-12T10:17:15.320226972+02:00[Europe/Amsterdam]")
public class Property {

  private String id;

  private String name;

  private String city;

  private Float lat;

  private Float _long;

  private String img;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime datePublished;

  private Float rent;

  private Boolean rentIncl;

  private Integer sqm;

  private String postalCode;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ROOM("Room"),
    
    APARTMENT("Apartment"),
    
    STUDIO("Studio"),
    
    OTHER("Other");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type = TypeEnum.ROOM;

  public Property id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Property name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Property city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Property lat(Float lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * @return lat
  */
  
  @Schema(name = "lat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lat")
  public Float getLat() {
    return lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public Property _long(Float _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
  */
  
  @Schema(name = "long", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("long")
  public Float getLong() {
    return _long;
  }

  public void setLong(Float _long) {
    this._long = _long;
  }

  public Property img(String img) {
    this.img = img;
    return this;
  }

  /**
   * Get img
   * @return img
  */
  
  @Schema(name = "img", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("img")
  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public Property datePublished(OffsetDateTime datePublished) {
    this.datePublished = datePublished;
    return this;
  }

  /**
   * Get datePublished
   * @return datePublished
  */
  @Valid 
  @Schema(name = "date_published", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_published")
  public OffsetDateTime getDatePublished() {
    return datePublished;
  }

  public void setDatePublished(OffsetDateTime datePublished) {
    this.datePublished = datePublished;
  }

  public Property rent(Float rent) {
    this.rent = rent;
    return this;
  }

  /**
   * Get rent
   * @return rent
  */
  
  @Schema(name = "rent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rent")
  public Float getRent() {
    return rent;
  }

  public void setRent(Float rent) {
    this.rent = rent;
  }

  public Property rentIncl(Boolean rentIncl) {
    this.rentIncl = rentIncl;
    return this;
  }

  /**
   * Get rentIncl
   * @return rentIncl
  */
  
  @Schema(name = "rent_incl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rent_incl")
  public Boolean getRentIncl() {
    return rentIncl;
  }

  public void setRentIncl(Boolean rentIncl) {
    this.rentIncl = rentIncl;
  }

  public Property sqm(Integer sqm) {
    this.sqm = sqm;
    return this;
  }

  /**
   * Get sqm
   * @return sqm
  */
  
  @Schema(name = "sqm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqm")
  public Integer getSqm() {
    return sqm;
  }

  public void setSqm(Integer sqm) {
    this.sqm = sqm;
  }

  public Property postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  
  @Schema(name = "postal_code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Property type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.id, property.id) &&
        Objects.equals(this.name, property.name) &&
        Objects.equals(this.city, property.city) &&
        Objects.equals(this.lat, property.lat) &&
        Objects.equals(this._long, property._long) &&
        Objects.equals(this.img, property.img) &&
        Objects.equals(this.datePublished, property.datePublished) &&
        Objects.equals(this.rent, property.rent) &&
        Objects.equals(this.rentIncl, property.rentIncl) &&
        Objects.equals(this.sqm, property.sqm) &&
        Objects.equals(this.postalCode, property.postalCode) &&
        Objects.equals(this.type, property.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, city, lat, _long, img, datePublished, rent, rentIncl, sqm, postalCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    rent: ").append(toIndentedString(rent)).append("\n");
    sb.append("    rentIncl: ").append(toIndentedString(rentIncl)).append("\n");
    sb.append("    sqm: ").append(toIndentedString(sqm)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

