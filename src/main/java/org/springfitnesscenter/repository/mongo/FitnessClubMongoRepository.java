package org.springfitnesscenter.repository.mongo;

import org.springfitnesscenter.domain.FitnessClub;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessClubMongoRepository extends MongoRepository<FitnessClub, Integer> {

}
