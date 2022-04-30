package com.epam.json.gson;

import com.epam.json.gson.parser.GsonParser;

import java.io.IOException;

public class MainG {
    public static void main(String[] args) throws IOException {
        GsonParser.parsJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
