package com.ray.ssm.controller;

import com.ray.ssm.entity.User;
import com.ray.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller("userController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login.jsp";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) {
        User user = userService.login(username, password);
        if (user!=null) {
            session.setAttribute("USER", user);
            return "redirect:list";
        }else  return "toLogin";
    }

}
