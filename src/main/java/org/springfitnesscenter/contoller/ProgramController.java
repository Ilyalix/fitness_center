package org.springfitnesscenter.contoller;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.serviceMySql.impl.ProgramServiceMySql;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/program/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramController {

    ProgramServiceMySql programService;

    @Secured("ROLE_ADMIN")
    @PostMapping (value = "save")
    public void save(@Valid @RequestBody Program program){
        programService.save(program);
    }

    @Secured("ROLE_ADMIN")
    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Program program){
        programService.update(program);
    }

    @Secured("ROLE_ADMIN")
    @GetMapping(value = "{id}")
    public Program findById(@PathVariable(value = "id") int id) {
        return programService.findById(id);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        programService.deleteById(id);
    }


}
