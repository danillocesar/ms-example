package com.positivo.educacional.msexamplegradle.infrastracture;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.positivo.educacional.msexamplegradle.domain.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDBConfiguration {

}
