package org.springfitnesscenter.dao.daoMySQL;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.VisitDAOMySql;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.repository.mysql.VisitRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class VisitDAOMySqlImpl implements VisitDAOMySql {

    VisitRepository visitRepository;

    @Override
    public void save(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public void update(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public Visit findById(int id) {
        return visitRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        visitRepository.deleteById(id);
    }
}
