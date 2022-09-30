package com.github.arknote02.account.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Account {

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

  public enum Gender {
    MALE,
    FEMALE,
    NON_BINARY,
    TRANSGENDER,
    INTERSEX,
    SECRET // prefer not to say
  }
}
