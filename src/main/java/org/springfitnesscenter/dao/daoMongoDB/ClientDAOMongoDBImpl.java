package org.springfitnesscenter.dao.daoMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.ClientDAOMongoDB;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.repository.mongo.ClientMongoRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientDAOMongoDBImpl implements ClientDAOMongoDB {

    PasswordEncoder passwordEncoder;

    ClientMongoRepository repository;

    @Override
    public void save(Client client) {
        String password = client.getPassword();
        String encode = passwordEncoder.encode(password);
        client.setPassword(encode);
        repository.save(client);
    }

    @Override
    public void update(Client client) {
        String password = client.getPassword();
        String encode = passwordEncoder.encode(password);
        client.setPassword(encode);
        repository.save(client);
    }

    @Override
    public Client findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
       repository.deleteById(id);
    }
}
