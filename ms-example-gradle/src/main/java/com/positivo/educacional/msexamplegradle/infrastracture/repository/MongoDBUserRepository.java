package com.positivo.educacional.msexamplegradle.infrastracture.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.positivo.educacional.msexamplegradle.domain.User;
import com.positivo.educacional.msexamplegradle.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@Primary
public class MongoDBUserRepository implements UserRepository {
	
	private final SpringDataMongoUserRepository userRepository;

	@Override
	public Optional<User> findById(UUID id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

}
