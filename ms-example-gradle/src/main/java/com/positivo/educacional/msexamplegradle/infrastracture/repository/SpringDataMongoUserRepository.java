package com.positivo.educacional.msexamplegradle.infrastracture.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.positivo.educacional.msexamplegradle.domain.User;

public interface SpringDataMongoUserRepository extends MongoRepository<User, UUID>  {

}
