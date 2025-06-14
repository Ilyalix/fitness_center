package org.springfitnesscenter.service.serviceMySql.impl;


public interface CRUDServiceMySql<T> {

    void save(T t);

    void update(T t);

    T findById(int id);

    void deleteById(int id);

}
