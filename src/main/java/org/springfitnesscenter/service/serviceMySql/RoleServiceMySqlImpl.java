package org.springfitnesscenter.service.serviceMySql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.daoMySQL.impl.RoleDAOMySql;
import org.springfitnesscenter.domain.Role;
import org.springfitnesscenter.service.serviceMySql.impl.RoleServiceMySql;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class RoleServiceMySqlImpl implements RoleServiceMySql {

    RoleDAOMySql roleDAO;

    @Override
    public void save(Role role) {
        roleDAO.save(role);
    }

    @Override
    public void update(Role role) {
        roleDAO.update(role);
    }

    @Override
    public Role findById(int id) {
        return roleDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        roleDAO.deleteById(id);

    }
}
