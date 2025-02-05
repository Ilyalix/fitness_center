package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.ProgramDAO;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.impl.ProgramService;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    ProgramDAO programDAO;


    @Override
    public void save(Program program) {
        programDAO.save(program);
    }

    @Override
    public void update(Program program) {
        programDAO.update(program);
    }

    @Override
    public Program findById(int id) {
        return programDAO.findById(id);
    }


    @Override
    public void deleteById(int id) {
        programDAO.deleteById(id);
    }
}
