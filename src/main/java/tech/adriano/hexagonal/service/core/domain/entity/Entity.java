package tech.adriano.hexagonal.service.core.domain.entity;

public abstract class Entity {
	private ManagedId id;
	
	public Entity(ManagedId managedId) {
		this.id = managedId;
	}
	
	public ManagedId getId() {
		return id;
	}
}
