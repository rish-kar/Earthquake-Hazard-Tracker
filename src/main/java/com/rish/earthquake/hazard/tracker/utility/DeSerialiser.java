package com.rish.earthquake.hazard.tracker.utility;

import com.rish.earthquake.hazard.tracker.model.*;
import com.fasterxml.jackson.databind.*;
import org.springframework.stereotype.*;

@Component
public class DeSerialiser {

  ObjectMapper objectMapper = new ObjectMapper();

  public GeoJsonSummary convertToJsonSummary(String json) {
    try {
      if (json == null || json.isEmpty()) return new GeoJsonSummary();
      return objectMapper.readValue(json, GeoJsonSummary.class);
    } catch (Exception e) {
      return new GeoJsonSummary();
    }
  }

  public GeoJson convertToJsonDetail(String json) {
    try {
      if (json == null || json.isEmpty()) return new GeoJson();
      return objectMapper.readValue(json, GeoJson.class);
    } catch (Exception e) {
      return new GeoJson();
    }
  }

}
