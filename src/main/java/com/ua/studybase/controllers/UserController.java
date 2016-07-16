package com.ua.studybase.controllers;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.Principal;

/**
 * Created by BlackAngel on 27.06.2016.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public UserInfoDTO getUserInfo(Principal principal){
        User user = userService.findUserByUserName(principal.getName());
    }
}
