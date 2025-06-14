package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.PromoDAOMySql;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.service.serviceMySql.impl.PromoServiceMySql;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class PromoServiceMySqlImpl implements PromoServiceMySql {

    PromoDAOMySql promoDAO;

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
