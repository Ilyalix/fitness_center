package org.springfitnesscenter.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@MappedSuperclass
public class Person {

   @NotNull
   @Size(max = 10, message = "size should by below then 10 symbols")
   private String name;

   @Max(100)
   @PositiveOrZero
   private int age;

}
