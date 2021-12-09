package tech.adriano.hexagonal.service.core.usecase;

import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.domain.event.UserCreatedEvent;
import tech.adriano.hexagonal.service.core.usecase.port.EventPublisher;
import tech.adriano.hexagonal.service.core.usecase.port.UserRepository;

/**
 * This use case should handle all business logic related to create a entity User
 */
public class CreateUser {
	
	private final EventPublisher eventPublisher;
	private final UserRepository userRepository;
	
	
	public CreateUser(EventPublisher eventPublisher,
			UserRepository userRepository) {
		this.eventPublisher = eventPublisher;
		this.userRepository = userRepository;
	}
	
	
	public User create(User user) {
		User created = userRepository.create(user);
		
		eventPublisher.publish(new UserCreatedEvent(created));
		
		return created;
	}
}
