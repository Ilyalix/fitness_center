package org.springfitnesscenter.dao.impl;

import org.springfitnesscenter.domain.Client;

import java.util.List;

public interface ClientDAO extends CrudDAO <Client> {

    List<Client> findClientsByProgram (String name);

    List<Client> findClientsByPhone (String name);
}
