package tech.adriano.hexagonal.service.adapter.persistence;

import tech.adriano.hexagonal.service.core.domain.entity.ManagedId;
import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.domain.valueobject.Name;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryImplTest {
	
	@Test
	void simpleUnitTest() {
		User user = new User(ManagedId.fromString("id"), Name.builder().build() );
		
		assertThat(user).isNotNull();
	}
}
