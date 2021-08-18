package com.positivo.educacional.msexamplegradle.infrastracture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.positivo.educacional.msexamplegradle.domain.repository.UserRepository;
import com.positivo.educacional.msexamplegradle.domain.service.UserService;

@Configuration
public class BeanConfiguration {

	@Bean
	public UserService userServiceBean(UserRepository userRepository) {
		return new UserService(userRepository);
	}
}
