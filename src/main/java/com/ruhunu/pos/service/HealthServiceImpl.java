package com.ruhunu.pos.service;

import com.ruhunu.pos.configurations.YAMLConfig;
import com.ruhunu.pos.dto.HealthDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * this class will return the application health details
 */
@Component
public class HealthServiceImpl implements HealthService {

  @Autowired
  private YAMLConfig yamlConfig;

  @Override
  public HealthDTO getHealth() {
    return new HealthDTO(yamlConfig.getAppName(), yamlConfig.getAppVersion(), "UP");
  }
}
