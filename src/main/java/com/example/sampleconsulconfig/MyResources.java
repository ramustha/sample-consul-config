package com.example.sampleconsulconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MyResources {
  private final MyConfiguration myConfiguration;
  
  @GetMapping(value = "/config", produces = MediaType.APPLICATION_JSON_VALUE)
  public MyConfiguration getConfig() {
    return myConfiguration;
  }
}
