package com.positivo.educacional.msexamplegradle.domain.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.positivo.educacional.msexamplegradle.domain.User;

public interface UserRepository extends MongoRepository<User, UUID> {

}
