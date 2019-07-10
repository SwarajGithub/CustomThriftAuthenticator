package com.authenticator;

/**
 * Created by sshekhar on 8/25/16.
 */
public class CAuthenticate {

    public boolean authenticate(String userName, char[] password){
        if("Swaraj".equalsIgnoreCase(userName))
            return true;
        return false;
    }
}
