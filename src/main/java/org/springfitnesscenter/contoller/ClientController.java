package org.springfitnesscenter.contoller;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.service.impl.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/client/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ClientController {

    ClientService clientService;

    @PostMapping(value = "save")
    public void save (@Valid @RequestBody Client client){
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
}
