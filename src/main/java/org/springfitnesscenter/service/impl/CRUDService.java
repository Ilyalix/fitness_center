package org.springfitnesscenter.service.impl;


public interface CRUDService<T> {

    void save(T t);

    void update(T t);

    T findById(int id);

    void deleteById(int id);

}
