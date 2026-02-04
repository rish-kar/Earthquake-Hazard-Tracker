package com.rish.earthquake.hazard.tracker.controller;

import com.rish.earthquake.hazard.tracker.model.*;
import com.rish.earthquake.hazard.tracker.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/geo/data")
@Slf4j
public class GeoDataController {


  @Autowired
  GeoDataInterface geoDataInterface;

  @GetMapping("/summary")
  // The upstream API (and your curl) uses query parameter names 'format', 'starttime' and 'endtime'
  // Match those exact names here so Spring can bind them correctly.
  public ResponseEntity<?> getSummary(@NonNull @RequestParam("format") String format,
                                          @RequestParam("starttime") String startDate,
                                          @RequestParam("endtime") String endDate) {

    RequestParametersDTO requestParameters = new RequestParametersDTO(format, startDate, endDate);
    ResponseEntity response = geoDataInterface.getSummary(requestParameters);

    return response;
  }


  @GetMapping("/detail")
  public ResponseEntity<?> getDetailedData() {


    return new ResponseEntity<>(null);
  }

}
