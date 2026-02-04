package com.rish.earthquake.hazard.tracker.service;

import reactor.core.publisher.*;

public interface ExternalServiceCaller {

  Mono<String> getSummary(String urlSuffix);
  Mono<String> getDetails(String urlSuffix);

}
