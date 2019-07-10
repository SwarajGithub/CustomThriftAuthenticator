package com.custom.thriftAuthenticator;

import javax.security.sasl.AuthenticationException;

import com.authenticator.CAuthenticate;
import org.apache.hadoop.conf.Configured;
import org.apache.hive.service.auth.PasswdAuthenticationProvider;

/**
 * Created by sshekhar on 8/25/16.
 */
public class CThriftAuthenticator extends Configured implements PasswdAuthenticationProvider {
    @Override
    public void Authenticate(String userName, String password) throws AuthenticationException {
        if (!new CAuthenticate().authenticate(userName, password.toCharArray()))
            throw new AuthenticationException("Invalid credentials");
    }
}
