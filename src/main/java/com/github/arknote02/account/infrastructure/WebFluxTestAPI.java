package com.github.arknote02.account.infrastructure;

import com.github.arknote02.account.domain.Account;
import com.github.arknote02.account.domain.LoginId;
import com.github.arknote02.account.usecase.UseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Slf4j
@RestController
public class WebFluxTestAPI {

  private final UseCase useCase;

  @GetMapping("/add")
  public Mono<Account> add() {
    return useCase.create(new Account());
  }

  @GetMapping("/get")
  public Mono<Account> get() {
    return useCase.find(new LoginId(1L));
  }
}
