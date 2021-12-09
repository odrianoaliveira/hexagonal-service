package tech.adriano.hexagonal.service.adapter.rest.mapper;

import tech.adriano.hexagonal.service.adapter.rest.dto.UserResource;
import tech.adriano.hexagonal.service.adapter.common.mapper.EntityToDtoMapper;
import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.domain.valueobject.Name;

public class UserToUserResource implements EntityToDtoMapper<User, UserResource> {
	
	@Override
	public User mapToEntity(UserResource source) {
		return User.builder()
				.name(Name.builder().first(source.getName()).build())
				.build();
	}

	@Override
	public UserResource mapToDto(User source) {
		UserResource dto = new UserResource();
		dto.setName(source.getName().getFirst());
		return dto;
	}
}
