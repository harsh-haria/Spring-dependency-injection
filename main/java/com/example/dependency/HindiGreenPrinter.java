package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class HindiGreenPrinter implements GreenPrint{

    @Override
    public String print() {
        return "Hara";
    }
}
