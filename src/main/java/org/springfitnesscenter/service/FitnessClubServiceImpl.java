package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.FitnessClubDAO;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.service.impl.FitnessClubService;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubServiceImpl implements FitnessClubService {

    FitnessClubDAO fitnessClubDAO;

    @Override
    public void save(FitnessClub fitnessClub) {
        fitnessClubDAO.save(fitnessClub);
    }

    @Override
    public void update(FitnessClub fitnessClub) {
        fitnessClubDAO.update(fitnessClub);
    }

    @Override
    public FitnessClub findById(int id) {
        return fitnessClubDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        fitnessClubDAO.deleteById(id);
    }
}
