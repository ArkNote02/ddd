package com.github.arknote02.account.usecase;

import com.github.arknote02.account.domain.Account;
import com.github.arknote02.account.domain.LoginId;
import com.github.arknote02.account.infrastructure.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class UseCase {

  private final AccountRepository repository;

  // 作成する
  public Mono<Account> create(Account account) {
    return repository.add(account);
  }

  // 更新する
  // 削除する
  // ID検索する
  public Mono<Account> find(LoginId loginId) {
    return repository.find(loginId);
  }

  // 検索する
}
