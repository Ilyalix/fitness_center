package org.springfitnesscenter.dao.daoMongoDB.impl;


import java.util.List;

public interface CrudDAOMongoDB<T> {

    void save (T t);

    void update (T t);

    T findById (int id);

    List<T> findAll();

    void deleteById (int id);
}
