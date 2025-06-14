package org.springfitnesscenter.repository.mysql;

import org.springfitnesscenter.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

    @Modifying
    @Query("DELETE FROM Visit c WHERE c.client.id = :a_id")
    void deleteClientFromVisitById(@Param("a_id") int id);

    @Modifying
    @Query("DELETE FROM Client c WHERE c.id = :a_id")
    void deleteClientById (@Param("a_id") int id);

    @Query("FROM Client c JOIN c.programs p WHERE p.name = :a_name")
    List<Client> findClientsByProgram(@Param("a_name") String name);

    @Query("FROM Client c JOIN c.phones p WHERE p.phone = :a_phone")
    List<Client> findClientsByPhone(@Param("a_phone") String name);

    Client findByName(String name);


}
