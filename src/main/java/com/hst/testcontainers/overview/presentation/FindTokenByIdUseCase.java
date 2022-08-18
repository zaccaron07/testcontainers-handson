package com.hst.testcontainers.overview.presentation;

import org.springframework.stereotype.Component;

@Component
public class FindTokenByIdUseCase {

  private TokenRepository tokenRepository;

  public FindTokenByIdUseCase(TokenRepository tokenRepository) {
    this.tokenRepository = tokenRepository;
  }

  public Token execute(Long id) {
    return tokenRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Not found"));
  }

}
