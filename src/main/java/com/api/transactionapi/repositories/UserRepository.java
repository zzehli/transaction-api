package com.api.transactionapi.repositories;

import com.api.transactionapi.domain.User;
import com.api.transactionapi.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getAccountNumByEmail(String email);

    User findById(Integer userId);
}
