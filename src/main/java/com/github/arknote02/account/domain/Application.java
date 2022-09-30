package com.github.arknote02.account.domain;

import lombok.Data;

@Data
public class Application {

  private Long id;
  private String name;
  private String description;
  private Permission permission;
  private String callbackUrl;
  private String key;
  private String secretKey;
  private Long accountId;

  public enum Permission {
    READ,
    READ_AND_WRITE
  }
}
