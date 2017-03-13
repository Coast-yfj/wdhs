package com.luculent.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by luculent on 2017/3/9.
 */
public class SecurityInitializer  extends AbstractSecurityWebApplicationInitializer {
    public SecurityInitializer() {
        super(SecurityConfig.class, SessionConfig.class);
    }
}
