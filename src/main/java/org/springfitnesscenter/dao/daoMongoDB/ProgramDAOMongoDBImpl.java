package org.springfitnesscenter.dao.daoMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.ProgramDAOMongoDB;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.repository.mongo.ProgramMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramDAOMongoDBImpl implements ProgramDAOMongoDB {

    ProgramMongoRepository repository;


    @Override
    public void save(Program program) {
        repository.save(program);
    }

    @Override
    public void update(Program program) {
        repository.save(program);
    }

    @Override
    public Program findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Program> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
