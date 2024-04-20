package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class HindiRedPrinter implements RedPrint{
    @Override
    public String print() {
        return "Laal";
    }
}
