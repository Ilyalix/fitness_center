package org.springfitnesscenter.service.serviceMongoDB;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMongoDB.impl.ProgramDAOMongoDB;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.serviceMongoDB.impl.ProgramServiceMongo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramServiceMongolmpl implements ProgramServiceMongo {

    ProgramDAOMongoDB programDAO;

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
    public List<Program> findAll() {
        return programDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        programDAO.deleteById(id);
    }
}
