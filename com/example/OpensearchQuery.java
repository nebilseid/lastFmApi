
package com.example;

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
    "#text",
    "role",
    "startPage"
})
public class OpensearchQuery {

    @JsonProperty("#text")
    private String text;
    @JsonProperty("role")
    private String role;
    @JsonProperty("startPage")
    private String startPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("#text")
    public String getText() {
        return text;
    }

    @JsonProperty("#text")
    public void setText(String text) {
        this.text = text;
    }

    public OpensearchQuery withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public OpensearchQuery withRole(String role) {
        this.role = role;
        return this;
    }

    @JsonProperty("startPage")
    public String getStartPage() {
        return startPage;
    }

    @JsonProperty("startPage")
    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public OpensearchQuery withStartPage(String startPage) {
        this.startPage = startPage;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OpensearchQuery withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
