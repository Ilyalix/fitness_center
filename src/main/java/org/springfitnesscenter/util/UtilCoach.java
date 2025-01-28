package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.Coach;

public class UtilCoach {

    public static Coach createCoach() {

        Coach coach = Coach.builder()
                .build();
        coach.setName("Misha");
        coach.setAge(30);

        return coach;
    }
}
