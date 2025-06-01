package org.springfitnesscenter.service;


import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.domain.Role;
import org.springfitnesscenter.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    ClientRepository repository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Client client = repository.getById(Integer.valueOf(login));

        return buildUserDetails(client);
    }

    private List<GrantedAuthority> getAuthorities(Set<Role> roles) {
        Function<Role, SimpleGrantedAuthority> function = role -> new SimpleGrantedAuthority(role.getName().name());
        return roles
                .stream()
                .map(function)
                .collect(Collectors.toList());
    }

    private UserDetails buildUserDetails(Client clientName) {
        List<GrantedAuthority> authorities = getAuthorities(clientName.getRoles());

        return new User(String.valueOf(clientName.getId()), clientName.getPassword(), clientName.isActive(), true,
                true, true, authorities);
    }


}
