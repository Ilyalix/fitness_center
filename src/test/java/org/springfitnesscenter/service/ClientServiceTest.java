package org.springfitnesscenter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springfitnesscenter.dao.daoMySQL.impl.ClientDAOMySql;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.util.ClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class ClientServiceTest {

    @TestConfiguration
    @ComponentScan(basePackages = "org.springfitnesscenter.*")
    public static class Config {
    }

    @Autowired
    private ClientDAOMySql clientDAOMySql;


    public void testSave(){
        Client client = ClientUtil.creatClient();
        clientDAOMySql.save(client);
    }

    @Test
    void shouldSaveClient() {

        testSave();
        Client client = clientDAOMySql.findById(1);
        Assertions.assertEquals("rambler.ru", client.getEmail().getEmail());
    }
}
