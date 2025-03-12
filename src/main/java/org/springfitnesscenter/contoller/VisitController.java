package org.springfitnesscenter.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Visit;
import org.springfitnesscenter.service.impl.VisitService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/visit/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class VisitController {

    VisitService visitService;

    @PostMapping (value = "save")
    public void save(@Valid @RequestBody Visit visit){
        visitService.save(visit);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Visit visit){
        visitService.update(visit);
    }

    @GetMapping(value = "{id}")
    public Visit findById(@PathVariable(value = "id") int id) {
        return visitService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        visitService.deleteById(id);
    }

    @GetMapping(value = "client/{id_c}")
    public String findReminderSportActivities(@PathVariable(value = "id_c") int id) {
        return visitService.remainderSportsActivities(id);
    }

    @GetMapping(value = "client/{id_c}/{p_name}")
    public String findNumberOfVisits(@PathVariable(value = "id_c") int id, @PathVariable(value = "p_name") String name) {
        return visitService.numberOfTraining(id, name);
    }


}
