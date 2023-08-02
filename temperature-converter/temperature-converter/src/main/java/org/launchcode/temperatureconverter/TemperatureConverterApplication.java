package org.launchcode.temperatureconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration

public class TemperatureConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureConverterApplication.class, args);
	}

}
