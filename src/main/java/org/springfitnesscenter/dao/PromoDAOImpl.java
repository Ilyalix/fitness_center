package org.springfitnesscenter.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.PromoDAO;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.repository.PromoRepository;
import org.springfitnesscenter.service.impl.EmailService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class PromoDAOImpl implements PromoDAO {

    PromoRepository promoRepository;

    EmailService emailService;

    @Override
    public void save(Promo promo) {
        promoRepository.save(promo);
        emailService.sendEmail(promo);
    }

    @Override
    public void update(Promo promo) {
        promoRepository.save(promo);
    }

    @Override
    public Promo findById(int id) {
        return promoRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        promoRepository.deleteById(id);
    }
}
