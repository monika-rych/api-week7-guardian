
package com.rych.apiweek7guardian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "userTier",
    "total",
    "startIndex",
    "pageSize",
    "currentPage",
    "pages",
    "orderBy",
    "results"
})
public class Response {

    @JsonProperty("status")
    public String status;
    @JsonProperty("userTier")
    public String userTier;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("startIndex")
    public Integer startIndex;
    @JsonProperty("pageSize")
    public Integer pageSize;
    @JsonProperty("currentPage")
    public Integer currentPage;
    @JsonProperty("pages")
    public Integer pages;
    @JsonProperty("orderBy")
    public String orderBy;
    @JsonProperty("results")
    public List<Result> results = new ArrayList<Result>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
