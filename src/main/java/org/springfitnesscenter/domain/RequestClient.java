package org.springfitnesscenter.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class RequestClient {

    int currentWeight;
    int desiredWeight;
    int timeLoseWeight;
    int height;
    int age;
    BigDecimal price;
}

/**
 * Programm_1:
 *
 * 500 g per visit
 * 3 times per week

 * Programm_2:
 *
 * 1000 g per visit
 * 3 times per week
 *
 * Client:
 *
 * weight from 50 to 45
 */
