package com.github.arknote02.account.infrastructure;

import com.github.arknote02.account.domain.Account;
import com.github.arknote02.account.domain.LoginId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class AccountRepository {

  private final AccountReactiveRepository repository;

  public Mono<Account> find(LoginId loginId) {
    return repository.findById(loginId.value())
        .map(AccountEntity::toAccount);
  }

  public Mono<Account> add(Account account) {
    return repository.save(new AccountEntity(account))
        .map(AccountEntity::toAccount);
  }
}
