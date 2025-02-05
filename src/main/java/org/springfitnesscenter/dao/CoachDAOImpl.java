package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.CoachDAO;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.repository.CoachRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachDAOImpl implements CoachDAO {

    CoachRepository repository;


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
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
