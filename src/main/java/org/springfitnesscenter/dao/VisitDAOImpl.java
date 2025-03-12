package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.VisitDAO;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.repository.VisitRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class VisitDAOImpl implements VisitDAO {

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
