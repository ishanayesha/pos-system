package com.ruhunu.pos.model;

import java.io.Serializable;

/**
 * Model class for the jwt response
 */
public class JwtResponse implements Serializable {

  private static final long serialVersionUID = -5687034047296338249L;
  private final String jwttoken;

  public JwtResponse(String jwttoken) {
    this.jwttoken = jwttoken;
  }

  public String getToken() {
    return this.jwttoken;
  }
}
