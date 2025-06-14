package org.springfitnesscenter.service.serviceMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.ClientDAOMongoDB;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.service.serviceMongoDB.impl.ClientServiceMongo;
import org.springfitnesscenter.validation.Validation;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientServiceMongoImpl implements ClientServiceMongo {

    ClientDAOMongoDB clientDAO;

    @Override
    public void save(Client client) {
        Validation.validation(client);
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
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        clientDAO.deleteById(id);
    }
}
