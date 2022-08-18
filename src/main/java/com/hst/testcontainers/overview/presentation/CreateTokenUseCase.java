package com.hst.testcontainers.overview.presentation;

import org.springframework.stereotype.Component;

@Component
public class CreateTokenUseCase {

  private TokenRepository tokenRepository;

  public CreateTokenUseCase(TokenRepository tokenRepository) {
    this.tokenRepository = tokenRepository;
  }

  public void execute(Token token) {
    tokenRepository.save(token);
  }

}
