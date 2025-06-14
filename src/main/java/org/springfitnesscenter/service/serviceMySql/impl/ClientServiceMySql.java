package org.springfitnesscenter.service.serviceMySql.impl;

import org.springfitnesscenter.domain.Client;

import java.util.List;

public interface ClientServiceMySql extends CRUDServiceMySql<Client> {

    List<Client> findClientsByProgram(String name);

    List<Client> findClientsByPhone(String name);


}
