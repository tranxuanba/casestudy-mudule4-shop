package com.casestudy.repository.loginUser;

import com.casestudy.model.LoginUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginUserRepository extends PagingAndSortingRepository<LoginUser, Long> {
}
