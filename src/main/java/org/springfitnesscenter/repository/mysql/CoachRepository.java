package org.springfitnesscenter.repository.mysql;

import org.springfitnesscenter.domain.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository <Coach, Integer> {

}
