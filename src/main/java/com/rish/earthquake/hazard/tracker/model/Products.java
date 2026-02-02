package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;

@Slf4j
public class Products {

  // Map of product type to list of Product objects
  @JsonAnySetter
  Map<String, List<Product>> products = new HashMap<>();

  @JsonAnyGetter
  public Map<String, List<Product>> getProducts() {
    return products;
  }

}

