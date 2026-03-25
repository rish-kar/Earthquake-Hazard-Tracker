package com.rish.earthquake.hazard.tracker.utility;

import com.rish.earthquake.hazard.tracker.model.*;
import org.springframework.stereotype.*;

// Use an explicit bean name to avoid collision with springdoc's internal 'requestBuilder' bean
@Component("appRequestBuilder")
public class RequestBuilder {

  public String buildRequest(RequestParametersDTO requestParameters) {

    StringBuilder urlSuffix = new StringBuilder();
    if (requestParameters.getFormat() != null) {
      urlSuffix.append("format=").append(requestParameters.getFormat());
    } else throw new IllegalArgumentException("Data Format needs to be passed as parameter");

    if (requestParameters.getStartDate() != null) {
      urlSuffix.append("&starttime=").append(requestParameters.getStartDate());
    }
    if (requestParameters.getEndDate() != null) {
      urlSuffix.append("&endtime=").append(requestParameters.getEndDate());
    }

    // WebClient in the app uses baseUrl(...) pointing to /fdsnws/event/1/;
    // the USGS API expects the 'query' path before query parameters, e.g. /query?format=geojson&starttime=...
    return "query?" + urlSuffix.toString();
  }

}
