package com.casestudy.repository.admin;

import com.casestudy.model.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRoleRepo extends CrudRepository<UserRole, Long> {
    UserRole findByName(String name);
}
