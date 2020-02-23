package com.iwsx.controller;

import com.iwsx.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by iwsx on 2019/12/27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log= LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+";password:"+password);
        User user=null;
        if ("zwp".equals(username) && "123456".equals(password)) {
            user = new User();
            user.setId(1);
            user.setPassword("123456");
            user.setUserName("zwp");

            log.debug(user.toString());
        }

        model.addAttribute("user", user);
        return "user";
    }
}
