package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.*;

import java.util.List;
import java.util.Set;

public class ClientUtil {

    public static Client creatClient(){

        Email email = Email.builder()
                .email("rambler.ru")
                .build();

        Phone phone1 = Phone.builder()
                .phone("777")
                .build();

        Phone phone2 = Phone.builder()
                .phone("888")
                .build();

        Role role = Role.builder()
                .name(RoleName.ROLE_ADMIN)
                .build();

        Program program = UtilProgram.createProgram();


        Client client = Client.builder()
                .name("Sasha")
                .age(45)
                .password("123456")
                .height(180.1)
                .actualWeight(95.6)
                .desiredWeight(80.0)
                .phones(List.of(phone1,phone2))
                .email(email)
                .roles(Set.of(role))
                .programs(Set.of(program))
                .active(true)
                .build();
        return client;
    }
}
