package com.api.transactionapi.services;

import com.api.transactionapi.domain.User;
import com.api.transactionapi.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
