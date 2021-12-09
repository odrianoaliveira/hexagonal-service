package tech.adriano.hexagonal.service.adapter.common.mapper;

public interface EventToMessageMapper<Event, Message> {
	
	Event mapToEvent(Message source);
	
	Message mapToMessage(Event source);
	
}
