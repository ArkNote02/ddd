package com.github.arknote02.account.infrastructure;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountReactiveRepository extends ReactiveCrudRepository<AccountEntity, Long> {

}
