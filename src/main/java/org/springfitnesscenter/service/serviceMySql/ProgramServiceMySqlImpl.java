package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.ProgramDAOMySql;
import org.springfitnesscenter.domain.Program;
import org.springfitnesscenter.service.serviceMySql.impl.ProgramServiceMySql;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ProgramServiceMySqlImpl implements ProgramServiceMySql {

    ProgramDAOMySql programDAO;

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
