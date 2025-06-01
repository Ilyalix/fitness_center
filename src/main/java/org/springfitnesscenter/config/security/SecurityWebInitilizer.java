package org.springfitnesscenter.config.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebInitilizer extends AbstractSecurityWebApplicationInitializer {
    public SecurityWebInitilizer() {
        super(SecurityConfig.class);
    }
}
