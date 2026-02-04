package com.rish.earthquake.hazard.tracker.service.implementation;

import com.rish.earthquake.hazard.tracker.model.*;
import com.rish.earthquake.hazard.tracker.service.*;
import com.rish.earthquake.hazard.tracker.utility.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
public class GeoDataService implements GeoDataInterface {

  @Autowired
  ExternalServiceCaller externalServiceCaller;

  @Autowired
  DeSerialiser deSerialiser;

  @Autowired
  RequestBuilder requestBuilder;

  @Override
  public ResponseEntity getSummary(RequestParametersDTO requestParameters) {

    // Pre-processing: build the URL suffix from the request parameters
    String urlSuffix = requestBuilder.buildRequest(requestParameters);

    try {

      String clientResponseJson = externalServiceCaller.getSummary(urlSuffix).block();
      GeoJsonSummary jsonSummary = deSerialiser.convertToJsonSummary(clientResponseJson);

      return new ResponseEntity<>(jsonSummary, HttpStatus.OK);

    } catch (Exception e) {

      return new ResponseEntity<>("Upstream service error: " + e.getMessage(), HttpStatus.BAD_GATEWAY);
    }
  }
}
