package tech.adriano.hexagonal.service.adapter.messaging.message;

/**
 * This event is triggered when a user is created
 */

//@activemq
public class UserCreatedMessage {
	
	public String headers;
	public String payload;
	
	
	public UserCreatedMessage() {
	
	}
}
