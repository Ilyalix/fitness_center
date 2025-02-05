package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.domain.TypeProgram;
import org.springfitnesscenter.domain.ViewProgram;

import java.math.BigDecimal;

public class UtilProgram {

    public static Program createProgram(){

        Program gimForYou = Program.builder()
                .name("GimForYou")
                .kilograms(0.1)
                .qtyActivities(4)
                .priceProgram(BigDecimal.valueOf(1500))
                .typeProgram(TypeProgram.INTENSIVE)
                .viewProgram(ViewProgram.CROSS_FIT)
                .build();

        return gimForYou;

    }
}
