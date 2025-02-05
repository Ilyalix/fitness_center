package org.springfitnesscenter.util;

import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.domain.Email;
import org.springfitnesscenter.domain.Person;
import org.springfitnesscenter.domain.Phone;

import java.util.List;

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

        Client client = Client.builder()
                .phones(List.of(phone1,phone2))
                .email(email)
                .active(true)
                .name("Sasha")
                .age(45)
                .build();

        return client;

    }
}
