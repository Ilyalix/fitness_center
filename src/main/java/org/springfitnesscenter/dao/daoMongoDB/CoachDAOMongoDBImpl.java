package org.springfitnesscenter.dao.daoMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.CoachDAOMongoDB;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.repository.mongo.CoachMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachDAOMongoDBImpl implements CoachDAOMongoDB {

    CoachMongoRepository repository;


    @Override
    public void save(Coach coach) {
        repository.save(coach);
    }

    @Override
    public void update(Coach coach) {
        repository.save(coach);
    }

    @Override
    public Coach findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Coach> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
