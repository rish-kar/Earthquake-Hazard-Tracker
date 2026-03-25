package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;

@Slf4j
public class Products {

  // Map of product type -> list of product objects
  // We use @JsonAnySetter to capture dynamic keys representing product types
  @JsonAnySetter
  Map<String, List<Product>> productsByType = new HashMap<>();

  @JsonAnyGetter
  public Map<String, List<Product>> getProductsByType() {
    return productsByType;
  }

}
