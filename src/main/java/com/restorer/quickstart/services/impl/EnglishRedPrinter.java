package com.restorer.quickstart.services.impl;

import com.restorer.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter{
    @Override
    public String print(){
        return "red";
    }
}
