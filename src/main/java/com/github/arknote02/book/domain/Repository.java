package com.github.arknote02.book.domain;

public interface Repository<ENTITY, IDENTIFIER> {

  ENTITY get(IDENTIFIER identifier);

  Iterable<ENTITY> list();

  void add(ENTITY entity);

  void edit(ENTITY entity);

  void delete(IDENTIFIER identifier);
}
