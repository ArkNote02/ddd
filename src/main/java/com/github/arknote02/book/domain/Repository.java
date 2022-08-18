package com.github.arknote02.book.domain;

/**
 * 汎用的にしたが、エンティティを明示してもよい.
 * 必要ないメソッドは {@link UnsupportedOperationException} 投げればいい.
 * Repositoryパターンで推奨されるのは記載のメソッドくらいなのでそれ以外で必要なものはクエリにする方が無難.
 * @param <ENTITY> エンティティ
 * @param <IDENTIFIER> 一意にするための識別子
 */
public interface Repository<ENTITY, IDENTIFIER> {

  ENTITY get(IDENTIFIER identifier);

  Iterable<ENTITY> list();

  void add(ENTITY entity);

  void edit(ENTITY entity);

  void delete(IDENTIFIER identifier);
}
