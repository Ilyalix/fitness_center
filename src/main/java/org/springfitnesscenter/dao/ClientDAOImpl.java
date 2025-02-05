package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.ClientDAO;
import org.springfitnesscenter.dao.impl.ProgramDAO;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.repository.ClientRepository;
import org.springfitnesscenter.repository.ProgramRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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


    @Override
    public void deleteById(int id) {
        repository.deleteById(id);

    }
}
