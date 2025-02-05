package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.ProgramDAO;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.repository.ProgramRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramDAOImpl implements ProgramDAO {

    ProgramRepository repository;

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
    public void deleteById(int id) {
        deleteById(id);
    }
}
