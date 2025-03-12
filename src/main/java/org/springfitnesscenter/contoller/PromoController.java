package org.springfitnesscenter.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.service.impl.PromoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/promo/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class PromoController {

    PromoService promoService;

    @PostMapping(value = "save")
    public void save(@Valid @RequestBody Promo promo){
        promoService.save(promo);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Promo promo){
        promoService.update(promo);
    }

    @GetMapping(value = "{id}")
    public Promo findById(@PathVariable(value = "id") int id) {
        return promoService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        promoService.deleteById(id);
    }
}
