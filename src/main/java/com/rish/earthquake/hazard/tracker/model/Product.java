package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class Product {

  // Unique identifier for the product
  @JsonProperty("id")
  String id;

  @JsonProperty("type")
  String type;

  @JsonProperty("code")
  String code;

  @JsonProperty("source")
  String source;

  // Time when the product was last updated (epoch millis)
  @JsonProperty("updateTime")
  long updateTime;

  @JsonProperty("status")
  String status;

  // Arbitrary key/value properties
  @JsonProperty("properties")
  Map<String, String> properties;

  @JsonProperty("preferredWeight")
  int preferredWeight;

  // Map of content path -> content metadata
  @JsonProperty("contents")
  Map<String, Content> contents;


  // Nested class modelling each content entry
  public static class Content {

    @JsonProperty("contentType")
    String contentType;

    // epoch millis
    @JsonProperty("lastModified")
    long lastModified;

    @JsonProperty("length")
    int length;

    @JsonProperty("url")
    String url;

  }

}

