package com.rish.earthquake.hazard.tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.extern.slf4j.*;

import java.util.*;


@Slf4j
public class GeoJson {

  UUID eventId = UUID.randomUUID();;

  // Logarithmic measure of size of the earthquake at epicentre (source)
  @JsonProperty("mag")
  float magnitude;

  // Places in close proximity to the seismic event
  @JsonProperty("place")
  String place;

  // Time always provided in UTC format to avoid confusion and daylight savings
  @JsonProperty("time")
  long time;

  // Time in which the event was updated
  @JsonProperty("updated")
  long updatedTime;

  // Timezone offset from UTC
  @JsonProperty("tz")
  int timeZoneOffSet;

  // USGC event page for event
  @JsonProperty("url")
  String sourceUrl;

  // Total number of reported incidents
  @JsonProperty("felt")
  int reportedNumber;

  // Maximum reported intensity
  @JsonProperty("cdi")
  float maximumReportedIntensity;

  // Maximum estimated instrumental intensity computed by ShakeMap
  @JsonProperty("mmi")
  float maxComputedIntensity;

  // Alert level from PAGER impact scale
  // Typical Values: [“green”, “yellow”, “orange”, “red”]
  @JsonProperty("alert")
  Alert alert;

  // Automatic is computed status, Reviewed is human verified
  // Typical Values: [“automatic”, “reviewed”, “deleted”]
  @JsonProperty("status")
  Status status;

  // Tsunami triggered if value = 1 (past or future)
  // If value = 1, event will include NOAA Tsunami website (handover from UGCS)
  @JsonProperty("tsunami")
  int tsunami;

  // Denotes significance of the flag
  @JsonProperty("sig")
  int eventSignificance;

  // ID of data contributor
  // Typical values: [ak, at, ci, hv, ld, mb, nc, nm, nn, pr, pt, se, us, uu, uw]
  @JsonProperty("net")
  NetworkContributor net;

  // Unique code to identify events
  @JsonProperty("code")
  String eventCode;

  // Comma separated event ids associated with the event
  @JsonProperty("ids")
  String associatedEventIds;

  // Comma separated network contributors
  @JsonProperty("sources")
  String associatedNetworkContributors;

  // Comma separated product types
  @JsonProperty("types")
  String associatedProductTypes;

  // Total number of seismic stations used to determine the earthquake location
  @JsonProperty("nst")
  int numberOfReportingStations;

  // Horizontal distance from the epicenter to the nearest seismic station
  // Value provided in degrees: 1 degree = 111.2 kilometers
  @JsonProperty("dmin")
  float distanceFromEpicenter;

  // Root mean squared (RMS) of observed arrival time to predicted arrival time
  @JsonProperty("rms")
  float travelTimeResidual;

  // Azimuthal gap between adjacent stations
  // Smaller number = more reliable calculated horizontal position (less uncertainties)
  @JsonProperty("gap")
  float stationGap;

  // The method or algorithm used to calculate the preferred magnitude for the event
  @JsonProperty("magType")
  String magnitudeType;

  // Type of seismic event
  @JsonProperty("type")
  String eventType;

}
