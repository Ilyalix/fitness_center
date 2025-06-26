package org.springfitnesscenter.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Role;
import org.springfitnesscenter.service.serviceMySql.impl.RoleServiceMySql;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/role/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class RoleController {

    RoleServiceMySql roleService;

    @PostMapping (value = "save")
    public void save(@Valid @RequestBody Role role) {
        roleService.save(role);
    }

    @PutMapping(value = "update")
    public void update(@Valid @RequestBody Role role){
        roleService.update(role);
    }

    @GetMapping(value = "{id}")
    public Role findById(@PathVariable(value = "id") int id) {
        return roleService.findById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        roleService.deleteById(id);
    }
}
