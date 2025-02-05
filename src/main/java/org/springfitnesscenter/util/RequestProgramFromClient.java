package org.springfitnesscenter.util;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.RequestClient;
import org.springfitnesscenter.domain.TypeProgram;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.function.IntFunction;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestProgramFromClient {
   /* @Override
    public String[] findProgramByCoach(RequestClient requestFromClient) {
        return new String[0];
    }

    @Override
    public List<String> findProgramByAgeAndIntensive(RequestClient requestFromClient) {
        return null;
    }

    @Override
    public List<String> findProgramByPrice(RequestClient requestFromClient) {
        return null;
    }

    @Override
    public List<String> findProgramByName(RequestClient requestFromClient) {
        return null;
    }
    /*
    @PersistenceContext
    EntityManager em;

    @Override
    public String [] findProgramByCoach (RequestClient requestFromClient){

        TypedQuery<String> query = em.createQuery(
                "SELECT e.name " +
                "FROM MatchingAd m " +
                "JOIN m.program e " +
                "WHERE m.coach.name LIKE CONCAT('%', :ad_coach, '%')", String.class);
        query.setParameter("ad_coach", requestFromClient.getCoach());

        IntFunction<String[]> function = size -> new String[size];
        return query.getResultList().toArray(function);


    }

    @Override
    public List<String> findProgramByAgeAndIntensive(RequestClient requestFromClient) {

        if (requestFromClient.getAge() >= 45) {
            TypedQuery<String> query = em.createQuery(
                    "SELECT e.name " +
                            "FROM MatchingAd m " +
                            "JOIN m.program e " +
                            "WHERE e.typeProgram = :type", String.class);
            query.setParameter("type", TypeProgram.MEDIUM);
            List<String> resultList = query.getResultList();
            return resultList;

        }

        if (requestFromClient.getAge() < 45) {
            TypedQuery<String> query = em.createQuery(
                    "SELECT e.name " +
                            "FROM MatchingAd m " +
                            "JOIN m.program e " +
                            "WHERE e.typeProgram = :type", String.class);
            query.setParameter("type", TypeProgram.INTENSIVE);
            List<String> resultList = query.getResultList();
            return resultList;

        }

        return List.of("Program not found");
    }

    @Override
    public List<String> findProgramByPrice (RequestClient requestFromClient){

        TypedQuery<String> query = em.createQuery(
                "SELECT e.name " +
                        "FROM MatchingAd m " +
                        "JOIN m.program e " +
                        "WHERE (:ad_price BETWEEN m.priceFrom AND m.priceTo) ", String.class);
        query.setParameter("ad_price", requestFromClient.getPriceClient());
        List<String> resultList = query.getResultList();
        return resultList;

    }

    @Override
    public List<String> findProgramByName (RequestClient requestFromClient) {

        TypedQuery<String> query = em.createQuery(
                "SELECT e.name " +
                        "FROM MatchingAd m " +
                        "JOIN m.program e " +
                        "WHERE e.name =: r_name ", String.class);
        query.setParameter("r_name", requestFromClient.getNameOfProgram());
        List<String> resultList = query.getResultList();
        return resultList;
    }*/

}
