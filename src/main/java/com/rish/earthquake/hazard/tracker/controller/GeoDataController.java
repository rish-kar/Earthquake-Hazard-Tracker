package com.rish.earthquake.hazard.tracker.controller;

import com.rish.earthquake.hazard.tracker.service.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/geo/data")
@Slf4j
public class GeoDataController {


    GeoDataInterface geoDataInterface;

    @GetMapping
    public ResponseEntity<?> getSummaryData() {


      return new ResponseEntity<>(null);
    }

}
