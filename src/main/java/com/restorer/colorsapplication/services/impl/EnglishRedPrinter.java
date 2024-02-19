package com.restorer.colorsapplication.services.impl;

import com.restorer.colorsapplication.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter{
    @Override
    public String print(){
        return "red";
    }
}
