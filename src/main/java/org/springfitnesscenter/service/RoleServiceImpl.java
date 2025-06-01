package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.dao.impl.RoleDAO;
import org.springfitnesscenter.domain.Role;
import org.springfitnesscenter.service.impl.RoleService;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    RoleDAO roleDAO;

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
