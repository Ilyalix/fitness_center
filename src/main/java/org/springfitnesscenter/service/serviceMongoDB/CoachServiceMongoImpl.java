package org.springfitnesscenter.service.serviceMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.CoachDAOMongoDB;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.service.serviceMongoDB.impl.CoachServiceMongo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachServiceMongoImpl implements CoachServiceMongo {

    CoachDAOMongoDB coachDAO;

    @Override
    public void save(Coach coach) {
        coachDAO.save(coach);
    }

    @Override
    public void update(Coach coach) {
        coachDAO.update(coach);
    }

    @Override
    public Coach findById(int id) {
        return coachDAO.findById(id);
    }

    @Override
    public List<Coach> findAll() {
        return coachDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        coachDAO.deleteById(id);

    }
}
