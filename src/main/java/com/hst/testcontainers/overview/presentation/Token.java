package com.hst.testcontainers.overview.presentation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token {

  @Id
  @Column(name = "id_token")
  private Long idToken;

  private String status;

  private String tokenRef;

  private String last4;

  public Token() {
  }

  public Token(Long idToken, String status, String tokenRef, String last4) {
    this.idToken = idToken;
    this.status = status;
    this.tokenRef = tokenRef;
    this.last4 = last4;
  }

  public Long getIdToken() {
    return idToken;
  }

  public String getStatus() {
    return status;
  }

  public String getTokenRef() {
    return tokenRef;
  }

  public String getLast4() {
    return last4;
  }
}
