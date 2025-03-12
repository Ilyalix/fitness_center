package org.springfitnesscenter.contoller;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.FitnessClub;
import org.springfitnesscenter.service.impl.FitnessClubService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/fitness/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FitnessClubController {

    FitnessClubService fitnessClubService;

    @PostMapping(value = "save")
    public void save(@Valid @RequestBody FitnessClub fitnessClub) {
        fitnessClubService.save(fitnessClub);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody FitnessClub fitnessClub) {
        fitnessClubService.update(fitnessClub);
    }

    @GetMapping(value = "{id}")
    public FitnessClub findById(@PathVariable(value = "id") int id) {
       return fitnessClubService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        fitnessClubService.deleteById(id);
    }



}
