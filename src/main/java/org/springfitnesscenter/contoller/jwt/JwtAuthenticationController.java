package org.springfitnesscenter.contoller.jwt;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Client;
import org.springfitnesscenter.jwt_processing.JwtRequest;
import org.springfitnesscenter.jwt_processing.JwtResponse;
import org.springfitnesscenter.jwt_processing.JwtTokenUtil;
import org.springfitnesscenter.service.impl.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jwt")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class JwtAuthenticationController {

    AuthenticationManager authenticationManager;

    JwtTokenUtil jwtTokenUtil;

    UserDetailsService service;

    ClientService clientService;

    @PostMapping("/authenticate")
    public ResponseEntity<JwtResponse> createAuthenticationToken(@RequestBody JwtRequest request) throws Exception {
        authenticate(request.getLogin(), request.getPassword());
        final UserDetails userDetails = service.loadUserByUsername(request.getLogin());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok((new JwtResponse(token)));
    }

    @PostMapping("/registration")
    public ResponseEntity registration(@RequestBody Client client) throws Exception {
        clientService.save(client);
        return ResponseEntity.ok("OK");
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
