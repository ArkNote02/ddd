package com.github.arknote02.account.domain;

import org.apache.commons.codec.digest.DigestUtils;

public record Password(String value) {

  // TODO move to secrets
  private static final String SALT = "tH1S /s @ zA{T.";

  public Password {
    if (value == null || value.length() < 8) {
      throw new IllegalArgumentException("パスワードは8文字以上にしてください。");
    }
    if (value.length() > 128) {
      throw new IllegalArgumentException("パスワードは128文字以下にしてください。");
    }
    boolean[] policies = new boolean[4];
    for (int c : value.toCharArray()) {
      if (!(33 <= c && c <= 126)) {
        throw new IllegalArgumentException("パスワードに使用できない文字が含まれています。");
      }
      if (48 <= c && c <= 57) { // 半角数字
        policies[0] = true;
      } else if (65 <= c && c <= 90) { // 半角英字大文字
        policies[1] = true;
      } else if (97 <= c && c <= 122) { // 半角英字小文字
        policies[2] = true;
      } else { // 記号
        policies[3] = true;
      }
    }
    if (!(policies[0] && policies[1] && policies[2] && policies[3])) {
      throw new IllegalArgumentException("パスワードは英字（大文字／小文字）、数字、記号を含めてください。");
    }
  }

  public EncryptedPassword encrypt() {
    String encryptedValue = value;
    for (int i = 0; i < 10000; i++) {
      encryptedValue = DigestUtils.sha512Hex(SALT + encryptedValue);
    }
    return new EncryptedPassword(encryptedValue);
  }
}
