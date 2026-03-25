package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;


@Slf4j
public class Metadata {

  // Millisecond timestamp when this feed was generated (UTC)
  @JsonProperty("generated")
  long generatedTimestampUtc;

  // URL to the API endpoint that produced this feed
  @JsonProperty("url")
  String apiUrl;

  // Human readable title for the feed
  @JsonProperty("title")
  String feedTitle;

  // API version string
  @JsonProperty("api")
  String apiVersion;

  // Number of features returned in this feed
  @JsonProperty("count")
  int featureCount;

  // HTTP-like status code for the feed response (when available)
  @JsonProperty("status")
  int responseStatus;

}
