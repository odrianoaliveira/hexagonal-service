package tech.adriano.hexagonal.service.adapter.rest.dto;

public class UserResource {
	private String name;

	public String getName() {
		return name;
	}

	public UserResource setName(String name) {
		this.name = name;
		return this;
	}
}
