package com.rajkhare.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private final UserPersistenceService persistenceService = new UserPersistenceService();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        UserParser userParser = new UserParser();
        User user = userParser.parseUserFromJson(userJson);

        UserValidator userValidator =  new UserValidator();
        boolean validateUser = userValidator.validateUser(user);

        if(! validateUser) {
            return "ERROR";
        }

        persistenceService.saveUser(user);

        return "SUCCESS";
    } 



}