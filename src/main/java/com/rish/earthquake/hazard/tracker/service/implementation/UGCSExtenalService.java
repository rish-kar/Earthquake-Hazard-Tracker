package com.rish.earthquake.hazard.tracker.service.implementation;

import com.rish.earthquake.hazard.tracker.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.*;

@Slf4j
@Service
@AllArgsConstructor
public class UGCSExtenalService implements ExternalServiceCaller {

  @NonNull
  @Autowired
  WebClient webClient;


  @Override
  public Mono<String> getSummary(String urlSuffix) {

    return webClient.get().uri(urlSuffix)
        .exchangeToMono(clientResponse -> {
          if (clientResponse.statusCode().is2xxSuccessful()) {
            return clientResponse.bodyToMono(String.class);
          } else {
            // propagate error to caller rather than returning a plain string
            return clientResponse.createException().flatMap(Mono::error);
          }
        });
  }

  @Override
  public Mono<String> getDetails(String urlSuffix) {

    return webClient.get().uri(urlSuffix)
        .exchangeToMono(clientResponse -> {
          if (clientResponse.statusCode().is2xxSuccessful()) {
            return clientResponse.bodyToMono(String.class);
          } else {
            return clientResponse.createException().flatMap(Mono::error);
          }
        });
  }
}
