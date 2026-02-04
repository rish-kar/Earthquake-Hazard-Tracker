package com.rish.earthquake.hazard.tracker.service;


import com.rish.earthquake.hazard.tracker.model.*;
import org.springframework.http.*;

public interface GeoDataInterface {

  ResponseEntity getSummary(RequestParametersDTO requestParameters);

}
