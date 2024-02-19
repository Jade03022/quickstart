package com.restorer.colorsapplication.services.impl;

import com.restorer.colorsapplication.services.RedPrinter;
import com.restorer.colorsapplication.services.ColorPrinter;
import com.restorer.colorsapplication.services.GreenPrinter;
import com.restorer.colorsapplication.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter{
    public RedPrinter redPrinter;
    public GreenPrinter greenPrinter;
    public BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter){
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
