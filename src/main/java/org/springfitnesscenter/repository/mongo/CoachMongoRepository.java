package org.springfitnesscenter.repository.mongo;

import org.springfitnesscenter.domain.Coach;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachMongoRepository extends MongoRepository<Coach, Integer> {

}
