package org.springfitnesscenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springfitnesscenter.domain.*;
import org.springfitnesscenter.service.impl.RequestProgramFromClient;
import org.springfitnesscenter.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

/*@SpringBootApplication
public class SpringfitnesscenterApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringfitnesscenterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringfitnesscenterApplication.class, args);
        logger.info("start");
    }
}*/

@Transactional
@SpringBootApplication
public class SpringfitnesscenterApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SpringfitnesscenterApplication.class);

    @PersistenceContext
    EntityManager em;

    @Autowired
    RequestProgramFromClient requestProgramFromClient;

    @Override
    public void run(String... args) throws Exception {

        /*FitnessClub fitnessClub = UtilFitnessClub.createFitnessClub();

        Coach coach = UtilCoach.createCoach();

        Program program = UtilProgram.createProgram();
        program.setFitnessClub(fitnessClub);
        program.setCoach(coach);

        coach.setProgramList(List.of(program));

        Client client = ClientUtil.creatClient();

        MatchingAd matching = MatchingUtil.createMatching();
        matching.setClient(client);
        matching.setProgram(program);
        matching.setCoach(coach);
*/
  /*      em.persist(fitnessClub);
        em.persist(coach);
        em.persist(program);
        em.persist(client);
        em.persist(matching);*/

      //  RequestClient requestFromClient = UtilRequestFromClient.createRequestFromClient();
       // String [] programByCoach = requestProgramFromClient.findProgramByCoach(requestFromClient);
      //  List programByCoach = requestProgramFromClient.findProgramByAgeAndIntensive(requestFromClient);
        //  List programByAgeAndIntensive = requestProgramFromClient.findProgramByAgeAndIntensive(requestFromClient);
       //   List programByPrice = requestProgramFromClient.findProgramByPrice(requestFromClient);
       //    List programByName = requestProgramFromClient.findProgramByName(requestFromClient);

      //  programByName.stream().forEach(System.out::println);

 /*       for(Object x : programByCoach){
            System.out.println(x);
        }*/
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringfitnesscenterApplication.class, args);
        logger.info("start");
    }
}
