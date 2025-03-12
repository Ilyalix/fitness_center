package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.VisitDAOImpl;
import org.springfitnesscenter.dao.impl.VisitDAO;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.service.impl.NumberOfTraining;
import org.springfitnesscenter.service.impl.RemainderActivities;
import org.springfitnesscenter.service.impl.VisitService;
import org.springframework.stereotype.Service;



@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class VisitServiceImpl implements VisitService {

    VisitDAO visitDAO;

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

    @Override // сколько осталось посещений для достижения цели
    public String remainderSportsActivities(int id) {
        return remainderActivities.findOfActivities(id);
    }

    @Override // сколько посетил занятий
    public String numberOfTraining(int id, String name) {
        return numberOfTraining.findOfNumberOfTraining(id, name);
    }
}
