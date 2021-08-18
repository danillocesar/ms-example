package com.positivo.educacional.msexamplegradle.domain.service;

import java.util.UUID;

import com.positivo.educacional.msexamplegradle.domain.User;
import com.positivo.educacional.msexamplegradle.domain.exception.EntityNotFoundException;
import com.positivo.educacional.msexamplegradle.domain.exception.InvalidUserFieldsException;
import com.positivo.educacional.msexamplegradle.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	
	public User createUser(String name, String email) throws InvalidUserFieldsException {
		
		User user = new User().withEmail(email).withName(name);
		
		if(validateUserRequiredFields(user)) throw new InvalidUserFieldsException();
		
		user.setId(UUID.randomUUID());
		
		return userRepository.save(user);
	}

	public void deleteById(UUID id) throws EntityNotFoundException {
		userRepository.delete(findById(id));
	}

	public User findById(UUID id) throws EntityNotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
	}

	private boolean validateUserRequiredFields(User user) {
		return (user.getEmail() == null || user.getEmail().isEmpty()) || 
			   (user.getName() == null || user.getName().isEmpty());
		
	}

}
