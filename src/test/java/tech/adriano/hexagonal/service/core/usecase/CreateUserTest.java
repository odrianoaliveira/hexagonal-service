package tech.adriano.hexagonal.service.core.usecase;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateUserTest {
	
	@Test
	void secondUnitTest() {
		CreateUser createUser = new CreateUser(null, null);
		
		assertThat(createUser).isNotNull();
	}
}
