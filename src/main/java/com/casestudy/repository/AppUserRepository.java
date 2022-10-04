package com.casestudy.repository;

import com.casestudy.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<LoginUser, Long> {
    LoginUser getLoginUserByUsername(String username);
}
