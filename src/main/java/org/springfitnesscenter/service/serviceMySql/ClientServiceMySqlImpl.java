package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.ClientDAOMySql;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.service.serviceMySql.impl.ClientServiceMySql;
import org.springfitnesscenter.validation.Validation;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientServiceMySqlImpl implements ClientServiceMySql {

    ClientDAOMySql clientDAO;

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
    public void deleteById(int id) {
        clientDAO.deleteById(id);
    }

    @Override
    public List<Client> findClientsByProgram(String name) {
        return clientDAO.findClientsByProgram(name);
    }

    @Override
    public List<Client> findClientsByPhone(String name) {
        return clientDAO.findClientsByPhone(name);
    }

}
