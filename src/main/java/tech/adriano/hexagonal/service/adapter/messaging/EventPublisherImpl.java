package tech.adriano.hexagonal.service.adapter.messaging;

import tech.adriano.hexagonal.service.adapter.messaging.mapper.EventToUserCreatedMessage;
import tech.adriano.hexagonal.service.adapter.messaging.message.UserCreatedMessage;
import tech.adriano.hexagonal.service.core.domain.event.Event;
import tech.adriano.hexagonal.service.core.usecase.port.EventPublisher;

public class EventPublisherImpl implements EventPublisher {
	
	private final EventToUserCreatedMessage eventToUserCreatedMessage;
	
	
	public EventPublisherImpl(EventToUserCreatedMessage eventToUserCreatedMessage) {
		this.eventToUserCreatedMessage = eventToUserCreatedMessage;
	}
	
	
	@Override
	public boolean publish(Event event) {
		UserCreatedMessage userCreatedMessage = eventToUserCreatedMessage.mapToMessage(event);
		
		//MessagingSystem.publish(userCreatedMessage) <= the library is in charge publish the message payload in the message broker
		
		return true;
	}
}
