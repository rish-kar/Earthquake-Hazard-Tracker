package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class Geometry {

  // Geometry type for this feature (typically "Point")
  // Keeping the JSON property as "type" for compatibility with GeoJSON
  @JsonProperty("type")
  String geometryType;

  // Coordinates ordered as [longitude, latitude, depth].
  // Depth may be null or zero depending on the feed; using a list preserves the original ordering
  @JsonProperty("coordinates")
  List<Double> coordinatesLonLatDepth;

  // Optional identifier for the geometry object returned by the feed
  @JsonProperty("id")
  String geometryIdentifier;

}
