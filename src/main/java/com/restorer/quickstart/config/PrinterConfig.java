package com.restorer.quickstart.config;

import com.restorer.quickstart.services.BluePrinter;
import com.restorer.quickstart.services.GreenPrinter;
import com.restorer.quickstart.services.RedPrinter;
import com.restorer.quickstart.services.impl.EnglishBluePrinter;
import com.restorer.quickstart.services.impl.EnglishGreenPrinter;
import com.restorer.quickstart.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig{
    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }
}
