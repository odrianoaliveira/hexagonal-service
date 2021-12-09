package tech.adriano.hexagonal.service.adapter.messaging;

import tech.adriano.hexagonal.service.adapter.messaging.mapper.EventToUserCreatedMessage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventPublisherImplTest {
	
	@Test
	void simpleIntegrationTest() {
		EventPublisherImpl publisher = new EventPublisherImpl(new EventToUserCreatedMessage());
		assertThat(publisher).isNotNull();
	}
}
