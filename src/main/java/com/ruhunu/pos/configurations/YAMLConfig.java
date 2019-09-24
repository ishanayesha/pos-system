package com.ruhunu.pos.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Retrieve the application.yml details
 */
@Component
@PropertySource("classpath:application.yml")
public class YAMLConfig {

  @Value("${jwt.secret}")
  private String secret;

  @Value("${info.app.name}")
  private String appName;

  @Value("${info.app.version}")
  private String appVersion;

  public String getSecret() {
    return secret;
  }

  public String getAppName() {
    return appName;
  }

  public String getAppVersion() {
    return appVersion;
  }
}
