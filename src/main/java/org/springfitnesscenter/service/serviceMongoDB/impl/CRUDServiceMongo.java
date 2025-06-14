package org.springfitnesscenter.service.serviceMongoDB.impl;


import java.util.List;

public interface CRUDServiceMongo<T> {

    void save(T t);

    void update(T t);

    T findById(int id);

    List<T> findAll();

    void deleteById(int id);

}
