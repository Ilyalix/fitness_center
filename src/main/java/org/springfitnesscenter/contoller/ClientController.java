package org.springfitnesscenter.contoller;


import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.service.serviceMongoDB.impl.ClientServiceMongo;
import org.springfitnesscenter.service.serviceMySql.impl.ClientServiceMySql;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientController {

    ClientServiceMySql clientService;

    ClientServiceMongo serviceMongo;

    @PostMapping(value = "save")
    public void save (@Valid @RequestBody Client client)  {
        clientService.save(client);
    }

    @PutMapping(value = "update")
    public void update (@Valid @RequestBody Client client){
        clientService.update(client);
    }

    @GetMapping(value = "{id}")
    public Client findById (@PathVariable(value = "id") int id) {
       return clientService.findById(id);
    }


    @DeleteMapping(value = "{id}")
    public void deleteById (@PathVariable(value = "id") int id) {
        clientService.deleteById(id);
    }

    @GetMapping(value = "name/{prog}")
    public List<Client> findClientsByProgram (@PathVariable(value = "prog") String name) {
        return clientService.findClientsByProgram(name);
    }

    @GetMapping(value = "phone/{number}")
    public List<Client> findClientsByPhone (@PathVariable(value = "number") String name) {
        return clientService.findClientsByPhone(name);
    }


    @Secured("ROLE_ADMIN")
    @PostMapping(value = "/mongo/save")
    public void mongoDBsave (@Valid @RequestBody Client client)  {
        serviceMongo.save(client);
    }

    @Secured("ROLE_ADMIN")
    @PutMapping(value = "/mongo/update")
    public void mongoDBupdate (@Valid @RequestBody Client client)  {
        serviceMongo.update(client);
    }

    @GetMapping(value = "findAll/mongo/")
    public List<Client> findAll () {
        return serviceMongo.findAll();
    }

    @GetMapping(value = "mongo/{id}")
    public Client findByIdMongo (@PathVariable(value = "id") int id) {
        return serviceMongo.findById(id);
    }

}
