package com.casestudy.service.admin;

import com.casestudy.model.LoginUser;
import com.casestudy.model.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAdminService {
    Page<LoginUser> findAll(Pageable pageable);
    Page<LoginUser> findUserRoleName(UserRole userRole, Pageable pageable);
}
