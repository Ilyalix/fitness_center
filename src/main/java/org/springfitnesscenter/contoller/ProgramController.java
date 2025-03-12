package org.springfitnesscenter.contoller;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.impl.ProgramService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/program/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramController {

    ProgramService programService;

    @PostMapping (value = "save")
    public void save(@Valid @RequestBody Program program){
        programService.save(program);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Program program){
        programService.update(program);
    }

    @GetMapping(value = "{id}")
    public Program findById(@PathVariable(value = "id") int id) {
        return programService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        programService.deleteById(id);
    }


}
