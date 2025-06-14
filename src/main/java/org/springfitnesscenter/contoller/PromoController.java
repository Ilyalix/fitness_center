package org.springfitnesscenter.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.service.serviceMySql.impl.PromoServiceMySql;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/promo/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class PromoController {

    PromoServiceMySql promoService;

    @Secured("ROLE_ADMIN")
    @PostMapping(value = "save")
    public void save(@Valid @RequestBody Promo promo) throws UnknownHostException {
        promoService.save(promo);
    }

    @Secured("ROLE_ADMIN")
    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Promo promo){
        promoService.update(promo);
    }

    @Secured("ROLE_ADMIN")
    @GetMapping(value = "{id}")
    public Promo findById(@PathVariable(value = "id") int id) {
        return promoService.findById(id);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        promoService.deleteById(id);
    }
}
