package com.example.dependency;

public class EnglishRedPrinter implements RedPrint {
    public EnglishRedPrinter(){}


    @Override
    public String print() {
        return "Red";
    }
}
