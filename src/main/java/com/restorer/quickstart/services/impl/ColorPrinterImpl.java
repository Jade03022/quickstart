package com.restorer.quickstart.services.impl;

import com.restorer.quickstart.services.ColorPrinter;
import com.restorer.quickstart.services.RedPrinter;
import com.restorer.quickstart.services.GreenPrinter;
import com.restorer.quickstart.services.BluePrinter;
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
