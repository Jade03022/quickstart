package com.restorer.quickstart;

import com.restorer.quickstart.services.ColorPrinter;
import com.restorer.quickstart.services.impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {
    private ColorPrinter colorPrinter;

    public ColorsApplication(ColorPrinter colorPrinter){
        this.colorPrinter = colorPrinter;
    }
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ColorsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(colorPrinter.print());
    }
}
