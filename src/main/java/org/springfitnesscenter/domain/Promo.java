package org.springfitnesscenter.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

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
    int id;

    String name;

    double kilograms;

    int qtyActivities;

    @ManyToOne
    @JoinColumn(name = "FK_Program_Club")
    FitnessClub fitnessClub;

    @Enumerated(EnumType.STRING)
    TypeProgram typeProgram;

    @Enumerated(EnumType.STRING)
    ViewProgram viewProgram;

    BigDecimal priceProgram;


}
