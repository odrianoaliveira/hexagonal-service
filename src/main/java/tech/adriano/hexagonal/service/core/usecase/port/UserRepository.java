package tech.adriano.hexagonal.service.core.usecase.port;

import tech.adriano.hexagonal.service.core.domain.entity.User;

public interface UserRepository {
	
	User create(User user);
	
}
