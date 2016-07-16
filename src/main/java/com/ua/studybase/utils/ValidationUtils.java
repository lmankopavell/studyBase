package com.ua.studybase.utils;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by BlackAngel on 27.06.2016.
 */
public final class ValidationUtils {
    private ValidationUtils(){



        throw new NotImplementedException("Utility classes cannot be instantiated");
    }

    public static  void  assertNotBlank(String username, String message){
        if (StringUtils.isBlank(username)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertMinimumLength(String username, int length, String message){
        if (username.length() < length) {
            throw new IllegalArgumentException(message);
        }
    }
    public static void assertMatches(String email, Pattern regex, String message){
        if()
    }

}
