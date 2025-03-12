package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.ClientDAO;
import org.springfitnesscenter.dao.impl.CrudDAO;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.service.impl.ClientService;
import org.springframework.stereotype.Service;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    ClientDAO clientDAO;

    @Override
    public void save(Client client) {
        clientDAO.save(client);
    }

    @Override
    public void update(Client client) {
        clientDAO.update(client);
    }

    @Override
    public Client findById(int id) {
        return clientDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        clientDAO.deleteById(id);
    }
}
