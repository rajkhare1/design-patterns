package com.rajkhare.solid.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserParser {

    public User parseUserFromJson(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(userJson, User.class);
    }

}
