package com.github.arknote02.book.infrastructure;

import com.github.arknote02.book.domain.Book;
import com.github.arknote02.book.domain.BookId;
import com.github.arknote02.book.domain.Repository;

/**
 * Repositoryの実装.
 */
public class BookRepository implements Repository<Book, BookId> {

  @Override
  public Book get(BookId bookId) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterable<Book> list() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void add(Book book) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void edit(Book book) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void delete(BookId bookId) {
    throw new UnsupportedOperationException();
  }
}
