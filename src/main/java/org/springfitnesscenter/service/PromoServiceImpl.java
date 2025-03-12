package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.PromoDAO;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.service.impl.ProgramService;
import org.springfitnesscenter.service.impl.PromoService;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class PromoServiceImpl implements PromoService {

    PromoDAO promoDAO;

    @Override
    public void save(Promo promo) {
        promoDAO.save(promo);
    }

    @Override
    public void update(Promo promo) {
        promoDAO.update(promo);
    }

    @Override
    public Promo findById(int id) {
        return promoDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        promoDAO.deleteById(id);
    }
}
