package com.hst.testcontainers.overview.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tokens")
public class TokenController {

  private CreateTokenUseCase createTokenUseCase;

  private FindTokenByIdUseCase findTokenByIdUseCase;

  @Autowired
  public TokenController(CreateTokenUseCase createTokenUseCase,
      FindTokenByIdUseCase findTokenByIdUseCase) {
    this.createTokenUseCase = createTokenUseCase;
    this.findTokenByIdUseCase = findTokenByIdUseCase;
  }

  @PostMapping
  public void create(@RequestBody Token token) {
    createTokenUseCase.execute(token);
  }

  @GetMapping("/{token-id}")
  public ResponseEntity<Token> findById(@PathVariable(value = "token-id") Long tokenId) {
    return ResponseEntity
        .ok(findTokenByIdUseCase.execute(tokenId));
  }
}
