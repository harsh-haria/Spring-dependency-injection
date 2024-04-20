package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class HindiBluePrinter implements BluePrint {

    @Override
    public String print() {
        return "Neela";
    }
}
