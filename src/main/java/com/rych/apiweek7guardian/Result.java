
package com.rych.apiweek7guardian;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class Result {

    @JsonProperty("id")
    @Id
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

}
