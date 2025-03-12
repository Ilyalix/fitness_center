package org.springfitnesscenter.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Coach;
import org.springfitnesscenter.service.impl.CoachService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/coach/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CoachController {

    CoachService coachService;

    @PostMapping (value = "save")
    public void save(@Valid @RequestBody Coach coach){
        coachService.save(coach);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Coach coach){
        coachService.update(coach);
    }

    @GetMapping(value = "{id}")
    public Coach findById(@PathVariable(value = "id") int id) {
        return coachService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        coachService.deleteById(id);
    }



}
