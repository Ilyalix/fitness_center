package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.ClientDAO;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.repository.ClientRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientDAOImpl implements ClientDAO {

    ClientRepository repository;

    @Override
    public void save(Client client) {
       repository.save(client);
    }

    @Override
    public void update(Client client) {
        repository.save(client);

    }

    @Override
    public Client findById(int id) {
        return repository.findById(id).get();
    }

    //@Scheduled(cron = "0 0 1 * * *")
    @Override
    public void deleteById(int id) {
       repository.deleteClientFromVisitById(id);
       repository.deleteClientById(id);

    }

    public List<Client> findClientsByProgram(String name) {
       return repository.findClientsByProgram(name);
    }

    public List<Client> findClientsByPhone(String name) {
        return repository.findClientsByPhone(name);
    }
}
