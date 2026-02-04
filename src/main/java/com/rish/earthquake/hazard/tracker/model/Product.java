package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class Product {

  // Unique identifier for the product
  @JsonProperty("id")
  String productId;

  @JsonProperty("type")
  String productType;

  @JsonProperty("code")
  String productCode;

  @JsonProperty("source")
  String productSource;

  // Time when the product was last updated (epoch millis)
  @JsonProperty("updateTime")
  long productUpdatedTimeUtc;

  @JsonProperty("status")
  String productStatus;

  // Arbitrary key/value properties
  @JsonProperty("properties")
  Map<String, String> productProperties;

  @JsonProperty("preferredWeight")
  int preferredWeight;

  // Map of content path -> content metadata
  @JsonProperty("contents")
  Map<String, Content> contentMap;


  // Nested class modelling each content entry
  public static class Content {

    @JsonProperty("contentType")
    String contentType;

    // epoch millis
    @JsonProperty("lastModified")
    long lastModifiedUtc;

    @JsonProperty("length")
    int length;

    @JsonProperty("url")
    String url;

  }

}
