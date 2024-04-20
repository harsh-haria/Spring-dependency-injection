package com.example.dependency.config;

import com.example.dependency.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrint bluePrinter() {
        return new HindiBluePrinter();
    }

    @Bean
    public GreenPrint greenPrinter() {
        return new HindiGreenPrinter();
    }

    @Bean
    public RedPrint redPrinter() {
        return new HindiRedPrinter();
    }

    @Bean
    public ColourPrinter colorPrinter(RedPrint redPrint, GreenPrint greenPrint, BluePrint bluePrint) {
        return new ColourPrinterImpl(redPrint, greenPrint, bluePrint);
    }

}
