package com.my.thymeleftTest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
//localhost:8080/user
public class AdminController {
    @GetMapping("info")
    //localhost:8080/user/login
    public String adminLogin() {
        return"/admin/admininfo";
    }

    @GetMapping("reporty")
    //localhost:8080/user/login
    public String adminRepeportyLogin() {
        return"/admin/adminReporty";
    }



}
