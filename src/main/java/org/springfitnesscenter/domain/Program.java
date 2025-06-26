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
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    String id;

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

    @ManyToOne
    @JoinColumn(name = "FK_Program_Coach")
    Coach coach;

    @Version
    private int version;
}
