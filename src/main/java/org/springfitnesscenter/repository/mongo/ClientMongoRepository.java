package org.springfitnesscenter.repository.mongo;

import org.springfitnesscenter.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMongoRepository extends MongoRepository<Client, Integer> {

}
