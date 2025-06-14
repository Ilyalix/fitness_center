package org.springfitnesscenter.repository.mongo;

import org.springfitnesscenter.domain.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramMongoRepository extends MongoRepository<Program, Integer> {

}
