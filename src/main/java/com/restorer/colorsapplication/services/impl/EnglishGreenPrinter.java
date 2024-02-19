package com.restorer.colorsapplication.services.impl;

import com.restorer.colorsapplication.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter{
    @Override
    public String print(){
        return "green";
    }
}
