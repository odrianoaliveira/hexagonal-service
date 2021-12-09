package tech.adriano.hexagonal.service.adapter.persistence;

import tech.adriano.hexagonal.service.adapter.persistence.dto.UserInfo;
import tech.adriano.hexagonal.service.adapter.persistence.mapper.UserToUserInfo;
import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.usecase.port.UserRepository;


/**
 * this implements the {@link UserRepository}
 * see Port/Adapter pattern
 */
public class UserRepositoryImpl implements UserRepository {
	
	private final UserToUserInfo userToUserInfo;
	
	
	public UserRepositoryImpl(UserToUserInfo userToUserInfo) {
		this.userToUserInfo = userToUserInfo;
	}
	
	
	@Override
	public User create(User user) {
		UserInfo userInfo = userToUserInfo.mapToDto(user);
		
		//frameworkDB.save(userInfo); <= UserInfo is a record, with a bunch of getter and setter
		//                                and all framework specific annotations, like @Id @Entity and so on
		
		return userToUserInfo.mapToEntity(userInfo);
	}
}
