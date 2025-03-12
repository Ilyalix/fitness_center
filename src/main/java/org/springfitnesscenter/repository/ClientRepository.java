package org.springfitnesscenter.repository;

import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.domain.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository <Client, Integer> {

    @Modifying
    @Query("DELETE FROM Visit c WHERE c.client.id = :a_id")
    void deleteClientFromVisitById(@Param("a_id") int id);

    @Modifying
    @Query("DELETE FROM Client c WHERE c.id = :a_id")
    void deleteClientById (@Param("a_id") int id);

}
