package org.springfitnesscenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.impl.ClientService;
import org.springfitnesscenter.service.impl.CoachService;
import org.springfitnesscenter.service.impl.FitnessClubService;
import org.springfitnesscenter.service.impl.ProgramService;
import org.springfitnesscenter.util.ClientUtil;
import org.springfitnesscenter.util.UtilFitnessClub;
import org.springfitnesscenter.util.UtilProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

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
/*
    @PersistenceContext
    EntityManager em;*/

/*    @Autowired
    RequestProgramFromClient requestProgramFromClient;*/

  //  @Autowired
 //   FitnessClubService fitnessClubService;

 //   @Autowired
 //   CoachService coachService;

  //  @Autowired
 //   ProgramService programService;

  //  @Autowired
  //  ClientService clientService;

    @Override
    public void run(String... args) throws Exception {



      // FitnessClub fitnessClub = UtilFitnessClub.createFitnessClub();
       // fitnessClubService.save(fitnessClub);

      //  Coach coach = UtilCoach.createCoach();
    //    coachService.save(coach);

      //  Coach coach = coachService.findById(1);
      //  FitnessClub fitnessClub = fitnessClubService.findById(1);
        //Program program = programService.findById(1);

      //  Program program = UtilProgram.createProgram();
     //   program.setCoach(coach);
     //   program.setFitnessClub(fitnessClub);
//        programService.save(program);

   //     Program program1 = programService.findById(2);

  //      Client client = ClientUtil.creatClient();
  //      client.setPrograms(Set.of(program1));

 //       clientService.save(client);


    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringfitnesscenterApplication.class, args);
        logger.info("start");
    }
}
