package com.ua.studybase.services;

import com.ua.studybase.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * Created by BlackAngel on 27.06.2016.
 */
@Service
public class UserService {


    private static final Logger LOGGER = Logger.getLogger(UserService.class);


    private static final Pattern PASSWORD_REGEX = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}");

    private static final Pattern EMAIL_REGEX = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");


    public User findUserByUserName(String username){


        return null;
    }
}
