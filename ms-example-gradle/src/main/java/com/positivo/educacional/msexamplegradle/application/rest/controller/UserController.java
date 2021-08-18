package com.positivo.educacional.msexamplegradle.application.rest.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.positivo.educacional.msexamplegradle.application.client.IdenticonClient;
import com.positivo.educacional.msexamplegradle.application.rest.request.CreateUserRequest;
import com.positivo.educacional.msexamplegradle.application.rest.response.UserResponse;
import com.positivo.educacional.msexamplegradle.domain.User;
import com.positivo.educacional.msexamplegradle.domain.exception.EntityNotFoundException;
import com.positivo.educacional.msexamplegradle.domain.exception.InvalidUserFieldsException;
import com.positivo.educacional.msexamplegradle.domain.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

	private final UserService userService;
	private final IdenticonClient identiconClient;
	
	@PostMapping
	public UserResponse createOrder(@RequestBody @Valid final CreateUserRequest createUserRequest) throws InvalidUserFieldsException {
		User user = userService.createUser(createUserRequest.getName(), createUserRequest.getEmail());
		
		return new UserResponse().withId(user.getId().toString());
	}

	@DeleteMapping(value = "/{id}")
	public void deleteProduct(@PathVariable final UUID id) throws EntityNotFoundException {
		userService.deleteById(id);
	}

	@GetMapping("/{id}")
	public UserResponse findUser(@PathVariable final UUID id) throws EntityNotFoundException {
		User user = userService.findById(id);
		String icon = identiconClient.getIdenticonForUser(id.toString()); 
		return new UserResponse()
					.withName(user.getName())
					.withEmail(user.getEmail())
					.withId(user.getId().toString())
					.withIcon(icon);
	}
}
