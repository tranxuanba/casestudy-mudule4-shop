package com.casestudy.repository.admin;

import com.casestudy.model.LoginUser;
import com.casestudy.model.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IAdminRepo extends PagingAndSortingRepository<LoginUser, Long> {
    Page<LoginUser> findAllByUserRole(UserRole userRole, Pageable pageable);
    Page<LoginUser> findAllByOrderByIdAsc(Pageable pageable);
}
