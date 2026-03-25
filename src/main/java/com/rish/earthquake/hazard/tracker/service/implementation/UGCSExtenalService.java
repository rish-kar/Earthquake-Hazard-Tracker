package com.rish.earthquake.hazard.tracker.service.implementation;

import com.rish.earthquake.hazard.tracker.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.*;
import tools.jackson.databind.*;

@Slf4j
@Service
@AllArgsConstructor
public class UGCSExtenalService implements ExternalServiceCaller {

  @NonNull
  @Autowired
  WebClient webClient;


  @Override
  public Mono<String> getGeoJsonSummary() {

    Mono<String> response = webClient.get().exchangeToMono(clientResponse -> {
      if (clientResponse.statusCode().equals(HttpStatus.OK)) {
        return clientResponse.bodyToMono(String.class);
      } else if (clientResponse.statusCode().is4xxClientError()) {
        return Mono.just("Error response");
      } else {
        return clientResponse.createException()
            .flatMap(Mono::error);
      }
    });

    return response;
  }

  @Override
  public Mono<String> getGeoJsonData() {

    Mono<String> response = webClient.get().exchangeToMono(clientResponse -> {
      if (clientResponse.statusCode().equals(HttpStatus.OK)) {
        return clientResponse.bodyToMono(String.class);
      } else if (clientResponse.statusCode().is4xxClientError()) {
        return Mono.just("Error response");
      } else {
        return clientResponse.createException()
            .flatMap(Mono::error);
      }
    });

    return response;
  }
}
