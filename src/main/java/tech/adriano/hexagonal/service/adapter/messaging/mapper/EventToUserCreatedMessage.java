package tech.adriano.hexagonal.service.adapter.messaging.mapper;

import tech.adriano.hexagonal.service.adapter.messaging.message.UserCreatedMessage;
import tech.adriano.hexagonal.service.adapter.common.mapper.EventToMessageMapper;
import tech.adriano.hexagonal.service.core.domain.event.Event;

public class EventToUserCreatedMessage implements EventToMessageMapper<Event, UserCreatedMessage> {
	
	@Override
	public Event mapToEvent(UserCreatedMessage source) {
		return null;
	}
	
	
	@Override
	public UserCreatedMessage mapToMessage(Event source) {
		return null;
	}
}
