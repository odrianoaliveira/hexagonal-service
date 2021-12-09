package tech.adriano.hexagonal.service.core.domain.entity;

import java.util.UUID;

public class ManagedId {
	
	private final String id;
	
	
	public static ManagedId fromString(String id) {
		return new ManagedId(id);
	}
	
	
	public static ManagedId generate() {
		return new ManagedId(UUID.randomUUID().toString());
	}
	
	
	public String getId() {
		return id;
	}
	
	
	private ManagedId(String id) {
		this.id = id;
	}
}
