package com.restorer.quickstart.config;

import com.restorer.quickstart.services.BluePrinter;
import com.restorer.quickstart.services.ColorPrinter;
import com.restorer.quickstart.services.GreenPrinter;
import com.restorer.quickstart.services.RedPrinter;
import com.restorer.quickstart.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig{
    /*
    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new SpanishBluePrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter){
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
    */
}
