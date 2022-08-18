package com.hst.testcontainers.overview.presentation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

public class TokenTest extends PostgreSQLTestContainer {

  @Autowired
  TestRestTemplate testRestTemplate;

  @Test
  void deveCriarToken() {
    var token = new Token(1L, "Ativo", "119538b1-db5f-44a7-b243-9a5f144419d0", "0674");
    testRestTemplate.postForEntity("/tokens", token, Void.class);

    var result = testRestTemplate.getForEntity("/tokens/" + token.getIdToken(), Token.class);

    assertThat(result).isNotNull();
    assertThat(result.getBody()).isNotNull();
    assertThat(result.getBody().getStatus()).isEqualTo(token.getStatus());
  }
}
