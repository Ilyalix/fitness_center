package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.VisitDAOMySql;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.service.serviceMySql.impl.NumberOfTraining;
import org.springfitnesscenter.service.serviceMySql.impl.RemainderActivities;
import org.springfitnesscenter.service.serviceMySql.impl.VisitServiceMySql;
import org.springframework.stereotype.Service;



@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class VisitServiceMySqlImpl implements VisitServiceMySql {

    VisitDAOMySql visitDAO;

    RemainderActivities remainderActivities;

    NumberOfTraining numberOfTraining;

    @Override
    public void save(Visit visit) {
        visitDAO.save(visit);
    }

    @Override
    public void update(Visit visit) {
        visitDAO.update(visit);
    }

    @Override
    public Visit findById(int id) {
        return visitDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        visitDAO.deleteById(id);
    }

    @Override
    public String remainderSportsActivities(int id) {
        return remainderActivities.findOfActivities(id);
    }

    @Override
    public String numberOfTraining(int id, String name) {
        return numberOfTraining.findOfNumberOfTraining(id, name);
    }
}
