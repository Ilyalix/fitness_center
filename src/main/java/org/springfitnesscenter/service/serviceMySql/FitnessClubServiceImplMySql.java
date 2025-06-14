package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.FitnessClubDAOMySql;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.service.serviceMySql.impl.FitnessClubServiceMySql;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubServiceImplMySql implements FitnessClubServiceMySql {

    FitnessClubDAOMySql fitnessClubDAO;

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
