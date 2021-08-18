package com.positivo.educacional.msexamplegradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsExampleGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsExampleGradleApplication.class, args);
	}

}
