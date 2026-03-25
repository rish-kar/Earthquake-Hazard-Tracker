package com.rish.earthquake.hazard.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.*;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public WebClient webClientBuilder() {

    return WebClient.builder()
        .baseUrl("https://earthquake.usgs.gov/fdsnws/event/1/")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.ALL_VALUE)
        .build();
  }
}
