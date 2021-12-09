package tech.adriano.hexagonal.service.adapter.persistence.mapper;

import tech.adriano.hexagonal.service.adapter.persistence.dto.UserInfo;
import tech.adriano.hexagonal.service.adapter.common.mapper.EntityToDtoMapper;
import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.domain.valueobject.Name;

public class UserToUserInfo implements EntityToDtoMapper<User, UserInfo> {
	
	@Override
	public User mapToEntity(UserInfo source) {
		return User.builder()
				.id(source.getManagedId())
				.name(Name.builder().first(source.getFirstName()).last(source.getLastName()).build())
				.build();
	}
	
	
	@Override
	public UserInfo mapToDto(User source) {
		return UserInfo.builder()
				.id(source.getId().toString())
				.firstName(source.getName().getFirst())
				.lastName(source.getName().getLast())
				.builder();
	}
}
