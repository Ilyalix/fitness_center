package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.CoachDAOMySql;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.service.serviceMySql.impl.CoachServiceMySql;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachServiceMySqlImpl implements CoachServiceMySql {

    CoachDAOMySql coachDAO;

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
    public void deleteById(int id) {
        coachDAO.deleteById(id);

    }
}
