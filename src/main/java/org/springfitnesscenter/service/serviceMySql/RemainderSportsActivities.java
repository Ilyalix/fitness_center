package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.serviceMySql.impl.RemainderActivities;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RemainderSportsActivities implements RemainderActivities {

    @PersistenceContext
    EntityManager em;
    @Override
    public String findOfActivities(int id) {


        Query desiredWeightOfClient = em.createQuery("SELECT cl.desiredWeight FROM Visit a JOIN a.client cl WHERE cl.id =: cl_id");
        desiredWeightOfClient.setParameter("cl_id", id);
        List <Double> desiredWeightOfClientList = desiredWeightOfClient.getResultList();
        if(desiredWeightOfClientList.isEmpty() || desiredWeightOfClientList.get(0)==0){
            return "Клиент не указал желаемый вес";
        }
        Double desiredWeight = desiredWeightOfClientList.get(0);


        Query actualWeightOfClient = em.createQuery("SELECT c.actualWeight FROM Visit c JOIN c.client cl WHERE cl.id =: cl_id");
        actualWeightOfClient.setParameter("cl_id", id);
        List <Double> actualWeightOfClientList = actualWeightOfClient.getResultList();
        int size = actualWeightOfClientList.size();
        if(actualWeightOfClientList.isEmpty() || actualWeightOfClientList.get(size-1) == 0){
            return "Клиент не указал актуальный вес после посещения фитнеса";
        }
        Double actualWeight = actualWeightOfClientList.get(size-1);


        Query killoOfPog = em.createQuery("SELECT c.programs FROM Client c WHERE c.id =: cl_id");
        killoOfPog.setParameter("cl_id", id);
        List <Program> programs = killoOfPog.getResultList();
        if(programs.isEmpty()){
            return "Клиент не подписан на программы";
        }
        List<String> nameOfPrograms = programs.stream().map(m -> m.getName()).collect(Collectors.toList());
        List<Double> kiloOfPrograms = programs.stream().map(m -> m.getKilograms()).collect(Collectors.toList());

        if (actualWeight <= desiredWeight) {
            return "Вы добились желаемого веса!";
        }
        if (actualWeight >= desiredWeight) {
            double difference = actualWeight - desiredWeight;

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < programs.size(); i++) {
               double numberOfvisits = difference / kiloOfPrograms.get(i);
               double floor = Math.floor(numberOfvisits);
               String number = Double.toString(floor);
               builder.append("Количество посещений по " + String.valueOf(nameOfPrograms.get(i)) + " программе " + number + " раз!");
            }
            return builder.toString();
        }

        return "Введите корректные данные";
    }
}
