package org.springfitnesscenter.repository;

import org.springfitnesscenter.domain.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository <Coach, Integer> {

}
