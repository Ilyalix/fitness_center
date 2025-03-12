package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.CoachDAO;
import org.springfitnesscenter.dao.impl.CrudDAO;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.service.impl.CoachService;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachServiceImpl implements CoachService {

    CoachDAO coachDAO;

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
