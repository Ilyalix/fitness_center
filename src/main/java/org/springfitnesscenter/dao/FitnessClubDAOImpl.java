package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.FitnessClubDAO;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.repository.FitnessClubRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubDAOImpl implements FitnessClubDAO {

    FitnessClubRepository repository;

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
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
