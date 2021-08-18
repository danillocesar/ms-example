package com.positivo.educacional.msexamplegradle.application.rest.response;

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
public class UserResponse {
	private String id;
	private String name;
	private String email;
	private String icon;
}
