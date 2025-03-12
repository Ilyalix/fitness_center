package org.springfitnesscenter.service.impl;

import org.springfitnesscenter.domain.Visit;

public interface VisitService extends CRUDService<Visit>{

    String remainderSportsActivities (int id);

    String numberOfTraining (int id, String name);
}
