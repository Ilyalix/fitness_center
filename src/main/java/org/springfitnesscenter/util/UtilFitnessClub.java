package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.Address;
import org.springfitnesscenter.domain.Email;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.domain.Phone;

import java.util.List;

public class UtilFitnessClub {

  public static FitnessClub createFitnessClub(){

      Email emailOfFitnessClubFit = Email
               .builder()
                .email("gmail.com")
               .build();

        Phone phoneFintessClub1 = Phone
                .builder()
               .phone("777")
                .build();
       Phone phoneFintessClub2 = Phone
               .builder()
                .phone("888")
                .build();

       Address address = Address
               .builder()
                .city("Moskcow")
                .district("Lenina str.5")
                .build();

       FitnessClub gimFit = FitnessClub.builder()
               .name("FitForYou")
               .email(emailOfFitnessClubFit)
               .active(true)
               .address(address)
               .phones(List.of(phoneFintessClub1, phoneFintessClub2))
               .build();

      return gimFit;


    }
}
