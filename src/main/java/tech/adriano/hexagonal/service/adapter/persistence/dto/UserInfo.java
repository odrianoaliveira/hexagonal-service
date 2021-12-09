package tech.adriano.hexagonal.service.adapter.persistence.dto;

import tech.adriano.hexagonal.service.core.domain.entity.ManagedId;

/**
 * This class is a record(DAO/DTO/POJO, not a Business Entity)
 * <p>
 * It exists to keep the Single-responsibility principle and hexagonal architecture,
 * if we need to change our database or the persistence framework we should change only this POJO and not our core domain.
 */
public final class UserInfo {
	
	public final String id;
	public final String firstName;
	public final String lastName;
	
	
	public UserInfo(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public ManagedId getManagedId() {
		return ManagedId.fromString(id);
	}
	
	
	public static UserInfoBuilder builder() {
		return new UserInfoBuilder();
	}
	
	
	public static class UserInfoBuilder {
		
		public String id;
		public String firstName;
		public String lastName;
		
		
		public UserInfoBuilder id(String id) {
			this.id = id;
			return this;
		}
		
		
		public UserInfoBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		
		public UserInfoBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		
		public UserInfo builder() {
			return new UserInfo(id, firstName, lastName);
		}
	}
}
