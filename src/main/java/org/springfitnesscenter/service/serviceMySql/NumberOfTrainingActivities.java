package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.service.serviceMySql.impl.NumberOfTraining;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NumberOfTrainingActivities implements NumberOfTraining {

    @PersistenceContext
    EntityManager em;

    @Override
    public String findOfNumberOfTraining(int id, String name) {

        Query numberOfTraining = em.createQuery("SELECT p.name FROM Visit v JOIN v.program p " +
                "JOIN v.client c WHERE c.id =: cl_id AND p.name =: pr_name");
        numberOfTraining.setParameter("cl_id", id);
        numberOfTraining.setParameter("pr_name", name);
        List <String> nameOfPrograms = numberOfTraining.getResultList();
        int size = nameOfPrograms.size();

        return String.valueOf(size);
    }
}
