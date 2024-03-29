package com.ll.sbb20240111;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class Sbb20240111Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbb20240111Application.class, args);
	}

}
