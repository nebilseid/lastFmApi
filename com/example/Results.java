
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
    "opensearch:Query",
    "opensearch:totalResults",
    "opensearch:startIndex",
    "opensearch:itemsPerPage",
    "trackmatches",
    "@attr"
})
public class Results {

    @JsonProperty("opensearch:Query")
    private OpensearchQuery opensearchQuery;
    @JsonProperty("opensearch:totalResults")
    private String opensearchTotalResults;
    @JsonProperty("opensearch:startIndex")
    private String opensearchStartIndex;
    @JsonProperty("opensearch:itemsPerPage")
    private String opensearchItemsPerPage;
    @JsonProperty("trackmatches")
    private Trackmatches trackmatches;
    @JsonProperty("@attr")
    private Attr attr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("opensearch:Query")
    public OpensearchQuery getOpensearchQuery() {
        return opensearchQuery;
    }

    @JsonProperty("opensearch:Query")
    public void setOpensearchQuery(OpensearchQuery opensearchQuery) {
        this.opensearchQuery = opensearchQuery;
    }

    public Results withOpensearchQuery(OpensearchQuery opensearchQuery) {
        this.opensearchQuery = opensearchQuery;
        return this;
    }

    @JsonProperty("opensearch:totalResults")
    public String getOpensearchTotalResults() {
        return opensearchTotalResults;
    }

    @JsonProperty("opensearch:totalResults")
    public void setOpensearchTotalResults(String opensearchTotalResults) {
        this.opensearchTotalResults = opensearchTotalResults;
    }

    public Results withOpensearchTotalResults(String opensearchTotalResults) {
        this.opensearchTotalResults = opensearchTotalResults;
        return this;
    }

    @JsonProperty("opensearch:startIndex")
    public String getOpensearchStartIndex() {
        return opensearchStartIndex;
    }

    @JsonProperty("opensearch:startIndex")
    public void setOpensearchStartIndex(String opensearchStartIndex) {
        this.opensearchStartIndex = opensearchStartIndex;
    }

    public Results withOpensearchStartIndex(String opensearchStartIndex) {
        this.opensearchStartIndex = opensearchStartIndex;
        return this;
    }

    @JsonProperty("opensearch:itemsPerPage")
    public String getOpensearchItemsPerPage() {
        return opensearchItemsPerPage;
    }

    @JsonProperty("opensearch:itemsPerPage")
    public void setOpensearchItemsPerPage(String opensearchItemsPerPage) {
        this.opensearchItemsPerPage = opensearchItemsPerPage;
    }

    public Results withOpensearchItemsPerPage(String opensearchItemsPerPage) {
        this.opensearchItemsPerPage = opensearchItemsPerPage;
        return this;
    }

    @JsonProperty("trackmatches")
    public Trackmatches getTrackmatches() {
        return trackmatches;
    }

    @JsonProperty("trackmatches")
    public void setTrackmatches(Trackmatches trackmatches) {
        this.trackmatches = trackmatches;
    }

    public Results withTrackmatches(Trackmatches trackmatches) {
        this.trackmatches = trackmatches;
        return this;
    }

    @JsonProperty("@attr")
    public Attr getAttr() {
        return attr;
    }

    @JsonProperty("@attr")
    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    public Results withAttr(Attr attr) {
        this.attr = attr;
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

    public Results withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
