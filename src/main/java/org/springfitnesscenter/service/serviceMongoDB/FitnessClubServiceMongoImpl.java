package org.springfitnesscenter.service.serviceMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.FitnessClubDAOMongoDB;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.service.serviceMongoDB.impl.FitnessClubServiceMongo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubServiceMongoImpl implements FitnessClubServiceMongo {

    FitnessClubDAOMongoDB fitnessClubDAO;

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
    public List<FitnessClub> findAll() {
        return fitnessClubDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        fitnessClubDAO.deleteById(id);
    }
}
