package org.springfitnesscenter.repository.mysql;

import org.springfitnesscenter.domain.FitnessClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessClubRepository extends JpaRepository <FitnessClub, Integer> {

}
