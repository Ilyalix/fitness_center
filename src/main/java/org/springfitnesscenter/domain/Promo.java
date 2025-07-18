package org.springfitnesscenter.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Promo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promo_id")
    String id;

    String name;

    double kilograms;

    int qtyActivities;

    String nameOfFitnessClub;

    @Enumerated(EnumType.STRING)
    TypeProgram typeProgram;

    @Enumerated(EnumType.STRING)
    ViewProgram viewProgram;

    BigDecimal priceProgram;

    @Version
    private int version;


}
