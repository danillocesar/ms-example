package com.positivo.educacional.msexamplegradle.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.positivo.educacional.msexamplegradle.domain.User;

public interface UserRepository {

	Optional<User> findById(UUID id);

	User save(User user);
	
	void delete(User user);
}
