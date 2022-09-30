package com.github.arknote02.account.infrastructure;

import com.github.arknote02.account.domain.Account;
import com.github.arknote02.account.domain.Account.Gender;
import com.github.arknote02.account.domain.EncryptedPassword;
import com.github.arknote02.account.domain.LoginId;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@Data
@Table("account")
public class AccountEntity {

  public AccountEntity(Account account) {
  }

  @Id
  private Long id;
  private LoginId loginId;
  private EncryptedPassword password;
  private String name;
  private Gender gender;
  private LocalDate birthday;
  private String countryCode;
  private String language;
  private String phoneNumber;
  private String mailAddress;
  private LocalDate createdAt;

  public Account toAccount() {
    return new Account();
  }
}
