package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class GeoJsonSummary {

  // JSON type for the top-level object (typically "FeatureCollection")
  @JsonProperty("type")
  String collectionType;

  // Metadata about the feed (generation time, count, API info)
  @JsonProperty("metadata")
  Metadata feedMetadata;

  // Bounding box for returned features [minLon, minLat, minDepth, maxLon, maxLat, maxDepth]
  @JsonProperty("bbox")
  List<Double> boundingBoxMinMax;

  // List of features contained in this feed
  @JsonProperty("features")
  List<Feature> featureList;

}
