package com.github.arknote02.account.domain;

import lombok.Data;

@Data
public class AccessToken {

  private String accessToken;
  private String secretToken;
  private Long applicationId;
  private Long accountId;
}
