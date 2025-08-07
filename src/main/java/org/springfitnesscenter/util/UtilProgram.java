package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.*;

import java.math.BigDecimal;

public class UtilProgram {

    public static Program createProgram(){

        Coach coach = Coach.builder()
                .name("Misha")
                .age(30)
                .build();

        FitnessClub fitnessClub = UtilFitnessClub.createFitnessClub();

        Program gimForYou = Program.builder()
                .name("GimForYou")
                .kilograms(0.1)
                .qtyActivities(4)
                .priceProgram(BigDecimal.valueOf(1500))
                .typeProgram(TypeProgram.INTENSIVE)
                .viewProgram(ViewProgram.CROSS_FIT)
                .coach(coach)
                .fitnessClub(fitnessClub)
                .build();

        return gimForYou;

    }
}
