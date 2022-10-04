package com.casestudy.service.admin;

import com.casestudy.model.LoginUser;
import com.casestudy.model.UserRole;
import com.casestudy.repository.admin.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    @Autowired
    private IAdminRepo adminRepo;
    @Override
    public Page<LoginUser> findAll(Pageable pageable) {
        return adminRepo.findAllByOrderByIdAsc(pageable);
    }

    @Override
    public Page<LoginUser> findUserRoleName(UserRole userRole, Pageable pageable) {
        return adminRepo.findAllByUserRole(userRole, pageable);
    }
}
