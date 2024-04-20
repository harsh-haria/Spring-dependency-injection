package com.example.dependency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public DependencyApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		System.out.println(colourPrinter.print());
	}

}
