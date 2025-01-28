package org.springfitnesscenter.service.impl;

import org.springfitnesscenter.domain.RequestClient;

import java.util.List;

public interface CRUDService<T> {

    String[] findProgramByCoach(RequestClient requestFromClient);

    List<String> findProgramByAgeAndIntensive(RequestClient requestFromClient);

    List<String> findProgramByPrice(RequestClient requestFromClient);

    List<String> findProgramByName(RequestClient requestFromClient);


}
