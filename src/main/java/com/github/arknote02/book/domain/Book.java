package com.github.arknote02.book.domain;

import java.util.UUID;

/**
 * バリデーションが必要ならcreateで行う.
 *
 * ID生成に外部リソース（データベースシーケンス等）を利用する場合はFactoryパターンにする.
 * createメソッドの削除、同パッケージにDoctorFactory（interface）を作成、infrastructureパッケージで実装.
 */
public record Book(BookId id, String title) {

  public static Book create(String title) {
    BookId id = new BookId(UUID.randomUUID().toString());
    return new Book(id, title);
  }
}
