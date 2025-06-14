package org.springfitnesscenter.dao.daoMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.FitnessClubDAOMongoDB;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.repository.mongo.FitnessClubMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubDAOMongoDBImpl implements FitnessClubDAOMongoDB {

    FitnessClubMongoRepository repository;

    @Override
    public void save(FitnessClub fitnessClub) {
        repository.save(fitnessClub);
    }

    @Override
    public void update(FitnessClub fitnessClub) {
        repository.save(fitnessClub);
    }

    @Override
    public FitnessClub findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<FitnessClub> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
