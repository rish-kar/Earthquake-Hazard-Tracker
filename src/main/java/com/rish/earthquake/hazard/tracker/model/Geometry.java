package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class Geometry {

  // Geometry type, typically "Point"
  @JsonProperty("type")
  String geometryType;

  // Coordinates as [longitude, latitude, depth]
  @JsonProperty("coordinates")
  List<Double> coordinates;

  // Optional id associated with the geometry
  @JsonProperty("id")
  String geometryId;

}
