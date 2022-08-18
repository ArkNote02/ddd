package com.github.arknote02.book.usecase;

import com.github.arknote02.book.domain.Book;
import com.github.arknote02.book.domain.BookId;

public interface BookUseCase {

  Book find(BookId id);
  Book find(String title);
  void register(Book book);
}
