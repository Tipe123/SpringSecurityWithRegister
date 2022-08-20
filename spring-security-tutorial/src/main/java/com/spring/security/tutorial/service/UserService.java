package com.spring.security.tutorial.service;

import com.spring.security.tutorial.entity.User;
import com.spring.security.tutorial.entity.VerificationToken;
import com.spring.security.tutorial.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);
}
