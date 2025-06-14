package org.springfitnesscenter.dao.daoMySQL.impl;


public interface CrudDAOMySql<T> {

    void save (T t);

    void update (T t);

    T findById (int id);

    void deleteById (int id);
}
