package com.epam.json.jackson;

import com.epam.json.jackson.parser.JacksonParser;

import java.io.IOException;

public class MainJackson {
    public static void main(String[] args) throws IOException {
        JacksonParser.parsJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
