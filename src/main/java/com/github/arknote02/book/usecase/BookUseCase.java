package com.github.arknote02.book.usecase;

import com.github.arknote02.book.domain.Book;
import com.github.arknote02.book.domain.BookId;

/**
 * ユースケース.
 * RepositoryパターンとQueryパターンで分けると実装クラスはすっきりするが、
 * ユースケースとしては少し気持ち悪さは残る.
 */
public interface BookUseCase {

  Book find(BookId id);
  Book find(String title);
  void register(Book book);
}
