package com.restorer.quickstart.services.impl;

import com.restorer.quickstart.services.ColorPrinter;
import com.restorer.quickstart.services.RedPrinter;
import com.restorer.quickstart.services.GreenPrinter;
import com.restorer.quickstart.services.BluePrinter;

public class ColorPrinterImpl implements ColorPrinter {
    public RedPrinter redPrinter;
    public GreenPrinter greenPrinter;
    public BluePrinter bluePrinter;

    public ColorPrinterImpl(){
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
