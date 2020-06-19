
package com.rych.apiweek7guardian;

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
    "type",
    "sectionId",
    "sectionName",
    "webPublicationDate",
    "webTitle",
    "webUrl",
    "apiUrl",
    "isHosted",
    "pillarId",
    "pillarName"
})
public class Result {

    @JsonProperty("id")
    public String id;
    @JsonProperty("type")
    public String type;
    @JsonProperty("sectionId")
    public String sectionId;
    @JsonProperty("sectionName")
    public String sectionName;
    @JsonProperty("webPublicationDate")
    public String webPublicationDate;
    @JsonProperty("webTitle")
    public String webTitle;
    @JsonProperty("webUrl")
    public String webUrl;
    @JsonProperty("apiUrl")
    public String apiUrl;
    @JsonProperty("isHosted")
    public Boolean isHosted;
    @JsonProperty("pillarId")
    public String pillarId;
    @JsonProperty("pillarName")
    public String pillarName;
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
