package org.springfitnesscenter.service.serviceMySql.impl;

import org.springfitnesscenter.domain.Visit;

public interface VisitServiceMySql extends CRUDServiceMySql<Visit> {

    String remainderSportsActivities (int id);

    String numberOfTraining (int id, String name);
}
