package org.springfitnesscenter.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;


@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@MappedSuperclass
public class Person {

   private String name;
   private int age;

}
