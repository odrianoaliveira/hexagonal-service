package tech.adriano.hexagonal.service.core.domain.event;

import tech.adriano.hexagonal.service.core.domain.entity.User;

public final class UserCreatedEvent implements Event {
	
	private final User user;
	
	
	public UserCreatedEvent(User user) {
		this.user = user;
	}
	
	
	public User getUser() {
		return user;
	}
}
