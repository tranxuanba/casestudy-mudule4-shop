package com.casestudy.controllers;

import com.casestudy.model.LoginUser;
import com.casestudy.service.appuser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DashboardController {
    @Autowired
    private AppUserService appUserService;

    @ModelAttribute("currentUser")
    private LoginUser getCurrentUser() {
        return appUserService.getCurrentUser();
    }

    @GetMapping("/shop")
    public String home() {
        return "/shop/product/list";
    }

    @GetMapping("/admin")
    public String showAdmin() {
        return "/admin/home";
    }
}