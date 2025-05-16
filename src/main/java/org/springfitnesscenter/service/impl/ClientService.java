package org.springfitnesscenter.service.impl;

import org.springfitnesscenter.domain.Client;

import java.util.List;

public interface ClientService extends CRUDService <Client>{

    List<Client> findClientsByProgram(String name);

    List<Client> findClientsByPhone(String name);


}
