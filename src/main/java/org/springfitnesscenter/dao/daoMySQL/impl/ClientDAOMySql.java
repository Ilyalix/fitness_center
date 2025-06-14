package org.springfitnesscenter.dao.daoMySQL.impl;

import org.springfitnesscenter.domain.Client;

import java.util.List;

public interface ClientDAOMySql extends CrudDAOMySql<Client> {

    List<Client> findClientsByProgram (String name);

    List<Client> findClientsByPhone (String name);
}
