package com.rish.earthquake.hazard.tracker.controller;

import com.rish.earthquake.hazard.tracker.model.*;
import com.rish.earthquake.hazard.tracker.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/geo/data")
@Slf4j
public class GeoDataController {


  GeoDataInterface geoDataInterface;

  @GetMapping
  public ResponseEntity<?> getSummaryData(@NonNull @RequestParam("format") String format,
                                          @RequestParam("startTime") String startDate,
                                          @RequestParam("endTime") String endDate) {

    RequestParametersDTO requestParameters = new RequestParametersDTO(format, startDate, endDate);
    ResponseEntity response = geoDataInterface.


    return new ResponseEntity<>(null);
  }


  @GetMapping
  public ResponseEntity<?> getDetailedData() {


    return new ResponseEntity<>(null);
  }

}
