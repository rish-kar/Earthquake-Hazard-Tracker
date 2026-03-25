package com.rish.earthquake.hazard.tracker.model;

import lombok.*;
import lombok.extern.slf4j.*;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class RequestParametersDTO {

  String format;
  String startDate;
  String endDate;

}
