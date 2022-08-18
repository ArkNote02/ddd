package com.github.arknote02.book.domain;

import java.util.UUID;

public record Book(BookId id, String title) {

  public static Book create(String title) {
    BookId id = new BookId(UUID.randomUUID().toString());
    return new Book(id, title);
  }
}
