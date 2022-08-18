package com.github.arknote02.book.infrastructure;

import com.github.arknote02.book.usecase.BookUseCase;
import com.github.arknote02.book.domain.Book;
import com.github.arknote02.book.domain.BookId;
import com.github.arknote02.book.domain.Repository;

class BookUseCaseImplementer implements BookUseCase {

  private final Repository<Book, BookId> repository;

  public BookUseCaseImplementer(Repository<Book, BookId> repository) {
    this.repository = repository;
  }

  @Override
  public Book find(BookId id) {
    return repository.get(id);
  }

  @Override
  public Book find(String title) {
    // リポジトリパターンで複雑になりうるものはクエリとしてそのまま検索させる
    return null;
  }

  @Override
  public void register(Book book) {
    repository.add(book);
  }
}
