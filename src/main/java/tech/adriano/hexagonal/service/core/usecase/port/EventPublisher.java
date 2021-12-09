package tech.adriano.hexagonal.service.core.usecase.port;

import tech.adriano.hexagonal.service.core.domain.event.Event;

public interface EventPublisher {
	
	boolean publish(Event event);
	
}
