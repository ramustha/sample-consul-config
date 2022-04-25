package com.example.sampleconsulconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "my")
public class MyConfiguration {
  private String name;
  private String email;
}
