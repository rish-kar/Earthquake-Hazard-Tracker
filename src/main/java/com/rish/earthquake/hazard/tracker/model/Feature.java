package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;


@Slf4j
public class Feature {

  // GeoJSON type for the item (always "Feature")
  @JsonProperty("type")
  String geoJsonType;

  // Properties describing the seismic event (magnitude, place, time, etc.)
  @JsonProperty("properties")
  GeoJson eventProperties;

  // Location information for the event (longitude, latitude, depth)
  @JsonProperty("geometry")
  Geometry eventGeometry;

  // Unique identifier for this feature returned by the feed
  @JsonProperty("id")
  String featureId;

}
