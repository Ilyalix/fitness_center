package org.springfitnesscenter.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Coach extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_id")
    int id;


    @Version
    private int version;
    
}
