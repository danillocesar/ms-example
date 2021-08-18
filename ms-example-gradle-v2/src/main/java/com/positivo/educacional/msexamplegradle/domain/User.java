package com.positivo.educacional.msexamplegradle.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@With
public class User {
	private UUID id;
	private String name;
	private String email;
	
}
