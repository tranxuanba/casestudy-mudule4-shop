package com.casestudy.service.appuser;

public interface IAppUserService {
    LoginUser getUserByUserName(String username);
    LoginUser getCurrentUser();
}
