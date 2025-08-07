package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.Coach;

public class UtilCoach {

    public static Coach createCoach() {

        Coach coach = Coach.builder()
                .name("Misha")
                .age(30)
                .build();
        return coach;
    }
}
