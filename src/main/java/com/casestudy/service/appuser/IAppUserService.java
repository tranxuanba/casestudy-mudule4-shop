package com.casestudy.service.appuser;

import com.casestudy.model.LoginUser;

public interface IAppUserService {
    LoginUser getUserByUserName(String username);
    LoginUser getCurrentUser();
}
