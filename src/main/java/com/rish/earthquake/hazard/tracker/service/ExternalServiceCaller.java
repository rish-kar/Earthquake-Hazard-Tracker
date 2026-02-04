package com.rish.earthquake.hazard.tracker.service;

import reactor.core.publisher.*;

public interface ExternalServiceCaller {

  Mono<String> getGeoJsonSummary();
  Mono<String> getGeoJsonData();

}
