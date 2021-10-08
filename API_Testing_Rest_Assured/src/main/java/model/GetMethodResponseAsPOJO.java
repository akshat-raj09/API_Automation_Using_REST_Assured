package model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"year",
"color",
"pantone_value"
})

class Data {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("year")
private Integer year;
@JsonProperty("color")
private String color;
@JsonProperty("pantone_value")
private String pantoneValue;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("year")
public Integer getYear() {
return year;
}

@JsonProperty("year")
public void setYear(Integer year) {
this.year = year;
}

@JsonProperty("color")
public String getColor() {
return color;
}

@JsonProperty("color")
public void setColor(String color) {
this.color = color;
}

@JsonProperty("pantone_value")
public String getPantoneValue() {
return pantoneValue;
}

@JsonProperty("pantone_value")
public void setPantoneValue(String pantoneValue) {
this.pantoneValue = pantoneValue;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("id");
sb.append('=');
sb.append(((this.id == null)?"<null>":this.id));
sb.append(',');
sb.append("name");
sb.append('=');
sb.append(((this.name == null)?"<null>":this.name));
sb.append(',');
sb.append("year");
sb.append('=');
sb.append(((this.year == null)?"<null>":this.year));
sb.append(',');
sb.append("color");
sb.append('=');
sb.append(((this.color == null)?"<null>":this.color));
sb.append(',');
sb.append("pantoneValue");
sb.append('=');
sb.append(((this.pantoneValue == null)?"<null>":this.pantoneValue));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}

//==========================================================================================================


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"url",
"text"
})

class Support {

@JsonProperty("url")
private String url;
@JsonProperty("text")
private String text;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("text")
public String getText() {
return text;
}

@JsonProperty("text")
public void setText(String text) {
this.text = text;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Support.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("url");
sb.append('=');
sb.append(((this.url == null)?"<null>":this.url));
sb.append(',');
sb.append("text");
sb.append('=');
sb.append(((this.text == null)?"<null>":this.text));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}


//============================================================================================================

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"data",
"support"
})

public class GetMethodResponseAsPOJO {

@JsonProperty("data")
private Data data;
@JsonProperty("support")
private Support support;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("data")
public Data getData() {
return data;
}

@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

@JsonProperty("support")
public Support getSupport() {
return support;
}

@JsonProperty("support")
public void setSupport(Support support) {
this.support = support;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(GetMethodResponseAsPOJO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("data");
sb.append('=');
sb.append(((this.data == null)?"<null>":this.data));
sb.append(',');
sb.append("support");
sb.append('=');
sb.append(((this.support == null)?"<null>":this.support));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}

//=========================================================================================