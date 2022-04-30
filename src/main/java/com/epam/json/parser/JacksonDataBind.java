package com.epam.json.parser;


import com.epam.json.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parsJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = null;

        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);

    }
}
