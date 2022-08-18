package com.github.arknote02.book.infrastructure;

import com.github.arknote02.book.domain.Book;
import com.github.arknote02.book.domain.BookId;
import com.github.arknote02.book.usecase.BookUseCase;

/**
 * エンドポイントの提供.
 * ドメインでバリデーションする場合は返ってきた例外の処理もする.
 */
public class BookAPI {

  private final BookUseCase registerBook;

  public BookAPI(BookUseCase registerBook) {
    this.registerBook = registerBook;
  }

  public String get(String id) {
    Book book = registerBook.find(new BookId(id));
    return "{\"id\":\"" + book.id() + "\",\"title\":\"" + book.title() + "\"}";
  }

  public String getByTitle(String title) {
    Book book = registerBook.find(title);
    return "{\"id\":\"" + book.id() + "\",\"title\":\"" + book.title() + "\"}";
  }

  public String put(String title) {
    Book book = Book.create(title);
    registerBook.register(book);
    return "{\"status\":\"OK\"}";
  }
}
