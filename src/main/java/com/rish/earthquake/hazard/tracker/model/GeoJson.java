package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;

import java.math.*;
import java.sql.*;

public class GeoJson {

  // Logarithmic measure of size of the earthquake at epicentre (source)
  @JsonProperty("mag")
  float magnitude;

  // Places in close proximity to the seismic event
  @JsonProperty("place")
  String place;

  // Time always provided in UTC format to avoid confusion and daylight savings
  @JsonProperty("time")
  long time;

}
