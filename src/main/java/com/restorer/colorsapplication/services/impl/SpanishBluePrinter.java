package com.restorer.colorsapplication.services.impl;

import com.restorer.colorsapplication.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter{
    @Override
    public String print() {
        return "azul";
    }
}
