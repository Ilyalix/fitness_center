package org.springfitnesscenter.service.serviceMySql.impl;

import org.springfitnesscenter.domain.Promo;

public interface EmailService {
    void sendEmail(Promo promo);

}
