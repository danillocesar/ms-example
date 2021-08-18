package com.positivo.educacional.msexamplegradle.application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "identicon", url = "https://api.kwelo.com/v1/media/identicon")
public interface IdenticonClient {

	@GetMapping("/{query}")
	public String getIdenticonForUser(@PathVariable("query") String query);
}
