package com.restorer.quickstart.services.impl;

import com.restorer.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter{
    @Override
    public String print() {
        return "azul";
    }
}
