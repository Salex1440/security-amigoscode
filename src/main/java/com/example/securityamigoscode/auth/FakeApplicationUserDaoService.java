package com.example.securityamigoscode.auth;

import java.util.Optional;

public class FakeApplicationUserDaoService implements ApplicationUserDao {

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return Optional.empty();
    }
}
